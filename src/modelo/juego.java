
package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class juego {
    
    int nusuario;
    int nrandom;
    int contador=1;
    
    ArrayList ar1 = new ArrayList();
    
    public void crear (int u){
        System.out.println("ingrese numero maximo: ");
        Scanner sc = new Scanner(System.in);
        this.nusuario=sc.nextInt();
        this.nrandom=(int) (Math.random()*this.nusuario);
        
        
        System.out.println("el numero es "+this.nrandom);
        
    
}
    
    public void juego(){
        int apuesta;
        boolean ciclo=true;
        Scanner sc = new Scanner(System.in);
        
        while (ciclo==true){
            
            System.out.println("Intentos anteriores: "+ar1);  
            System.out.print("introduzca un numero entero: ");
            
            apuesta=sc.nextInt();
            
            if (apuesta==this.nrandom){
                System.out.println("le atino en :" +contador+" intentos");
                ar1.add(apuesta);
                ciclo=false;
            }
            
            if (apuesta<this.nrandom){
                System.out.println("el numero que ingreso es mayor");
                ar1.add(apuesta);
                contador++;
            }
             if (apuesta>this.nrandom){
                System.out.println("el numero que ingreso es menor");
                ar1.add(apuesta);
                contador++;
            }
                
            
            
        }
        
        
        
        
       
        
        
    }
    

    
    
         
    
    
    
    
}
