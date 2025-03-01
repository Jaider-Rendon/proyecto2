package com.example.demo.controlador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.administrador;
import com.example.demo.modelo.usuario;
import com.example.demo.repositorio.administradorRepositorio;

@RestController
@RequestMapping("/login/admin")

public class loginAdminControlador {

	@Autowired 
	private administradorRepositorio repositorio2;
	
	
	@GetMapping("/login")
	public List<Object> loginAdmin(@RequestParam String usuario1, Long clavead1 ){
		 List<Object> resultados = new LinkedList<>();
		    List<administrador> ad = this.repositorio2.findAll(); 
		    boolean adminEncontrado = false;
		    for(int i=0;i<ad.size();i++) {
		    	String usuario= ad.get(i).getUsuario();
		    	Long clavead= ad.get(i).getClavead();
		    	
		    	 if (usuario.equals(usuario1)) {
		            adminEncontrado = true; 

		           
		             if (clavead.equals(clavead1)) {
		                 resultados.add("Bienvenido administrador");
		                 return resultados; 
		             } else {
		                 resultados.add("Credenciales incorrectas, intentalo nuevamente");
		                 return resultados; 
		             }
		         }
		     }
		     return resultados;	
	
	}
	
	
	
	
	
	
}
