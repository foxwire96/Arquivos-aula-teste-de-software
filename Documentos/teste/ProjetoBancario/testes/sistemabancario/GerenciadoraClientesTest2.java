package sistemabancario;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest1 {
	
	@Test
	public void testPesquisaCliente(){
		
		//criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Clayton", 48, "claytonchagas1@gmail", 1, true);
		Cliente cliente02 = new Cliente(2, "Maria", 18, "mariachagas@gmail", 2, true);
		
		//inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//execução do teste
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		//avaliação do teste
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("claytonchagas1@gmail"));
		
	}
	/**
	 * Teste da remoção d eum cliente a partir de seu ID
	 *
	 * @author Matheus Viana
	 * @date 30/08/2024
	 */

	public void testeRemoveCliente(){
		/* ================== FASE 1 - Montagem do Cenário    ================ */
		//Criand alguns clientes
		Cliente cliente01 = new Cliente(1, "Clayton", 48, "claytonchagas1@gmail", 1, true);
		Cliente cliente02 = new Cliente(2, "Maria", 18, "mariachagas@gmail", 2, true);

		//Inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02;
		//
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);

		/* ================== FASE 2 - EXECUÇÃO DO TESTE     ================ */
		boolean clienteRemovido = gerClientes.removeCliente(1);

		/* ================== FASE 3 - Verificação e Análise ================ */
		assertThat(clienteRemovido, is(true));
		assertTrue(clienteRemovido);
		assertThat(gerClientes. getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(2));
}

}





