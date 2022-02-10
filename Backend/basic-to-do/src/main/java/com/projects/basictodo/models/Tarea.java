package com.projects.basictodo.models;

import java.io.Serializable;

public class Tarea implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long idTarea;
	private String descripcion;
	private boolean flg_estado;
	
	public Tarea() {
		super();
	}
	
	public Tarea(String descripcion, boolean flg_estado) {
        super();
        this.descripcion = descripcion;
        this.flg_estado = flg_estado;
    }

	public Long getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isFlg_estado() {
		return flg_estado;
	}

	public void setFlg_estado(boolean flg_estado) {
		this.flg_estado = flg_estado;
	}

	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", descripcion=" + descripcion + ", flg_estado=" + flg_estado + "]";
	}
	
}
