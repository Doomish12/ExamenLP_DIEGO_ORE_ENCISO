package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer>{
	
}
