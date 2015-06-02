/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_mochila;

import java.util.*;
import tp_mochila.Elemento;


public class Tp_mochila {
    
static ArrayList<Elemento> elementos = new ArrayList<Elemento>();
static int volMaxMochila = 4200;
String[][] subconjuntos = new String[1024][10];



    public static void main(String[] args) {
       llenar();
       cargaCombinaciones();
     System.out.print("ID"+"\t Volumen"+"   Valor \n");
     

        for(int i=0;i<10;i++){
       System.out.println(elementos.get(i).getId()+"\t "+elementos.get(i).getVolumen()+"\t    "+
                            elementos.get(i).getValor());}
    }

    
    
    
    static private void llenar(){
         Elemento uno = new Elemento(1,150,20);
         Elemento dos = new Elemento(2,325,40);
         Elemento tres = new Elemento(3,600,50);
         Elemento cuatro = new Elemento(4,805,36);
         Elemento cinco = new Elemento(5,430,25);
         Elemento seis = new Elemento(6,1200,64);
         Elemento siete = new Elemento(7,770,54);
         Elemento ocho = new Elemento(8,60,18);
         Elemento nueve = new Elemento(9,930,46);
         Elemento diez = new Elemento(10,353,28);
         
         elementos.add(uno);
         elementos.add(dos);
         elementos.add(tres);
         elementos.add(cuatro);
         elementos.add(cinco);
         elementos.add(seis);
         elementos.add(siete);
         elementos.add(ocho);
         elementos.add(nueve);
         elementos.add(diez);
        
    }
    
    static private void cargaCombinaciones(){
        
        
        
    }
}
