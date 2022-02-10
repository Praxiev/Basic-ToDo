package com.projects.basictodo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.basictodo.mappers.TareaMapper;
import com.projects.basictodo.models.Tarea;
import com.projects.basictodo.services.TareaService;

@Service
public class TareaServiceImpl implements TareaService{

	@Autowired
	private TareaMapper tareaMapper;
	
	@Override
	public List<Tarea> findAllTareas() {
		List<Tarea> list = tareaMapper.findAll();
		return list;
	}

	@Override
	public void saveTareas(Tarea tarea) {
		tareaMapper.insertTarea(tarea);
	}

	@Override
	public void updateDescripcionTarea(Long idTarea, String descripcion) {
		tareaMapper.updateTarea(idTarea, descripcion);
	}

	@Override
	public void confirmEstadoTarea(Long idTarea, boolean flg_estado) {
		tareaMapper.confirmTarea(idTarea, flg_estado);
	}

	@Override
	public void deleteTareaByID(Long idTarea) {
		tareaMapper.deleteTarea(idTarea);
	}

}
