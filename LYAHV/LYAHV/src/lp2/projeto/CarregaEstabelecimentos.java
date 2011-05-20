package lp2.projeto;




import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class CarregaEstabelecimentos
 */

public class CarregaEstabelecimentos {

	private static List<String> lista = new ArrayList<String>();

	//
	// Fieldss
	//


	//
	// Constructors
	//
	public CarregaEstabelecimentos () {

		String caminhoArquivo = "/home/yuri/pitaqueiro-lyahv/LYAHV/LYAHV/src/media/lista_estabelecimentos_projeto_lp2.csv";
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
			while(leitor.ready()){
				lista.add(leitor.readLine());
			}
			lista.toString();

		} catch (IOException e) {
		}
	}
	
	public void lerEstabelecimentos(){
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	public static void main(String[] args) {
		CarregaEstabelecimentos file = new CarregaEstabelecimentos();
		file.lerEstabelecimentos();
		
		
	}




//
// Methods
//


//
// Accessor methods
//

//
// Other methods
//

/**
 * @return       ListaDeEstabelecimentos
 */
//  public static ListaDeEstabelecimentos carregaEstabelecimentos(  )
//  {
//  }


}