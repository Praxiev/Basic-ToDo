package com.projects.basictodo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.basictodo.models.Tarea;
import com.projects.basictodo.services.TareaService;

@RestController
@SpringBootApplication
@RequestMapping("/rest")
public class TareaController {
	
	@Autowired
	private TareaService tareaService;
	
	@RequestMapping(value = "/findAllTareas", method = RequestMethod.GET)
	public List<Tarea> findAllTareas() {
		List<Tarea> list = tareaService.findAllTareas();
		return list;
	}
	
	@RequestMapping(value = "/saveTarea", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> saveTarea(@RequestBody Tarea tarea) {
		ResponseEntity<?> respuesta;
		try {
			tareaService.saveTareas(tarea);
			respuesta = new ResponseEntity<>("OK.", HttpStatus.OK);
		}catch(Exception ex) {
			respuesta = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return respuesta;
	}
	
	@RequestMapping(value = "/updateDescripcionTarea", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> updateDescripcionTarea(@RequestBody Tarea tarea) {
		ResponseEntity<?> respuesta;
		try {
			tareaService.updateDescripcionTarea(tarea.getIdTarea(), tarea.getDescripcion());
			respuesta = new ResponseEntity<>("OK.", HttpStatus.OK);
		}catch(Exception ex) {
			respuesta = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return respuesta;
	}
	
	@RequestMapping(value = "/confirmEstadoTarea", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> confirmEstadoTarea(@RequestBody Tarea tarea) {
		ResponseEntity<?> respuesta;
		try {
			tareaService.confirmEstadoTarea(tarea.getIdTarea(), tarea.isFlg_estado());
			respuesta = new ResponseEntity<>("OK.", HttpStatus.OK);
		}catch(Exception ex) {
			respuesta = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return respuesta;
	}
	
	@RequestMapping(value = "/deleteTareaByID", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> deleteTareaByID(@RequestBody Tarea tarea) {
		ResponseEntity<?> respuesta;
		try {
			tareaService.deleteTareaByID(tarea.getIdTarea());
			respuesta = new ResponseEntity<>("OK.", HttpStatus.OK);
		}catch(Exception ex) {
			respuesta = new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return respuesta;
	}
	
}
