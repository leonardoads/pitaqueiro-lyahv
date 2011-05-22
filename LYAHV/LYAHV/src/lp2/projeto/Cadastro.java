package lp2.projeto;

public class Cadastro {
	private Usuario usuario;

	private Cadastro(String nome, ListaDePreferencias listaDePreferencia) {
		usuario = new Usuario(nome, listaDePreferencia);
	}
	/**
	 * 
	 * @param nome a ser usado pelo usuario
	 * @param listaDePreferencia 
	 * @return
	 * 			the cadastro if it successfully performed and otherwise returns null
	 */
	public static Cadastro cadastrar(String nome, ListaDePreferencias listaDePreferencia){
		if(nome != null && !ListaUsuarios.getListaDeUsuarios().contains(nome)){
			System.out.println(nome+" "+ListaUsuarios.getListaDeUsuarios().contains(nome));
			Cadastro cadastro = new Cadastro(nome, listaDePreferencia);
			return cadastro;
		}
		return null;
		
	}
}
