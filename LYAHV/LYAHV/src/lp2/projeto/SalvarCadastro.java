/**
 * 
 */
package lp2.projeto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author leonardo
 * 
 */
public class SalvarCadastro {
	public static boolean salvaCadastro(Cadastro cadastro) {
		if (ListaUsuarios.adicionaUsuario(cadastro.getUsuario()).equals(cadastro.getUsuario())){
			return true;
			}
		return false;
	}
	public static boolean salvaCadastro(Cadastro cadastro, boolean bool)
			throws IOException {
		FileWriter file = null;
		BufferedWriter buffer;
		String data = "";
		String hour = "";
		GregorianCalendar calendar = new GregorianCalendar();

		if (bool) {
			try {
				file = new FileWriter(CarregarPerfis.getCaminhoArquivo()
						+ "opinioes-dos-usuarios-v2.data", true);
				buffer = new BufferedWriter(file);

				data += calendar.get(Calendar.DATE) + "/"
						+ calendar.get(Calendar.MONTH) + "/"
						+ calendar.get(Calendar.YEAR);

				hour += calendar.get(Calendar.HOUR) + ":"
						+ calendar.get(Calendar.MINUTE) + ":"
						+ calendar.get(Calendar.SECOND);

				// Save new Cadastro in file
				buffer.append(data + " " + hour + ";"
						+ cadastro.getUsuario().toString());

				// Save new cadastro in ListaDeUsuarios
				salvaCadastro(cadastro);

				file.close();
				return true;
			} catch (Exception e) {
				return false;
			} finally {
				file.close();
			}

		}
		return false;
	}
}
