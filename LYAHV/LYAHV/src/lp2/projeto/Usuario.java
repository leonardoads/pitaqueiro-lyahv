package lp2.projeto;

/**
 * Class Usuario
 */
public class Usuario {

	private String nome;
	private ListaDePreferencias preferencias;

	public Usuario(String nome, ListaDePreferencias preferencias) {
		this.nome = nome;
		this.preferencias = preferencias;
	};

	
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

	@Override
	public String toString() {
		return "Nome = " + nome + " ,Preferencias = " + preferencias;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((preferencias == null) ? 0 : preferencias.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		if (preferencias == null) {
			if (other.preferencias != null) {
				return false;
			}
		} else if (!preferencias.equals(other.preferencias)) {
			return false;
		}
		return true;
	}

//	 public static void main(String[] args) {
//	 ListaDePreferencias preferencia = new ListaDePreferencias();
//	 preferencia.adicionaPreferencia(" Detesto");
//	 preferencia.adicionaPreferencia(" Detesto");
//
//	 System.out.println(preferencia);
//	 Usuario us = new Usuario("a", preferencia);
//	 System.out.println(us);
//	 }

	public void adiciona(String nomePreferencia) {
		preferencias.adicionaPreferencia(nomePreferencia);

	}
}