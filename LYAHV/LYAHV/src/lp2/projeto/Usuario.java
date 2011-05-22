package lp2.projeto;

import java.util.Iterator;

/**
 * Class Usuario
 */
public class Usuario {

	private String nome;
	private ListaDePreferencias preferencias;

	public Usuario(String nome, ListaDePreferencias preferencias) {
	};

	/**
	 * Set the value of nome
	 * 
	 * @param newVar
	 *            the new value of nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Get the value of nome
	 * 
	 * @return the value of nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set the value of preferencias
	 * 
	 * @param newVar
	 *            the new value of preferencias
	 */
	public void setPreferencias(ListaDePreferencias preferencias) {
		this.preferencias = preferencias;
	}

	/**
	 * Get the value of preferencias
	 * 
	 * @return the value of preferencias
	 */
	public ListaDePreferencias getPreferencias() {
		return preferencias;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String prefere = "";
		for (Iterator<Preferencias> iterator = preferencias.getListaDePreferecias().iterator(); iterator.hasNext();) {
			Preferencias type = (Preferencias) iterator.next();
			prefere += ";"+type.getValue()+" : "+type.getNome();
			
		}
		return nome + ";" + prefere;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}

	
	
}