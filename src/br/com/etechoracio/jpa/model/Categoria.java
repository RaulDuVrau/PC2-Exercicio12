package br.com.etechoracio.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CATEGORIA")
public class Categoria {

	@Id
	@GeneratedValue
	@JoinColumn(name = "ID_CATEGORIA")
	private Long id;
	private String descricao;

}
