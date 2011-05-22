package lp2.projeto;

import java.util.*;

/**
 * Class ListaDePreferencias
 */
public class ListaDePreferencias {

	private List<Preferencias> listaDePreferencias;
	private Preferencias[] preferencias = Preferencias.values();

	public ListaDePreferencias() {
		this.listaDePreferencias = new ArrayList<Preferencias>();
	}

	/**
	 * Set the value of listaDePreferecias
	 * 
	 * @param newVar
	 *            the new value of listaDePreferecias
	 */
	public void setListaDePreferecias(List<Preferencias> listaDePreferecias) {
		this.listaDePreferencias = listaDePreferecias;
	}

	/**
	 * Get the value of listaDePreferecias
	 * 
	 * @return the value of listaDePreferecias
	 */
	public List<Preferencias> getListaDePreferecias() {
		return listaDePreferencias;
	}

	public void adicionaPreferencia(String nomePrefencia) {
		for (int i = 0; i < preferencias.length; i++) {
			if(preferencias[i].getNome().equals(nomePrefencia)){
				listaDePreferencias.add(preferencias[i]);
			}
		}
	}
}
