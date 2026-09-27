public class MainInventario {

    public static void main(String[] args) {

        Producto productoUno = new Producto();

        productoUno.nombre = "Monitor LED";
        productoUno.codigo = "P-001";
        productoUno.precio = 85000;
        productoUno.stock = 10;

        Producto productoDos = new Producto();

        productoDos.nombre = "Parlante portátil";
        productoDos.codigo = "P-002";
        productoDos.precio = 35000;
        productoDos.stock = 18;

        Producto productoTres = new Producto();

        productoTres.nombre = "Webcam HD";
        productoTres.codigo = "P-003";
        productoTres.precio = 27000;
        productoTres.stock = 14;

        productoUno.mostrarFicha();
        productoDos.mostrarFicha();
        productoTres.mostrarFicha();

        productoUno.venderUnidades(2);

        productoUno.venderUnidades(50);

        productoDos.reponerStock(5);

        productoTres.actualizarPrecio(25000);

        Producto copia = productoUno;

        copia.stock = 29;

        System.out.println("Stock de productoUno tras modificar copia: "
                + productoUno.stock
                + " (mismo objeto en el Heap)");
    }
}