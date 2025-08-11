package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.LibroDto;
import com.example.demo.service.LibroService;

public class LibroController {

	public static void main(String[] args) {

		LibroService libroService = new LibroService();

		libroService.bienvenida();
		System.out.println();

		libroService.bienvenidaAutor("Camila");
		System.out.println();

		String mensajeParaLosLectores = libroService.mensajeLectores();
		System.out.println(mensajeParaLosLectores);
		System.out.println();

		int ResultadosumaPaginas = libroService.sumaPaginas(233, 345);
		System.out.println(ResultadosumaPaginas);
		System.out.println();

		LibroDto libro = libroService.crearLibro("el poder del ahora", "paulo londra", 245);
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		System.out.println(libro.getPaginas());
		libroService.llenarLista(libro);

		LibroDto libro2 = new LibroDto();

		libro2.setTitulo("el camino de los perdedores");
		libro2.setAutor("mauricio garces");
		libro2.setPaginas(234);

		System.out.println(libro2.getTitulo());
		System.out.println(libro2.getAutor());
		System.out.println(libro2.getPaginas());
		System.out.println("***********imprimiendo lista**********");

		List<LibroDto> lista = libroService.llenarLista(libro2);
		for (LibroDto libroDto : lista) {
		    System.out.println(libroDto.getTitulo());
		    System.out.println(libroDto.getAutor());
		    System.out.println(libroDto.getPaginas());
		    System.out.println("-----");
		    
		}

	}

}
