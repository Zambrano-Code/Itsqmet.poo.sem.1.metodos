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
public class operaciones {
    public static void main(String[] args) throws IOException {
        all_metodos sub = new all_metodos();
        
        int op = 0;
        int repeticion = 0;
        
        do {
            do {
                sub.menu_principal(repeticion);
                op = mhelp.solicitar_numero();
            } while (!(op >= 1) && !(op <=8));

            switch (op){
                case 1:
                    sub.suma();
                    break;
                case 2:
                    sub.resta();
                    break;
                case 3:
                    sub.multiplicacion();
                    break;
                case 4:
                    sub.division();
                    break;
                case 5:
                    sub.potencia();
                    break;
                case 6:
                    sub.raiz();
                    break;
                case 7:
                    sub.otros();
                    break;
                case 8:
                    sub.salir();
                    break;            
            }
            repeticion = 0;
        } while (op != 8);
        
    }
        
}
