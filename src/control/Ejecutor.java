
package control;
import modelo.MiSet;
import modelo.datos_set;
import modelo.MiMap;
import modelo.Pila;
import modelo.juego;
public class Ejecutor {
    
    public static void main(String[] args) {
        
        
        
       // item 1
        

        System.out.println("Colecciones SET");
        MiSet curso = new MiSet();
        curso.agregar(new datos_set("19474665-2","luis",18));
        curso.agregar(new datos_set("19474665-2","weta",18));
        curso.listar();
        
        
        // item 2
        
        
        System.out.println("Colecciones HashMap");
        
        MiMap m = new  MiMap();
        
        m.agregar("hey","listen");
        m.agregar(2,"co-co-combro braker");
        m.agregar(3,"omaewa mou shinderu");
        
        
        // recorriendo y listando HashMap
        m.listar();
        
        
        
        // item 3 
        
        Pila mipila = new Pila();
        
        mipila.push("weta");
        mipila.push("weta2");
        mipila.push("weta3");
        mipila.push("weta4");
        
        mipila.mostrar();
        mipila.DuplicarPila();
        mipila.ConcatenarPila();
        
        
        //item 4 
        
        
        juego j1 = new juego();
        
        j1.crear(10);
        j1.juego();
        
       
        
        
        
        
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
