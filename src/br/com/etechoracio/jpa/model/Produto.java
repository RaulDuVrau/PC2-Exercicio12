package br.com.etechoracio.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUTO")
public class Produto {

	@Id
	@GeneratedValue
	@JoinColumn(name = "ID_PRODUTO")
	@ManyToOne
	private Long id;
	private String nome;
	private double preco;
	private Categoria categoria;

}
