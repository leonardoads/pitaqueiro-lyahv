package lp2.projeto;


public class Estabelecimento {

  private String nome = "null";
  private String endereco = "null";
  private TiposDeAlmocos tipoDeAlmoco;

  public Estabelecimento (String nome, String endereco, TiposDeAlmocos tipoDeAlmoco) {
	  this.nome = nome;
	  this.endereco = endereco;
	  this.tipoDeAlmoco = tipoDeAlmoco;
  }
 
  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
 
  public void setNome ( String nome ) {
    this.nome = nome;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
 
  public String getNome() {
    return nome;
  }

  /**
   * Set the value of endereco
   * @param newVar the new value of endereco
   */
  
  public void setEndereco ( String endereco ) {
    this.endereco = endereco;
  }

  /**
   * Get the value of endereco
   * @return the value of endereco
   */
  
  public String getEndereco () {
    return endereco;
  }

  /**
   * Set the value of tipoDeAlmoco
   * @param newVar the new value of tipoDeAlmoco
   */
  
  public void setTipoDeAlmocos ( TiposDeAlmocos tipoDeAlmoco ) {
    this.tipoDeAlmoco = tipoDeAlmoco;
  }

  /**
   * Get the value of tipoDeAlmoco
   * @return the value of tipoDeAlmoco
   */
  
  public TiposDeAlmocos getTipoDeAlmoco() {
    return tipoDeAlmoco;
  }

@Override
public String toString() {
	return "Dados do lugar:" +
			"\nNome:" + getNome()+
			"\nEndereco:" + getEndereco()+
			"\nTipo de Almoco:" + getTipoDeAlmoco();
}
}


