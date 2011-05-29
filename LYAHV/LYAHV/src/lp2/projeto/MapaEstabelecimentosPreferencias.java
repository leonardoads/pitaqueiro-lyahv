package lp2.projeto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa em forma de mapa uma lista de estabelecimentos e de uma lista de
 * usuarios, onde a chave é o estabelecimento e o valor é uma lista de
 * preferencias de cada usuario sobre a chave estabelecimento.
 * 
 * @param listaDeEstabelecimentos
 * @param listaDeUsuarios
 * @return Um mapa do tipo Map, onde a chave é o estabelecimento e o valor é uma
 *         lista de preferencias de cada usuario sobre a chave estabelecimento.
 */
public class MapaEstabelecimentosPreferencias {

	private static Map<Estabelecimento, List<Preferencias>> mapaEstabelecimentosPreferencias = new HashMap<Estabelecimento, List<Preferencias>>();

	/**
	 * Representa em forma de mapa uma lista de estabelecimentos e de uma lista
	 * de usuarios, onde a chave é o estabelecimento e o valor é uma lista de
	 * preferencias de cada usuario sobre a chave estabelecimento.
	 * 
	 * @param listaDeEstabelecimentos
	 * @param listaDeUsuarios
	 * @return Um mapa do tipo Map, onde a chave é o estabelecimento e o valor é
	 *         uma lista de preferencias de cada usuario sobre a chave
	 *         estabelecimento.
	 */
	public Map<Estabelecimento, List<Preferencias>> transformaEmMapa(
			ListaDeEstabelecimentos listaDeEstabelecimentos,
			ListaUsuarios listaDeUsuarios) {
		for (int i = 0; i < ListaDeEstabelecimentos
		.getListaDeEstabelecimentos().size(); i++) {

			Estabelecimento estabelecimento = ListaDeEstabelecimentos
			.getListaDeEstabelecimentos().get(i);

			if (!mapaEstabelecimentosPreferencias.containsKey(estabelecimento)) {
				mapaEstabelecimentosPreferencias.put(estabelecimento,
						new ArrayList<Preferencias>());
			}

			for (Usuario usuario : ListaUsuarios.getListaDeUsuarios()) {
				mapaEstabelecimentosPreferencias.get(estabelecimento).add(
						usuario.getPreferencias().getListaDePreferecias()
						.get(i));
			}
		}
		return mapaEstabelecimentosPreferencias;
	}

	public static Map<Estabelecimento, List<Preferencias>> transformaEmMapa(){
		//	System.out.println(ListaDeEstabelecimentos
		//		.getListaDeEstabelecimentos().size());
		for (int i = 0; i < ListaDeEstabelecimentos
		.getListaDeEstabelecimentos().size(); i++) {

			Estabelecimento estabelecimento = ListaDeEstabelecimentos
			.getListaDeEstabelecimentos().get(i);
			//		System.out.println(estabelecimento);
			//		System.out.println(estabelecimento);
			if (!mapaEstabelecimentosPreferencias.containsKey(estabelecimento)) {
				mapaEstabelecimentosPreferencias.put(estabelecimento,
						new ArrayList<Preferencias>());
			}


			for (Usuario usuario : ListaUsuarios.getListaDeUsuarios()) {
				mapaEstabelecimentosPreferencias.get(estabelecimento).add(
						usuario.getPreferencias().getListaDePreferecias().get(i));
			}
		}
		return mapaEstabelecimentosPreferencias;
	}


	/**
	 * Recupera o mapa onde a chave é o estabelecimento e o valor é uma lista de
	 * preferencias de cada usuario sobre a chave estabelecimento.
	 * 
	 * @return O mapa do tipo Map onde a chave é o estabelecimento e o valor é
	 *         uma lista de preferencias de cada usuario sobre a chave
	 *         estabelecimento.
	 */
	public static Map<Estabelecimento, List<Preferencias>> getMapa() {
		return mapaEstabelecimentosPreferencias;
	}
	public static void main(String[] args) throws IOException {
		CarregaEstabelecimentos.carregaEstabelecimentos("lista_estabelecimentos_projeto_lp2.csv");
		CarregarPerfis.carregaArquivo("opinioes-dos-usuarios-v2.data");
		MapaEstabelecimentosPreferencias.transformaEmMapa();
//		System.out.println(MapaEstabelecimentosPreferencias.getMapa());
//		for (java.util.Iterator<Usuario> iterator = ListaUsuarios.getListaDeUsuarios().iterator(); iterator.hasNext();) {
//			Usuario usuario = (Usuario) iterator.next();
//			System.out.println(usuario);
//		}
	}
}