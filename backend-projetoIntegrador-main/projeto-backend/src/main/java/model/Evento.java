package model;

public class Evento {
	private Integer id;
	private String titulo;
	private String descricao;
	private String img_src;
	private Integer tipo;
	private Integer min_lotacao;
	private Integer max_lotacao;
	private Boolean status;
	private Integer min_idade;
	private String data_evento;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getImg_src() {
		return img_src;
	}
	
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	
	public Integer getTipo() {
		return tipo;
	}
	
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public Integer getMin_lotacao() {
		return min_lotacao;
	}
	
	public void setMin_lotacao(Integer min_lotacao) {
		this.min_lotacao = min_lotacao;
	}
	
	public Integer getMax_lotacao() {
		return max_lotacao;
	}
	
	public void setMax_lotacao(Integer max_lotacao) {
		this.max_lotacao = max_lotacao;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public Integer getMin_idade() {
		return min_idade;
	}
	
	public void setMin_idade(Integer min_idade) {
		this.min_idade = min_idade;
	}

	public String getData_evento() {
		return data_evento;
	}

	public void setData_evento(String data_evento) {
		this.data_evento = data_evento;
	}

}
