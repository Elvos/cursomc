package com.example.demo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria catum = new Categoria(1, "informática");
		Categoria catdois = new Categoria(2, "escritório");
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(catum);
		lista.add(catdois);
		return lista;
	}

}
