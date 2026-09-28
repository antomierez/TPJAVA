package TP2;
public class Libro {

    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String tit, String aut, String isbn, int coDisp, double preRepo) {

        if (tit == null || tit.isBlank()) {
            this.titulo = "Sin título";
            System.out.println("Título inválido, se usó \"Sin título\" por defecto.");
        } else {
            this.titulo = tit;
        }

        if (aut == null || aut.isBlank()) {
            this.autor = "Autor desconocido";
            System.out.println("Autor inválido, se usó \"Autor desconocido\" por defecto.");
        } else {
            this.autor = aut;
        }

        if (isbn == null || isbn.isBlank()) {
            this.isbn = "ISBN pendiente";
            System.out.println("ISBN inválido, se usó \"ISBN pendiente\" por defecto.");
        } else {
            this.isbn = isbn;
        }

        if (coDisp < 0) {
            this.copiasDisponibles = 0;
            System.out.println("Cantidad de copias inválida, se usó 0 por defecto.");
        } else {
            this.copiasDisponibles = coDisp;
        }

        if (!setPrecioReposicion(preRepo)) {
            this.precioReposicion = 15000.0;
            System.out.println("Precio de reposición inválido, se usó $15000.0 por defecto.");
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean setPrecioReposicion(double precio) {

        if (precio > 0) {
            this.precioReposicion = precio;
            return true;
        }

        return false;
    }

    public boolean prestar() {

        if (copiasDisponibles > 0) {
            copiasDisponibles--;

            System.out.println("Préstamo registrado: \""
                    + titulo
                    + "\". Copias disponibles: "
                    + copiasDisponibles);

            return true;
        }

        System.out.println("Error: no hay copias disponibles de \""
                + titulo
                + "\" para prestar.");

        return false;
    }

    public void devolver() {

        copiasDisponibles++;

        System.out.println("Devolución registrada: \""
                + titulo
                + "\". Copias disponibles: "
                + copiasDisponibles);
    }

    public void mostrarFicha() {

        System.out.println("=== Ficha de libro ===");
        System.out.println("Título:  " + titulo);
        System.out.println("Autor:   " + autor);
        System.out.println("ISBN:    " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposición: $" + precioReposicion);
        System.out.println("=======================");
    }
}