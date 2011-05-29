package lp2.projeto;
/**
 * Enum de preferencias acerca dos estabelecimentos.
 *  
 * @author Hema Vidal
 *
 */
public enum Preferencias {
	NAO_CONHECO(" Não conheço", 0),
	DETESTO(" Detesto", -5),
	ACHO_MUITO_RUIM(" Acho muito ruim", -4),
	ACHO_BASTANTE_RUIM(" Acho bastante ruim", -3),
	ACHO_RUIM(" Acho ruim", -2), 
	ACHO_UM_POUCO_RUIM(" Acho um pouco ruim", -1), 
	NAO_E_RUIM(" Não é ruim", 1), 
	E_BONZINHO(" É bonzinho", 2), 
	BASTANTE_BOM(" Bastante bom", 3), 
	MUITO_BOM(" Muito bom", 4), 
	INCRIVEL_SENSASIONAL_IMPRESSIONANTE(" Incrível, sensacional, impressionante", 5);
	
	
	private int numero;
	private String nome;
	/**
	 * Contrutor para determinar a representação da preferencia em String
	 * e o numero(nota) que esta preferência representa.
	 * 
	 * @param nome
	 * @param numero
	 */
	Preferencias(String string, int numero) {
		this.numero = numero;
		this.nome = string;
	}
	
	/**
	 * Recupera a nota de uma dada preferencia.
	 * 
	 * @return
	 * 		int: nota de uma dada preferencia.
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Recupera a representação em string de uma dada preferencia.
	 * 
	 * @return
	 * 		String: representação em string de uma dada preferencia.
	 */
	public String getNome() {
		return nome;
	}
}