package pe.egcc.app.prueba;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    String[] ciudades = {
      "Lima","Londres","Paris",
      "New York","Roma","Berlín"
    };
    
    for (int i = 0; i < ciudades.length; i++) {
      String ciudad = ciudades[i];
      System.out.println(ciudad);
    }
    
  }
  
}
