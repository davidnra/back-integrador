package model;

import javax.xml.crypto.Data;

public class Pagamento {
	private static int count = 1;	
    private Integer id;
    private String evento;
    private String local;
    private Data data;
    private Double preco;
	
	
	public Pagamento(String evento, Double preco, Data data, String local) {
		this.id = count;
		this.evento = evento;
		this.preco = preco;
		this.local = local;
		this.data = data;
		Pagamento.count += 1;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEvento() {
		return evento;
	}
	
	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Data getData() {
		return data;
	}
	
	public void setdate(Data data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
		

	

}
