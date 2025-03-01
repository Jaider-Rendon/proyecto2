package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorio.loginUsuarioRepositorio;
import com.example.demo.repositorio.usuarioRepositorio;



@RestController
@RequestMapping("/login/usuario")

public class loginUsuarioControlador {

	@Autowired
	private loginUsuarioRepositorio repositorio;
	
	@Autowired 
	private usuarioRepositorio repositorio2;
	
	

	
	
	
	
	
	
	
	
	

}
