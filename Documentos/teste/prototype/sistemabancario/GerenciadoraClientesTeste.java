package sistemabancario;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class GerenciadoraClientesTeste {
	
	/**Teste da funcionalidade de pesquisa de um cliente a partir do seu ID
	*@author Clayton Chagas
	*@date 30/08/2024
	*/
	
	@Test
	public void testPesquisaCliente() {
		//Criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Clayton", 48, "claytonchagas1@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(1, "Maria", 18, "mariachagas1@gmail.com", 2, true);
		
		//Inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerenciadoraClientes = new GerenciadoraClientes(clientesDoBanco);
		
		//execução do teste
        Cliente cliente = gerenciadoraClientes.pesquisaCliente(1);
		
		//avaliação do teste 
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("claytonchagas1@gmail.com"));
	}
} 

/**Teste da remoção de um cliente a partir de seu ID
*@author Clayton Chagas
*@date 30/08/2024
*/

@Test
public void testRemoveCliente() {
	/*=============== Montagem do cenario ============*/
	//Cirando alguns clientes
	Cliente cliente01 = new Cliente(1, "Clayton", 48, "claytonchagas1@gmail.com", 1, true);
	Cliente cliente02 = new Cliente(1, "Maria", 18, "mariachagas1@gmail.com", 2, true);
	
	//Inserindo os clientes criados na lista de clientes do banco
	List<Cliente> clienteDoBanco = new ArrayList<>();
	clienteDoBanco.add(cliente01);	
	clienteDoBanco.add(cliente02);
	
	GerenciadoraClientes gerClientes = new GerenciadoraClientes(clienteDoBanco);
	
	/*============== Fase 2: Execução do Teste ================*/
	boolean clienteRemovido = gerClientes.removeCliente(1);
	
	/*============== Fase 3: Verificação e analise ==============*/
	assertThat(clienteRemovido, is(true));
	assertThat(gerClientes.getClientesDoBanco().size().is(1));
	
	
}

}

