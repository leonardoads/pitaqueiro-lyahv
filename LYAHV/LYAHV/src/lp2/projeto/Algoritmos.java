package lp2.projeto;

import java.util.*;

/**
 * Class Algoritimos
 */
public class Algoritmos {

	//
	// Fields
	//

	//
	// Constructors
	//
	public Algoritmos() {
	};

	//
	// Methods
	//

	//
	// Accessor methods
	//

	//
	// Other methods
	//

	/**
	 * @param mapaEstabelecimentosOpinioes
	 * @return
	 */
	public List<Estabelecimento> popularidadeGlobal() {
		List<Estabelecimento> estabelecimentos = new ArrayList<Estabelecimento>();
		Set popularidades = ListaDePopularidades.getMapaPopularidade().keySet();

		Iterator it = popularidades.iterator();
		int i = 0;
		while (it.hasNext()) {
			if (i == 0) {

			}
			i++;
		}
		return estabelecimentos;
	}

	/**
	 * @return List<Estabelecimento>
	 * @param mapaEstabelecimentosOpinioes
	 */
	public List<Estabelecimento> personalizado(
			MapaEstabelecimentosPreferencias mapaEstabelecimentosOpinioes) {
		return null;
	}

	public static void main(String[] args) {
		CarregaEstabelecimentos.carregaEstabelecimentos("lista_estabelecimentos_projeto_lp2.csv");
		
		ListaDePopularidades.gerarMapa(MapaEstabelecimentosPreferencias.transformaEmMapa());
		
		System.out.println(ListaDePopularidades.getMapaPopularidade().toString());
		
		
	}
}
