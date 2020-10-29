package org.cd.bo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Component
@Entity(name="tipos_vinos")
public class Drink implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_vino;
	
	private String categoria;

	public int getId_vino() {
		return id_vino;
	}

	public void setId_vino(int id_vino) {
		this.id_vino = id_vino;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	
	
}



