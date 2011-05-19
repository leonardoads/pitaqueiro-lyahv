package lp2.projeto;

import java.util.*;

/**
 * Class ListaDePreferencias
 */
public class ListaDePreferencias {

	private List<Preferencias> listaDePreferencias;

	public ListaDePreferencias() {
		this.listaDePreferencias = new ArrayList<Preferencias>();
	}

	/**
	 * Set the value of listaDePreferecias
	 * 
	 * @param newVar
	 *            the new value of listaDePreferecias
	 */
	private void setListaDePreferecias(List<Preferencias> listaDePreferecias) {
		this.listaDePreferencias = listaDePreferecias;
	}

	/**
	 * Get the value of listaDePreferecias
	 * 
	 * @return the value of listaDePreferecias
	 */
	private List<Preferencias> getListaDePreferecias() {
		return listaDePreferencias;
	}

}