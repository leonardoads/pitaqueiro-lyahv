package lp2.projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Class CarregaEstabelecimentos
 */

public class CarregaEstabelecimentos {
	private static String arquivo = "Estabelecimentos.data";
	
	private static String caminhoArquivo = "src" + File.separator + "media"+ File.separator;
		
	//
	// Methods
	//
	// Gets and Sets

	public static String getCaminhoArquivo() {
		return caminhoArquivo;
	}
	
	public static void setCaminhoArquivo(String caminhoArquivo) {
		CarregaEstabelecimentos.caminhoArquivo = caminhoArquivo;
	}
	
	public static void setArquivo(String arquivo) {
		CarregaEstabelecimentos.arquivo = arquivo;
	}

	public static String getArquivo() {
		return arquivo;
	}
	
	/**
	 * @return ListaDeEstabelecimentos
	 */
	public static List<Estabelecimento> carregaEstabelecimentos(String arquivo){
		String[] linha;

		try {
			
			BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo+arquivo));
			while(leitor.ready()){
				linha = leitor.readLine().split(";");
				try{
					TiposDeAlmocos tipo_almoco;

					for (int i = 0; i < TiposDeAlmocos.values().length; i++) {
						if(linha[2].equalsIgnoreCase(TiposDeAlmocos.values()[i].getNome())){
							String nome = linha[0];
							
							String endereco = linha[1];
							
							tipo_almoco = TiposDeAlmocos.values()[i];
							
							Estabelecimento estabelecimento = new Estabelecimento(nome, endereco,tipo_almoco);
							//System.out.println(estabelecimento);
							ListaDeEstabelecimentos.adiciona(estabelecimento);
						}
					}

				}catch (Exception e) {
					//System.out.println("arquivo em formatacao invalida");
				}
			}

		} catch (IOException e) {
			System.out.println("nao carregou");
		}
		return ListaDeEstabelecimentos.getListaDeEstabelecimentos();
	}
	public static void main(String[] args) {
		System.out.println(carregaEstabelecimentos("lista_estabelecimentos_projeto_lp2.csv"));
	}

}
