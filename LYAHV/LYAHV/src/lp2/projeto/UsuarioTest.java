package lp2.projeto;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import sun.security.util.Cache.EqualByteArray;

public class UsuarioTest {

	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	@Before
	public void criaUsuario() {
		ListaDePreferencias preferencia1 = new ListaDePreferencias();
		preferencia1.adicionaPreferencia(" Detesto");
		preferencia1.adicionaPreferencia(" Acho ruim");
		preferencia1.adicionaPreferencia(" Não conheço");
		usuario1 = new Usuario("Leonardo", preferencia1);

		ListaDePreferencias preferencia2 = new ListaDePreferencias();
		preferencia2.adicionaPreferencia(" Detesto");
		preferencia2.adicionaPreferencia(" Acho ruim");
		preferencia2.adicionaPreferencia(" Não conheço");
		usuario2 = new Usuario("Hemã", preferencia2);

		ListaDePreferencias preferencia3 = new ListaDePreferencias();
		preferencia3.adicionaPreferencia(" Detesto");
		preferencia3.adicionaPreferencia(" Acho ruim");
		preferencia3.adicionaPreferencia(" Não conheço");
		usuario3 = new Usuario("André", preferencia3);
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNome() {
		Assert.assertEquals("Nome Diferente do Esperado", "Leonardo", usuario1
				.getNome());
		Assert.assertEquals("Nome Diferente do Esperado", "Hemã", usuario2
				.getNome());
		Assert.assertEquals("Nome Diferente do Esperado", "André", usuario3
				.getNome());
		// fail("Implementar os erros :)");

	}

	@Test
	public void testGetPreferencias() {
		// Testa se a saida do getPreferencia é realmente um tipo de enum de
		// preferencia
		Assert.assertEquals("Preferencia Diferente da Esperado",
				Preferencias.DETESTO, usuario1.getPreferencias()
						.getListaDePreferecias().get(0));
		Assert.assertEquals("Preferencia Diferente da Esperado",
				Preferencias.ACHO_RUIM, usuario1.getPreferencias()
						.getListaDePreferecias().get(1));
		Assert.assertEquals("Preferencia Diferente da Esperado",
				Preferencias.NAO_CONHECO, usuario1.getPreferencias()
						.getListaDePreferecias().get(2));

		// Testa se o valor a ser adicionado não for valido retorna uma
		// ListaDePreferencia vazia
		ListaDePreferencias listaDeTeste = new ListaDePreferencias();
		listaDeTeste.adicionaPreferencia("algo");
		listaDeTeste.adicionaPreferencia("Detesto");
		listaDeTeste.adicionaPreferencia("Muito ruin");
		usuario1.setPreferencias(listaDeTeste);

		Assert.assertEquals("Preferencia Diferente da Esperado",
				new ListaDePreferencias(), usuario1.getPreferencias());

		// Testa se aslguns dos valores a serem adicionado não forem validos
		// retorna uma ListaDePreferencia apenas com os valores validos
		usuario1.adiciona(" Não conheço");

		ListaDePreferencias teste = new ListaDePreferencias();
		teste.adicionaPreferencia(" Não conheço");
		Assert.assertEquals("Preferencia Diferente da Esperado", teste
				.getListaDePreferecias(), usuario1.getPreferencias()
				.getListaDePreferecias());
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}


	@Test
	public void testSetPreferencias() {
//		Testa que se a ListaDePreferencia a ser setada for vazia ela deve retornar um ListaDePreferencia vazia
		ListaDePreferencias newLista1 = new ListaDePreferencias();
		usuario1.setPreferencias(newLista1);
		
		Assert.assertEquals("Lista de Preferecia  Diferente da Esperado",
				new ListaDePreferencias(), usuario1.getPreferencias());

//		Testa o caso dos valores a serem adicionados forem todos em uma Formatação valida
		ListaDePreferencias newLista2 = new ListaDePreferencias();
		newLista2.adicionaPreferencia(" Detesto");
		newLista2.adicionaPreferencia(" Acho muito ruim");
		usuario2.setPreferencias(newLista2);
		
		Assert.assertEquals("Lista de Preferecia  Diferente da Esperado",
				newLista2, usuario2.getPreferencias());
		
//		Testa o caso em sao adicionados a lista valores invalidos e validos mas so devem ser aceito os validos
		ListaDePreferencias newLista3 = new ListaDePreferencias();
		newLista3.adicionaPreferencia(" Detesto");
		newLista3.adicionaPreferencia(" Acho muito ruim");
		newLista3.adicionaPreferencia("Acho muito ruim");
		newLista3.adicionaPreferencia("Detesto");
		newLista3.adicionaPreferencia(" ");
		usuario3.setPreferencias(newLista3);
		
		Assert.assertEquals("Lista de Preferecia  Diferente da Esperado",
				newLista2, usuario3.getPreferencias());
	
	
	}
	@Test
	public void testToString() {
		String saida1 =  "Nome = " + usuario1.getNome() + " ,Preferencias = " + usuario1.getPreferencias();
		System.out.println(saida1);
		System.out.println(usuario1);
		Assert.assertEquals("As inforamções do To string estao contrarias as esperadas",
				saida1, usuario1.toString());
		
		String saida2 =  "Nome = " + usuario2.getNome() + " ,Preferencias = " + usuario2.getPreferencias();
		System.out.println(saida2);
		System.out.println(usuario2);
		Assert.assertEquals("As inforamções do To string estao contrarias as esperadas",
				saida2, usuario2.toString());
		
	}

}
