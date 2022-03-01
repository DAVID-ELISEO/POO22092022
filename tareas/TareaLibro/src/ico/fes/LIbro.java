/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * Class LIbro
 */
public class LIbro {
    private String titulo;
    private String editorial;
    private String Autor;
    private String formato;
    private int precio;
    private String idioma;
    private String categoria;

    public LIbro() {
    }

    public LIbro(String titulo, String editorial, String Autor, String formato, int precio, String idioma, String categoria) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.Autor = Autor;
        this.formato = formato;
        this.precio = precio;
        this.idioma = idioma;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "LIbro{" + "titulo=" + titulo + ", editorial=" + editorial + ", Autor=" + Autor + ", formato=" + formato + ", precio=" + precio + ", idioma=" + idioma + ", categoria=" + categoria + '}';
    }
    
}
