package TP2;
public class MainBiblioteca {

    public static void main(String[] args) {

        // new Libro(); no compila porque al declarar constructores propios, el constructor sin argumentos deja de existir.

        Libro libro1 = new Libro("El resplandor", "Stephen King", "9788497593794");

        Libro libro2 = new Libro("Los juegos del hambre", "Suzanne Collins", "9780439023481", 3, 22000.0);

        Libro libro3 = new Libro("Orgullo y prejuicio", "Jane Austen", "9780141439518", 2, 18500.0);

        Libro libroInvalido = new Libro("", "Autor desconocido", "ISBN-000", 1, 15000.0);

        System.out.println("Título obtenido: " + libroInvalido.getTitulo());

        double precioAnterior = libro1.getPrecioReposicion();

        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);

        System.out.println("¿Se aceptó el precio -100.0? " + precioAceptado + " (se mantiene el precio anterior)");

        if (libro1.getPrecioReposicion() == precioAnterior) {
            System.out.println("El precio anterior se mantuvo correctamente.");
        }

        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        boolean prestamo1 = libro1.prestar();

        if (prestamo1) {
            boolean prestamo2 = libro1.prestar();

            if (!prestamo2) {
                System.out.println("El segundo préstamo fue rechazado correctamente.");
            }
        }

        libro1.devolver();

        double precioViejo = libro1.getPrecioReposicion();

        boolean precioActualizado = libro1.setPrecioReposicion(18000.0);

        if (precioActualizado) {
            System.out.println("Precio de reposición actualizado de \"" + libro1.getTitulo() + "\": $" + precioViejo + " -> $" + libro1.getPrecioReposicion());
        }
    }
}