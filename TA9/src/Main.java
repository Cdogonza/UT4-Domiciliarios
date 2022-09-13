
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
      Lista listaProductos = new Lista();
        for (String producto : productos) {
            String[] prod = producto.split(",");
            Producto nuevoProducto = new Producto(prod[0], prod[1]);
            nuevoProducto.setPrecio(Integer.parseInt(prod[2]));
            nuevoProducto.setStock(Integer.parseInt(prod[3]));
            Nodo productoNodo = new Nodo(prod[0], prod[1]);
            listaProductos.insertar(productoNodo);
        }
      // listar los productos ordenados por codigo, junto con su cantidad existente
        System.out.println(listaProductos.imprimir("-"));
      
      //emitir el valor del stock
        
       
      // simular las ventas a partir del archivo "ventaspruebas.txt"
      // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
      // listar los productos ordenados por codigo, junto con su cantidad existente

    }
}

