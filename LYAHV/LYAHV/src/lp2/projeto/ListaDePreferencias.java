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
//		System.out.println(preferencias.length);
		for (int i = 0; i < preferencias.length; i++) {
			
			if(preferencias[i].getNome().equals(nomePrefencia)){
				listaDePreferencias.add(preferencias[i]);
			}
		}
	
	}
	@Override
	public String toString() {
		return listaDePreferencias.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((listaDePreferencias == null) ? 0 : listaDePreferencias
						.hashCode());
		result = prime * result + Arrays.hashCode(preferencias);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ListaDePreferencias)) {
			return false;
		}
		ListaDePreferencias other = (ListaDePreferencias) obj;
		if (listaDePreferencias == null) {
			if (other.listaDePreferencias != null) {
				return false;
			}
		} else if (!listaDePreferencias.equals(other.listaDePreferencias)) {
			return false;
		}
		if (!Arrays.equals(preferencias, other.preferencias)) {
			return false;
		}
		return true;
	}

}
