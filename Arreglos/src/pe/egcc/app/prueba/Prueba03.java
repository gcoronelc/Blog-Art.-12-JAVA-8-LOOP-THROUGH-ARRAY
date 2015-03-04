package pe.egcc.app.prueba;

import java.util.Arrays;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    String[] ciudades = {
      "Lima","Londres","Paris",
      "New York","Roma","Berlín"
    };
    
    Arrays.stream(ciudades).forEach(ciudad->
      System.out.println(ciudad));
    
  }
  
}
