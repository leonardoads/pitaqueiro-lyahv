package lp2.projeto;


import java.util.*;


/**
 * Class Estabelecimento
 */
public class Estabelecimento {

  //
  // Fields
  //

  private String nome = "null";
  private String endereco = "null";
  private TiposDeAlmocos tipoDeAlmoco;
  
  //
  // Constructors
  //
  public Estabelecimento () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  private void setNome ( String newVar ) {
    nome = newVar;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  private String getNome ( ) {
    return nome;
  }

  /**
   * Set the value of endereco
   * @param newVar the new value of endereco
   */
  private void setEndereco ( String newVar ) {
    endereco = newVar;
  }

  /**
   * Get the value of endereco
   * @return the value of endereco
   */
  private String getEndereco ( ) {
    return endereco;
  }

  /**
   * Set the value of tipoDeAlmoco
   * @param newVar the new value of tipoDeAlmoco
   */
  private void setTipoDeAlmoco ( TiposDeAlmocos newVar ) {
    tipoDeAlmoco = newVar;
  }

  /**
   * Get the value of tipoDeAlmoco
   * @return the value of tipoDeAlmoco
   */
  private TiposDeAlmocos getTipoDeAlmoco ( ) {
    return tipoDeAlmoco;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getNome(  )
  {
  }


  /**
   * @return       String
   */
  public String getEndereco(  )
  {
  }


  /**
   * @return       TiposDeAlmocos
   */
  public TiposDeAlmocos getTipoDeAlmoco(  )
  {
  }


}