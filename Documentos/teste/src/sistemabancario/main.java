package sistemabancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	
	static GerenciadoraClientes gerClientes;
	static GerenciadoraContas gerontas;

	public static void main(String[] args) {
		
		inicializaSistemaBancario();
		
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		
		while(continua) {
			printMenu();
			
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite ID do cliente:");
			int idCliente = sc.nextInt();
			Cliente cliente = gerClientes;pesquisaCliente(idCliente);
			if (cliente !=null) {
				System.out.println(cliente.toString());
			} else {
				System.out.println("Cliente não encontrado");
			}
			break;
			
		//Consultar por uma conta
		
		case 2:
			System.out.println("Digite o ID da conta");
		int inDconta = sc.nextInt();
		ContaCorrente conta = gerContas.pesquisaConta(idConta);
		if (conta != null) {
			System.out.println(conta.toString());
		} else {
			System.out.println("Conta não encontrada!");
		}
		break;
		
		//Sair 
		
		Case 3:
			continua = false;
		System.out.println("Sistema Encerrado!");
		break;
			}
	}

	
}

	private static void printMenu() {
		System.out.println("O que vc deseja? \n");
		System.out.println("1) Consultar por um cliente");
		System.out.println("2) Consultar por uma conta");
		System.out.println("3) Sair");
		System.out.println();
	}
	
	private static void inicializaSistemaBancario() {
		List<ContaCorrente> contaDoBanco = new ArrayList<>();
		List<Cliente>clientesDoBanco = new ArrayList<>();
		
		ContaCorrente conta01 = new ContaCorrente(1, 0, true);
		ContaCorrente conta02 = new ContaCorrente(1, 0, true);
		contaDoBanco.add(conta01);
		contaDoBanco.add(conta02);
		
		Cliente cliente01 = new Cliente(1, "Jose", 30, "jose@gmail.com", conta01.getId(), true);
		Cliente cliente02 = new Cliente(2, "Maria", 35, "maria@gmail.com", conta02.getId(), true);
		
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		gerContas = new GerenciadoraContas(contasDoBanco);
	
	}
	
}
