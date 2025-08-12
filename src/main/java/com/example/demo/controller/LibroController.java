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

		LibroDto libro = libroService.crearLibro("el poder del ahora", "paulo londra", 245, 1994);
		libroService.imprimirLibro(libro);
		libroService.llenarLista(libro);

		LibroDto libro2 = new LibroDto();

		libro2.setTitulo("el camino de los perdedores");
		libro2.setAutor("mauricio garces");
		libro2.setPaginas(234);
		libroService.llenarLista(libro2);
		libroService.imprimirLibro(libro2);

		LibroDto libro3 = new LibroDto("hola mundo", "robin arellano", 234, 1889);
		libroService.llenarLista(libro3);
		libroService.imprimirLibro(libro3);

		libroService.llenarLista(new LibroDto("hola", "sharon linres", 223, 1267));

		libroService.llenarLista(libroService.crearLibro("el poder del ahora", "paulO COELLO", 245, 1234));

		System.out.println("***********imprimiendo lista**********");

		List<LibroDto> lista = libroService.consultarLista();

		for (LibroDto libroDto : lista) {
			libroService.imprimirLibro(libroDto);
			System.out.println("-----");

		}

	}

}
