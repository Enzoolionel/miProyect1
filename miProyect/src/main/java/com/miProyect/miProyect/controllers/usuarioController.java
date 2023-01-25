package com.miProyect.miProyect.controllers;

import com.miProyect.miProyect.dao.UsuarioDao;
import com.miProyect.miProyect.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //indica que esa clase es un controlador de url

public class usuarioController {

  @Autowired
  private UsuarioDao usuariodao;

  @RequestMapping(value  = "user/{id}")
  public User prueba(){
    User usuario1 = new User();
    usuario1.setId(1L);
    usuario1.setNombre("Enzo");
    usuario1.setApellido("peralta");
    usuario1.setTelefono("42246992");
    usuario1.setEmail("enzoperalta@gmail.com");
    usuario1.setSalario("$200.000");
    return usuario1;
  }

  @RequestMapping(value = "users")
  public List<User> getUsuarios(){

    return usuariodao.getUsuarios();
  }
}
