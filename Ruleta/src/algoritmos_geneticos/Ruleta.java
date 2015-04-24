/* Trabajo Práctica Ruleta, Algoritmos Geneticos */
package algoritmos_geneticos;
import java.util.ArrayList;
import java.util.Random;
/**

 * @author Martin Guereta
 */
public class Ruleta {
    
    /* Declaro un arreglo de String de 10x30 */
    
       static String[][] cromosomas = new String[10][30];

    public static void main(String[] args) {
    
        /* Declaro un constructor de la clase Random */
        
        Random rnd = new Random();
        
        /* Declaro un ArrayList de cromosomas del tipo String */
        
        ArrayList<String> cro = new ArrayList<String>();
        
      
        for(int i=0;i<10;i++){
            String c="";
                for (int j=0;j<30;j++){
                    /* Le doy valor a una posicion de la matriz */
            cromosomas[i][j]= String.valueOf((int)(rnd.nextDouble()*2 +0));
                    /* Guardo el valor del numero en esa posicion */
            c=c+cromosomas[i][j];
                } 
                /* guardo el String de 30 numeros binarios en el ArrayList
                    de cromosomas */
     
                cro.add(c);
     }
        
         for(int i=0;i<10;i++){
               for (int j=0;j<30;j++){
           System.out.print(cromosomas[i][j]);
               }      System.out.println(" "+dameDecimal(cro.get(i).toString()));

    	}
			
	}

        /*Funcion que transforma el Binario en un decimal*/
		private static int dameDecimal(String cromos2) {
		
		 String nroBinario = cromos2.toString();
		int num = Integer.parseInt(nroBinario,2);
		return num;
	}
}	