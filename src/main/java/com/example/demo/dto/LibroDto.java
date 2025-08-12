package com.example.demo.dto;

public class LibroDto {

	private String titulo;
	private String autor;
	private int paginas;
	private int anioLanzamiento;

	public LibroDto() {
		super();
	}

	public LibroDto(String titulo, String autor, int paginas, int anioLanzamiento) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.anioLanzamiento = anioLanzamiento;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}

	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}

}
