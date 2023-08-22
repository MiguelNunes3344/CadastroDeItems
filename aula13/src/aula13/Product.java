package aula13;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private Double price;
	
	private List<String> nomesProduto = new ArrayList<>();
	
	public Product() {
		
	}
	
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String procurarNome(int index) {
		return nomesProduto.get(index);
	}
	public void percorrerNome() {
		for (String x: nomesProduto) {
			System.out.println(x);
		}
		
	}
	public void adicionarNomeDeProduto(String nome) {
		nomesProduto.add(nome);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}


	


	
	
	
}
