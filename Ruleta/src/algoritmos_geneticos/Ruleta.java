
/* Trabajo Práctica Ruleta, Algoritmos Geneticos */
package algoritmos_geneticos;
import java.util.Random;
/**

 * @author Martin Guereta
 */
public class Ruleta {

    public static void main(String[] args) {
        Random rnd = new Random();
        
        
                  int[][] cromosomas = new int[10][30];
                  String[] string = new String[10];
                    String numero="";
                    long[] numeroBinarioConvertir = new long[10];  

                 
           for(int i=0;i<10;i++){
               for (int j=0;j<30;j++){
           cromosomas[i][j]= (int)(rnd.nextDouble()*2 +0);
       numero = numero + Integer.toString(cromosomas[i][j]); 
               }
                string[i]=numero;
              numero="" ;   
     }
        
         for(int i=0;i<10;i++){
               for (int j=0;j<30;j++){
           System.out.print(cromosomas[i][j]);
               }      System.out.println(" ");

     }
for(int i=0;i<10;i++){ System.out.println(string[i]);}
for(int i=0;i<10;i++){ 
long BinarioConvertir = Long.parseLong(string[i]); 
        long salidaDecimal=0;
        long contador=1;
        long auxDecimal=0;
        while(BinarioConvertir>0){
            /*Sacamos el residuo de la operacion el cual multiplacaremos por la variable auxDecimal */ 
            auxDecimal= BinarioConvertir%2;
        } 
 //Vamos sumando y guardando en la variable salidaDecimal la operacion 
        salidaDecimal=salidaDecimal+auxDecimal*contador;
        //Dividimo estre diez numero
       BinarioConvertir/=10; 
        contador=contador*2; 
      
       numeroBinarioConvertir[i]=salidaDecimal;
       }}
 }   
 
