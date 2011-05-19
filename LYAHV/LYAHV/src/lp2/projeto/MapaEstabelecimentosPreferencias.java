package lp2.projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MapaEstabelecimentosPreferencias {

	private static Map< Estabelecimento, List<Preferencias> > mapaEstabelecimentosPreferencias = new HashMap<Estabelecimento, List<Preferencias> >();
	
	public Map transformaEmMapa(ListaDeEstabelecimentos listaDeEstabelecimentos, ListaUsuarios listaDeUsuarios) {
		for (Estabelecimento estabelecimento : listaDeEstabelecimentos.getListaDeEstabelacimentos()) {
			if (!mapaEstabelecimentosPreferencias.containsKey(estabelecimento)) {
				mapaEstabelecimentosPreferencias.put(estabelecimento, new ArrayList<Preferencias>());
			}
			for (Usuario usuario : listaDeUsuarios.getListaDeUsuarios()) {
				mapaEstabelecimentosPreferencias.get(estabelecimento).add(usuario.getPreferencia(estabelecimento));
			}
		}
		return mapaEstabelecimentosPreferencias;
	}

	public static Map<Estabelecimento, List<Preferencias>> getMapa() {
		return mapaEstabelecimentosPreferencias;
	}
}
