
import java.util.Iterator;
import java.util.Map;
import ut3.ta2.ManejadorArchivosGenerico;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolBB arbol = new TArbolBB();

      // cargar los productos desde el archivo "altasprueba.txt"
      
      String[] productos = ManejadorArchivosGenerico.leerArchivo("src/altasPrueba.txt");
      Almacen Almacen = new Almacen("Almacen Prueba");
        for (String producto : productos) {
            String[] prod = producto.split(",");
            Producto nuevoProducto = new Producto(prod[0], prod[1]);
            nuevoProducto.setPrecio(Integer.parseInt(prod[2]));
            nuevoProducto.setStock(Integer.parseInt(prod[3]));
            Almacen.insertarProducto(nuevoProducto);
        }
      // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println(Almacen.imprimirProductos());
      
      //emitir el valor del stock
        String[] claves = Almacen.imprimirProductos().split("-");
        String nombre="";
        for (String clave : claves) {
            nombre =Almacen.buscarPorCodigo(clave).getNombre()+" tinee stock de: "+ Almacen.buscarPorCodigo(clave).getStock();
            System.out.println(nombre);
        }
      // simular las ventas a partir del archivo "ventaspruebas.txt"
      // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
      // listar los productos ordenados por codigo, junto con su cantidad existente

    }
}

