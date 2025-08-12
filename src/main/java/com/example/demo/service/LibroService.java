package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.LibroDto;

public class LibroService {

	private List<LibroDto> libros;

	public LibroService() {
		super();
		this.libros = new ArrayList<LibroDto>();

	}

	public void bienvenida() {
		System.out.println("bienvenido al sistema de libros");
	}

	public void bienvenidaAutor(String autor) {
		System.out.println("bienvenido: " + autor + " al sistema de gestion de sus obras");
	}

	public String mensajeLectores() {
		return "la lectura es sabia e importante";
	}

	public int sumaPaginas(int paginasLibro1, int paginasLibro2) {
		return paginasLibro1 + paginasLibro2;
	}

	public LibroDto crearLibro(String titulo, String autor, int paginas, int anioLanzamiento) {
		LibroDto libroDto = new LibroDto();
		libroDto.setTitulo(titulo);
		libroDto.setAutor(autor);
		libroDto.setPaginas(paginas);
		libroDto.setAnioLanzamiento(anioLanzamiento);
		return libroDto;

	}

	public void llenarLista(LibroDto libroDto) {
		this.libros.add(libroDto);

	}

	public List<LibroDto> consultarLista() {
		return libros;
	}

	public void imprimirLibro(LibroDto libroDto) {
		System.out.println("titulo: " + libroDto.getTitulo());
		System.out.println("autor: " + libroDto.getAutor());
		System.out.println("paginas: " + libroDto.getPaginas());
		System.out.println("año de lanzamiento: " + libroDto.getAnioLanzamiento());
		System.out.println();
	}

}
