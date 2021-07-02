/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packagemain;

import helpmetod.mhelp;
import java.io.IOException;

/**
 * 
 * @author Geovanny Zambrano
 */
public class all_metodos {
        
    public void suma() throws IOException{
        int suma;
        int a = p_valor();
        int b = s_valor();
        suma = a + b;
        System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
        
    }
    
    public void resta() throws IOException{
        int resta;
        int a = p_valor();
        int b = s_valor();
        resta = a + b;
        System.out.println("La resta entre " + a + " y " + b + " es: " + resta);
    }
    
    public void multiplicacion() throws IOException{
        int multiplicacion;
        int a = p_valor();
        int b = s_valor();
        multiplicacion = a + b;
        System.out.println("La multiplicacion entre " + a + " y " + b + " es: " + multiplicacion);
    }
    
    public void division() throws IOException{
        double division ;
        int a = p_valor();
        int b = s_valor();
        division  = a + b;
        System.out.println("La division entre " + a + " y " + b + " es: " + division );        
    }
    
    public void potencia() throws IOException{
        double potencia;
        int a = p_valor();
        int b = s_valor();
        potencia = Math.pow(a, b);
        
        System.out.println(a + " elevado al " + b + " es: " + potencia);
    }
    
    public void raiz() throws IOException{
        double raiz;
        int a = p_valor();
        raiz = Math.sqrt(a);
        System.out.println("La raiz cuadrada de " + a + " es: " + raiz);
    }
    
    public void otros(){
        
    }
    
    public void salir(){
        
    }
    
    public void menu_principal(int a){
        System.out.println("------------Menu principal-----------\n");
        System.out.println(" 1. Suma.                5. Potencia.");
        System.out.println(" 2. Resta.               6. Raiz.");
        System.out.println(" 3. Multiplicacion.      7. Otros.");
        System.out.println(" 4. Divicion.            8. Salir.");       
        System.out.println("-------------------------------------");
        if (a == 0) {
            System.out.println("Escoje operacion...");
        }else if (a != 0 ) {
            System.out.println("Opcion incorrecta, intenta de nuevo...");
        }
        
    }
    
    private int p_valor () throws IOException{
        int a;
        System.out.println("Ingresa primer valor.");
        a = mhelp.solicitar_numero();
        return a;
    }
    
    private int s_valor () throws IOException{
        int a;
        System.out.println("Ingresa segundo valor.");
        a = mhelp.solicitar_numero();
        return a;
    }
    
}
