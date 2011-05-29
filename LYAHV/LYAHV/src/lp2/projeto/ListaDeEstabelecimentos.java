package lp2.projeto;


import java.util.*;


/**
 * Class ListaDeEstabelecimentos
 */
public class ListaDeEstabelecimentos {

	public static List<Estabelecimento> listaDeEstabelecimentos = new ArrayList<Estabelecimento>(); 

	public ListaDeEstabelecimentos () { 
		listaDeEstabelecimentos = new ArrayList<Estabelecimento>(); 

	}

	public static void adiciona(Estabelecimento estabelecimento){

		listaDeEstabelecimentos.add(estabelecimento);
		//System.out.println("adicionado");
	}

	/**
	 * Set the value of listaDeEstabelecimentos
	 * @param newVar the new value of listaDeEstabelecimentos
	 */
	public static void setListaDeEstabelacimentos ( List<Estabelecimento> novaListaDeEstabelacimentos ) {
		listaDeEstabelecimentos = novaListaDeEstabelacimentos;
	}

	/**
	 * Get the value of listaDeEstabelecimentos
	 * @return the value of listaDeEstabelecimentos
	 */
	public static List<Estabelecimento> getListaDeEstabelecimentos ( ) {
		return listaDeEstabelecimentos;
	}

}
