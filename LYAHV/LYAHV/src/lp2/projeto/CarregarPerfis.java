package lp2.projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * Class CarregarPerfis
 */
public class CarregarPerfis {

	// Fields
	private static FileReader file;

	private static String caminhoArquivo = "src" + File.separator + "media"
			+ File.separator;

	//
	// Methods
	//
	// Gets and Sets
	/**
	 * @return the caminhoArquivo
	 */
	public static String getCaminhoArquivo() {
		return caminhoArquivo;
	}

	/**
	 * @param caminhoArquivo
	 *            the caminhoArquivo to set
	 */
	public static void setCaminhoArquivo(String caminhoArquivo) {
		CarregarPerfis.caminhoArquivo = caminhoArquivo;
	}

	// Other Methods
	/**
	 * Read information at file and save users in ListaDeUsuarios
	 * 
	 * @throws IOException
	 */
	public static void carregaArquivo(String nomeArquivo) throws IOException {
		// Local fields
		BufferedReader bufferedRead;
		String nome;
		ListaDePreferencias preferencias = new ListaDePreferencias();
		String[] line;

		int contadorDeAnonimos = 0;

		try {
			file = new FileReader(caminhoArquivo + nomeArquivo);
			bufferedRead = new BufferedReader(file);

			// Prevents the program read the first line that contains the order
			// of information in the file
			bufferedRead.readLine();
			
			//Do read the file
			while (bufferedRead.ready()) {
				// System.out.println(bufferedRead.readLine());
				line = bufferedRead.readLine().split(";");
				
				//avoids that the name be null
				if (line[1].equals("")) {
					nome = "Anonimo" + contadorDeAnonimos;
					contadorDeAnonimos++;
				} else {
					nome = line[1];
				}
				
				for (int i = 2; i < line.length; i++) {
//					System.out.println(line[i]);
					preferencias.adicionaPreferencia(line[i].split(":")[1]);
				}
				
				// Generate cadastro and save in ListaDeUsuarios
				Cadastro c = new Cadastro(nome,
						preferencias);
				SalvarCadastro.salvaCadastro(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			file.close();
		}
	}

//	public static void main(String[] args) {
//
////		try {
////			// System.out.println(new File(caminhoArquivo+
////			// "opinioes-dos-usuarios-v2.data").getCanonicalFile());
////			carregaArquivo("opinioes-dos-usuarios-v2.data");
////			List<Usuario> a =  ListaUsuarios.getListaDeUsuarios();
////			for (Iterator iterator = ListaUsuarios.getListaDeUsuarios().iterator(); iterator.hasNext();) {
////				Usuario usuario = (Usuario) iterator.next();
////				System.out.println(usuario);
////			}
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		// carregaArquivo("opinioes-dos-usuarios-v2.data");
//	}
}