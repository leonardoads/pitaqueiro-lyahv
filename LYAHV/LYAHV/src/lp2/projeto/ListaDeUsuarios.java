package lp2.projeto;

import java.util.*;

/**
 * Class ListaUsuarios
 */
class ListaUsuarios {

	private static List<Usuario> listaDeUsuarios  = new ArrayList<Usuario>();

	public ListaUsuarios() {
	};

	/**
	 * Set the value of listaDeUsuarios
	 * 
	 * @param newVar
	 *            the new value of listaDeUsuarios
	 */
	public static void setListaDeUsuarios(List<Usuario> usuario) {
		listaDeUsuarios = usuario;
	}

	/**
	 * Get the value of listaDeUsuarios
	 * 
	 * @return the value of listaDeUsuarios
	 */
	public static List<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	//
	// Other methods
	//

	/**
	 * @return the Usuario if it is successfully added in the list, otherwise
	 *         returns null
	 * @param usuario
	 */
	public static Usuario adicionaUsuario(Usuario usuario) {
		if(listaDeUsuarios.add(usuario))
			return usuario;
		return null;
	}

	/**
	 * @return 
	 * 			the Usuario if it is successfully removed in the list, otherwise
	 *         returns null
	 * @param usuario
	 */
	public static Usuario removeUsuario(Usuario usuario) {
		if (listaDeUsuarios.remove(usuario)){
			return usuario;
		}
		return null;
	}

}