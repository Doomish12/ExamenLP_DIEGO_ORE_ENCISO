package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Empleado;

public interface IempleadoService {

    public List<Empleado>listar();
    public int save(Empleado e);
  
}
