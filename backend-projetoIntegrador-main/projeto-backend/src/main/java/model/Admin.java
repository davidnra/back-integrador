package model;

public class Admin {
	private Integer id;
	private String cnpj;
	private Boolean status;
	private Integer evento_id;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Integer getEvento_id() {
		return evento_id;
	}
	
	public void setEvento_id(Integer evento_id) {
		this.evento_id = evento_id;
	}
}
