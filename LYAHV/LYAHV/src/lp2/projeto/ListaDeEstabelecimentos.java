package lp2.projeto;


import java.util.*;


/**
 * Class ListaDeEstabelecimentos
 */
public class ListaDeEstabelecimentos {

  public List<Estabelecimento> listaDeEstabelacimentos;
  
  public ListaDeEstabelecimentos () { 
	 listaDeEstabelacimentos = new ArrayList<Estabelecimento>(); 
  }
  
  /**
   * Set the value of listaDeEstabelacimentos
   * @param newVar the new value of listaDeEstabelacimentos
   */
  public void setListaDeEstabelacimentos ( List<Estabelecimento> listaDeEstabelacimentos ) {
    this.listaDeEstabelacimentos = listaDeEstabelacimentos;
  }

  /**
   * Get the value of listaDeEstabelacimentos
   * @return the value of listaDeEstabelacimentos
   */
  public List<Estabelecimento> getListaDeEstabelacimentos ( ) {
    return listaDeEstabelacimentos;
  }
  
}