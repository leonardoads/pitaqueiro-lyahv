package lp2.projeto;


import java.util.*;


/**
 * Class Usuario
 */
public class Usuario {

  private String nome;
  private ListaDePreferencias preferencias;
  
  public Usuario (String nome, ListaDePreferencias preferencias) { };
  
  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  private void setNome ( String nome) {
    this.nome = nome;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  private String getNome() {
    return nome;
  }

  /**
   * Set the value of preferencias
   * @param newVar the new value of preferencias
   */
  private void setPreferencias( ListaDePreferencias preferencias ) {
    preferencias = preferencias;
  }

  /**
   * Get the value of preferencias
   * @return the value of preferencias
   */
  private ListaDePreferencias getPreferencias() {
    return preferencias;
  }

}