package com.example.demo.controlador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.alquiler;
import com.example.demo.repositorio.alquilerRepositorio;

@RestController
@RequestMapping("/ver/alquiler/")
public class alquilercontrolador {
	
	@Autowired
	private alquilerRepositorio repositorio;
	
	
	@GetMapping("/buscarNoEntregados")
	public List<Object>buscarNoEntregados(){
		List<Object> vehiculosNo = new LinkedList <>();
		List<alquiler> al = this.repositorio.findAll();
		String estadoAl="no entregado";
		for(int i=0;i<al.size();i++) {
			String EstadoAl=al.get(i).getEstadoalqui();
			if(EstadoAl.equals(estadoAl)) {
				String placa=al.get(i).getVehiculo().getPlaca();
				String rr=al.get(i).getUsuario().getNombre1();
				Long rrr=al.get(i).getUsuario().getnIdentificacion();
				
				vehiculosNo.add("Placa: "+placa);
				vehiculosNo.add("nombre: "+rr);
				vehiculosNo.add("cedula: "+rrr);
				return vehiculosNo;	
			}	
		}
		return vehiculosNo;		
	}

}
