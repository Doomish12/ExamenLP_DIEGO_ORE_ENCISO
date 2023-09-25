package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IempleadoService;
import com.crud.demo.interfaces.IEmpleado;
import com.crud.demo.modelo.Empleado;

@Service
public class EmpleadoService implements IempleadoService{
	
	@Autowired
	private IEmpleado data;
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)data.findAll();
	}

	@Override
	public int save(Empleado e) {
		int res=0;
		Empleado empleado=data.save(e);
		if(!empleado.equals(null)){
			res=1;
		}
		return res;
	}

	

}
