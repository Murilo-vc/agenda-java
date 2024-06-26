package entities;

import java.util.List;

public class Agenda {

	private int idAgenda;
	private Usuario usuario;
	private String nomeAgenda;
	private String descricao;
	private List<Compromisso> compromissos;

	public Agenda(){
		this.usuario = new Usuario();
	}
	
	public Agenda(int idAgenda, Usuario usuario, String nomeAgenda, String descricao) {
		
		this.idAgenda = idAgenda;
		this.usuario = usuario;
		this.nomeAgenda = nomeAgenda;
		this.descricao = descricao;
		this.compromissos = null;
	}
	
	public Agenda(int idAgenda, Usuario usuario, String nomeAgenda, String descricao, List<Compromisso> compromissos) {
		
		this.idAgenda = idAgenda;
		this.usuario = usuario;
		this.nomeAgenda = nomeAgenda;
		this.descricao = descricao;
		this.compromissos = compromissos;
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Compromisso> getCompromissos() {
		return compromissos;
	}

	public void setCompromissos(List<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}
	
	public String toString() {
		
		return this.nomeAgenda;
	}
}
