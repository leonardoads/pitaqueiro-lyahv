package lp2.projeto;

import java.util.*;

/**
 * Class Algoritimos
 */
public class Algoritmos {

	public Algoritmos() {};

	/**
	 * Calcula a popularidade global de um lugar para almoçar (restaurante,
	 * cantina, boteco) como a soma da opinião de todos os usuários sobre esse
	 * lugar. Os R lugares mais populares são recomendados para qualquer usuário
	 * independente das opiniões que ele já tenha.
	 * 
	 * @param quantidade
	 *            (R)
	 * @return List<Estabelecimento>: Uma lista ordenada de estabelecimentos por
	 *         popularidade global.
	 */
	public List<Estabelecimento> popularidadeGlobal(int quantidade) {
		List<Estabelecimento> estabelecimentosPopularidadeGlobal = new ArrayList<Estabelecimento>();
		Integer[] preferencias = (Integer[]) ListaDePopularidades
				.getMapaPopularidade().keySet().toArray();
		Arrays.sort(preferencias);
		for (Integer preferencia : preferencias) {
			for (Estabelecimento estabelecimento : ListaDePopularidades
					.getEstabelecimentos(preferencia)) {
				estabelecimentosPopularidadeGlobal.add(estabelecimento);
			}
		}
		return estabelecimentosPopularidadeGlobal;

	}

	/**
	 * Algoritmo personalizado que a partir de um dado usuario computa qual o
	 * usuário mais semelhante. A semelhança entre usuarios é feita pelo produto
	 * escalar das listas de preferencias de um usuário pelas do outro. Dadas as
	 * preferencias de A,B e C, as preferencias de A e C são mais parecidas que
	 * as de A e B, e que o produto escalar dos vetores dos gostos de A e C é um
	 * número maior que os de A e B.
	 * 
	 * @return List<Estabelecimento>
	 * @param usuario
	 */
	public List<Estabelecimento> personalizado(Usuario usuario, int quantidade) {

		Usuario usuarioSemelhante = null;
		List<Estabelecimento> estabelecimentosPersonalizado = new ArrayList<Estabelecimento>();
		List<Preferencias> preferenciasFinais = usuario.getPreferencias().getListaDePreferecias();
		
		do {
			preferenciasFinais = usuario.getPreferencias().getListaDePreferecias();
			int semelhanca = 0;
			
			for (Usuario user : ListaUsuarios.getListaDeUsuarios()) {
				
				if (!usuario.equals(user)) {
	
					int produtoEscalar = 0;
	
					for (int i = 0; i < usuario.getPreferencias()
							.getListaDePreferecias().size(); i++) {
	
						int preferenciaUsuario = usuario.getPreferencias()
								.getListaDePreferecias().get(i).getPreferencia();
						int preferenciaUser = user.getPreferencias()
								.getListaDePreferecias().get(i).getPreferencia();
	
						produtoEscalar += preferenciaUsuario * preferenciaUser;
					}
					
					if (usuarioSemelhante.equals(null)) {
						usuarioSemelhante = user;
						semelhanca = produtoEscalar;
					}
					
					if (produtoEscalar >= semelhanca) {
						usuarioSemelhante = user;
						semelhanca = produtoEscalar; 
					}
				}
			}
			
		}while (!verificaQtdMelhoresPreferencias(usuario, usuarioSemelhante, quantidade, preferenciasFinais));
		
		List<Integer> indices = new ArrayList<Integer>();
		
		do {
			
			Preferencias maiorPreferencia = preferenciasFinais.get(0);
			int indiceMaiorPreferencia = 0;
			
			for (int i = 1; i < preferenciasFinais.size(); i++) {
				
				if (preferenciasFinais.get(i).getPreferencia() > maiorPreferencia.getPreferencia() && !indices.contains(i)) {
					maiorPreferencia = preferenciasFinais.get(i);
					indiceMaiorPreferencia = i;
				}
				
			}
			
			indices.add(indiceMaiorPreferencia);
			estabelecimentosPersonalizado.add(ListaDeEstabelecimentos.getListaDeEstabelecimentos().get(indiceMaiorPreferencia));
			
		}while (estabelecimentosPersonalizado.size() != quantidade);
		
		return estabelecimentosPersonalizado;
	}

	private boolean verificaQtdMelhoresPreferencias(Usuario usuario1, Usuario usuario2, int quantidade, List<Preferencias> preferenciasFinais) {
		
		int qtdMelhoresPreferencias = 0;
		List<Preferencias> preferencias = usuario1.getPreferencias().getListaDePreferecias();
		
		for (int i = 0; i < preferencias.size(); i++) {
			
			int preferenciaU1 = preferencias.get(i).getPreferencia();
			int preferenciaU2 = usuario2.getPreferencias().getListaDePreferecias().get(i).getPreferencia();
			
			if (preferenciaU1 == 0 && preferenciaU2 > 0) {
				preferenciasFinais.remove(i);
				preferenciasFinais.add(i, usuario2.getPreferencias().getListaDePreferecias().get(i));
				qtdMelhoresPreferencias ++;
			}
		}
		return qtdMelhoresPreferencias == quantidade;
	}
}