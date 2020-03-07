package com.stefanini.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_perfil")
public class Perfil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_SEQ_PERFIL")
    private Long id;
	
    @Column(name = "NO_PERFIL")
    private String nome;

    @Column(name = "DS_PERFIL")
    private String descricao;

    @Column(name = "DT_HORA_INCLUSAO")
    private LocalDate dt_inclusao;

    @Column(name = "DT_HORA_ALTERACAO")
    private LocalDate dt_alteracao;
    
    @ManyToMany
    private Set<Pessoa> pessoas;

    /**
	 * Construtor da Classe, Obrigando receber todos os parametros
	 * @param nome
	 * @param descricao
	 * @param dt_inclusao
	 * @param dt_alteracao
	 */
	public Perfil(@NotNull String nome, @NotNull String descricao, @NotNull LocalDate dt_inclusao, @NotNull LocalDate dt_alteracao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dt_inclusao = dt_inclusao;
		this.dt_alteracao = dt_alteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDtInclusao() {
		return dt_inclusao;
	}

	public void setDtInclusao(LocalDate dt_inclusao) {
		this.dt_inclusao = dt_inclusao;
	}

	public LocalDate getDtAlteracao() {
		return dt_alteracao;
	}

	public void setDtAlteracao(LocalDate dt_alteracao) {
		this.dt_alteracao = dt_alteracao;
	}
    
}
