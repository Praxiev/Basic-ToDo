package com.projects.basictodo.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.projects.basictodo.models.Tarea;

@Mapper
public interface TareaMapper {

	public List<Tarea> findAll();
	
	public void insertTarea(Tarea tarea);
	
	public void updateTarea(@Param("idTarea") Long idTarea, @Param("descripcion") String descripcion);
	
	public void confirmTarea(@Param("idTarea") Long idTarea, @Param("flg_estado") boolean flg_estado);
	
	public void deleteTarea(@Param("idTarea") Long idTarea);
}
