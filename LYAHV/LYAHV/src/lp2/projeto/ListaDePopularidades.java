package lp2.projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class ListaDePopularidades
 */
public class ListaDePopularidades {

	private static Map<Integer, List<Estabelecimento>> mapaPopularidade = new HashMap<Integer, List<Estabelecimento>>();

	/**
	 * Set the value of mapaPopularidade
	 * 
	 * @param newVar
	 *            the new value of mapaPopularidade
	 */
	public void setMapaPopularidade(HashMap mapaPopularidade) {
		this.mapaPopularidade = mapaPopularidade;
	}

	/**
	 * Get the value of mapaPopularidade
	 * 
	 * @return the value of mapaPopularidade
	 */
	public static Map<Integer, List<Estabelecimento>> getMapaPopularidade() {
		return mapaPopularidade;
	}

	/**
	 * @param mapEstabelecimentosOpnioes
	 */
	public static void gerarMapa(Map<Estabelecimento, List<Preferencias>> map) {
		int popularidade = 0;
		MapaEstabelecimentosPreferencias.transformaEmMapa();
		for (Estabelecimento estabelecimento : MapaEstabelecimentosPreferencias
				.getMapa().keySet()) {
			System.out.println(MapaEstabelecimentosPreferencias
					.getMapa().values());
			System.out.println(MapaEstabelecimentosPreferencias
					.getMapa().get(estabelecimento));
			for (Preferencias preferencia : MapaEstabelecimentosPreferencias
					.getMapa().get(estabelecimento)) {
				popularidade += preferencia.getNumero();
				System.out.println(popularidade);
			}
			if (!mapaPopularidade.containsKey(popularidade)) {
				mapaPopularidade.put(popularidade,
						new ArrayList<Estabelecimento>());
			} else
				mapaPopularidade.get(popularidade).add(estabelecimento);
		}

	}

	/**
	 * @return String
	 */
	public String exibirListaPopularidade() {
		return null;
	}

	public static void main(String[] args) {
		CarregaEstabelecimentos
		.carregaEstabelecimentos("lista_estabelecimentos_projeto_lp2.csv");
		MapaEstabelecimentosPreferencias.transformaEmMapa();
		gerarMapa(MapaEstabelecimentosPreferencias.transformaEmMapa());
		System.out.println(getMapaPopularidade());

	}
}