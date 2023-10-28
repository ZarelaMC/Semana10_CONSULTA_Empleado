package com.empresa.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Empleado;
import com.empresa.service.EmpleadoService;

@Controller
public class EmpleadoConsultaController {
	/********************** SEMANA 10 *********************/
	@GetMapping("/verConsultaEmpleado")
	public String verInicio() {
		return "consultaEmpleado"; //Acciòn con la que se va a mostrar, es decir, al ejecuarse la ruta se va a mostrar en JSP por eso se pone el nombre del JSP que se va a ejecutar
	}
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/consultaEmpleado")
	@ResponseBody
	public List<Empleado> listaEmpleado(int estado){
		List<Empleado> lstSalida = empleadoService.listaEmpleadoConsulta(estado);
		return lstSalida;
	}
}
