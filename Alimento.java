
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // instance variables - replace the example below with your own
    private String nombre;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;
    private String componenteMayoritario;

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas) 
    {
         this.nombre = nombre;
         this.proteinas = proteinas;
         this.carbohidratos = carbohidratos;
         this.grasas = grasas;
         this.calorias = calorias;
         this.componenteMayoritario = componenteMayoritario;
    }

    /**
     * Método que muestra los datos
     */
    public void muestraDatos()
    {
          calorias = (carbohidratos*4)+(proteinas*4)+(grasas*9);
     
          System.out.println("Dime el nombre del alimento: " + nombre); 
          System.out.println("Las proteinas son: " + proteinas);
          System.out.println("Los carbohidratos son: " + carbohidratos);
          System.out.println("Las grasas son: "+ grasas);
          System.out.println("Las calorias son: " + calorias);
          
          if(proteinas > carbohidratos && proteinas > grasas)
    {
          System.out.println("El componente mayoritario es: " + proteinas);
    }
     
     
     
     
    }
}
