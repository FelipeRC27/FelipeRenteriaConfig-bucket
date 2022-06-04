package com.idat.FelipeRenteriaLavadoraRopa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.FelipeRenteriaLavadoraRopa.Modelo.Lavadora;
import com.idat.FelipeRenteriaLavadoraRopa.service.LavadoraService;

@Controller
@RequestMapping("lavadora/v1")
public class LavadoraController {

	@Autowired
	private LavadoraService service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Lavadora> listarLavadora(){
		return service.asignarRopaporLavadora();
	}
}
