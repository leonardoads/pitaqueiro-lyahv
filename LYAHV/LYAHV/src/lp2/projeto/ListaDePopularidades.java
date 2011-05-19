package lp2.projeto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Class ListaDePopularidades
 */
public class ListaDePopularidades {

	private Map<Integer, List<Estabelecimento>> mapaPopularidade = new HashMap<Integer, List<Estabelecimento>>();

	/**
	 * Set the value of mapaPopularidade
	 * 
	 * @param newVar
	 *            the new value of mapaPopularidade
	 */
	private void setMapaPopularidade(HashMap mapaPopularidade) {
		this.mapaPopularidade = mapaPopularidade;
	}

	/**
	 * Get the value of mapaPopularidade
	 * 
	 * @return the value of mapaPopularidade
	 */
	private Map getMapaPopularidade() {
		return mapaPopularidade;
	}

	/**
	 * @param mapEstabelecimentosOpnioes
	 */
	public void gerarMapa(MapaEstabelecimentosPreferencias mapaEstabelecimentosPreferencias) {
		int popularidade = 0;
		
		for (Estabelecimento estabelecimento: mapaEstabelecimentosPreferencias.getMapa().keySet()) {
			Iterator<Estabelecimento> it = mapaEstabelecimentosPreferencias.getMapa().get(estabelecimento).iterator();
			while (it.hasNext()) {
				
			}
			popularidade = 
			
			
			if (mapaEstabelecimentosPreferencias.getMapa().) {
				
			}
		}
			
			
		
	}

	/**
	 * @return String
	 */
	public String exibirListaPopularidade() {
		return null;
	}

}