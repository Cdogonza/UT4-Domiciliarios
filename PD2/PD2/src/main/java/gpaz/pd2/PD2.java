/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gpaz.pd2;


/**
 *
 * @author gpaz1
 */
public class PD2 {

    public static void main(String[] args) {
        TArbolBB miArbol = new TArbolBB();

        String[] claves = ManejadorArchivosGenerico.leerArchivo("src/clavesPrueba.txt");

    for (String clave : claves) {
      TElementoAB<Integer> elemento = new TElementoAB<Integer>(Integer.parseInt(clave), null) {};
      miArbol.insertar(elemento);
    }
    ManejadorArchivosGenerico.escribirArchivo(
      "src/salida.txt",
      new String[]{
        "Recorrido en preOrden: " + miArbol.preOrden(),
        "Recorrido en inOrden: " + miArbol.inOrden(),
        "Recorrido en posOrden" + miArbol.postOrden()
      }
    );

    TArbolBB segundoArbol = new TArbolBB();

    String[] claves2 = ManejadorArchivosGenerico.leerArchivo("src/claves1.txt");

    for (String clave : claves2) {
      TElementoAB<Integer> elemento = new TElementoAB<Integer>(Integer.parseInt(clave), null) {};
      segundoArbol.insertar(elemento);
    }

    // Ninguna de estas claves está en el arbol
    System.out.println(segundoArbol.buscar(10635));
    System.out.println(segundoArbol.buscar(4567));
    System.out.println(segundoArbol.buscar(12));
    System.out.println(segundoArbol.buscar(8978));

    // Elemento que si esta en el arbol
    System.out.println(segundoArbol.buscar(406).getEtiqueta()); // Me devuelve el elemento que busqué

    // La clave en la posicion decima es 797
    System.out.println(segundoArbol.preOrden());
  }
    }

