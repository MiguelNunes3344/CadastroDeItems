package aula13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do cliente");
		String nomeCliente = sc.nextLine();
		System.out.println("Email");
		String emailCliente = sc.nextLine();
		System.out.println("Aniversario (DD/MM/YY)");
		String aniversarioCliente = sc.nextLine();
		Clients cliente = new Clients(nomeCliente,emailCliente,LocalDate.parse(aniversarioCliente, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Qual o status do processo?");
		String process = sc.nextLine();
		OrderStatus os = OrderStatus.valueOf(process);
		System.out.println("Quantos items para essa ordem?");
		int n = sc.nextInt();
		LocalDateTime data = LocalDateTime.now();
		Order order = new Order(data,os);
		for (int i = 0; i<n;i++) {
			System.out.println("Dados do item#" + i);
			System.out.println("Nome do Produto");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.println("Preço do Produto");
			Double precoDoProduto = sc.nextDouble();
			System.out.println("Quantidade");
			int qtdProduto = sc.nextInt();
			Product produto = new Product(nomeDoProduto, precoDoProduto);
			OrderItem or01 = new OrderItem(qtdProduto,precoDoProduto,produto);
			order.addItem(or01);
		}
		
		
		System.out.println("--SUMÁRIO DO PEDIDO--");
		System.out.println("Momento do pedido: " + data.format(fmt02));
		System.out.println("Status do pedido: " + os);
		System.out.println("Cliente " + cliente.getName() +" "+ fmt01.format(cliente.getBirthDay()) + " - " + cliente.getEmail());
		System.out.println(order);
		System.out.println("Preço Total $"+ order.total());
		
		
		
		
	}

}
