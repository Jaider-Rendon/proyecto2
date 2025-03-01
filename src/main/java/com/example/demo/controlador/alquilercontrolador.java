package com.example.demo.controlador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/actualizar")
	public List<Object> Actualizar(@RequestParam String placa) {
	    List<Object> alqA = new LinkedList<>();
	    List<alquiler> Ac = this.repositorio.findAll();

	    for (int i = 0; i < Ac.size(); i++) {
	        String Placa = Ac.get(i).getVehiculo().getPlaca();
	        if (Placa.equals(placa)) {
	            String estadO = Ac.get(i).getEstadoalqui();
	            Ac.get(i).setEstadoalqui("entregado");
	            this.repositorio.save(Ac.get(i));

	            String estado = Ac.get(i).getEstadoalqui();
	            String tipo = Ac.get(i).getVehiculo().getTipovehiculo();
	            alqA.add("Estado original: " + estadO);
	            alqA.add("Placa: " + Placa);
	            alqA.add("Estado: " + estado);
	            alqA.add("tipo: " + tipo);
	            return alqA;
	        } else {
	            alqA.add("No se encontraron vehículos relacionados con la placa: " + placa);
	        }
	    }
	    return alqA;
	}

}
