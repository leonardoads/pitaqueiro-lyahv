package lp2.projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import sun.management.OperatingSystemImpl;

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
			bufferedRead.readLine();
			while (bufferedRead.ready()) {
				// System.out.println(bufferedRead.readLine());
				line = bufferedRead.readLine().split(";");
				if (line[1].equals("")) {
					nome = "Anonimo" + contadorDeAnonimos;
					contadorDeAnonimos++;
				} else {
					nome = line[1];
				}
				for (int i = 2; i < line.length; i++) {
					preferencias.adicionaPreferencia(line[i].split(":")[1]);
				}
				//Generate cadastro and save in ListaDeUsuarios
				System.out.println(nome);
				System.out.println(preferencias);
				SalvarCadastro.salvaCadastro(
						Cadastro.cadastrar(nome,preferencias)
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			file.close();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(new File(caminhoArquivo
				+ "opinioes-dos-usuarios-v1.csv").getCanonicalFile());
		carregaArquivo("opinioes-dos-usuarios-v2.data");
	}
}