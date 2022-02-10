package com.projects.basictodo.services;

import java.util.List;

import com.projects.basictodo.models.Tarea;

public interface TareaService {

	public List<Tarea> findAllTareas();
	
	public void saveTareas(Tarea tarea);
	
	public void updateDescripcionTarea(Long idTarea, String descripcion);
	
	public void confirmEstadoTarea(Long idTarea, boolean flg_estado);
	
	public void deleteTareaByID(Long idTarea);
	
}
