
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pila {

    private List elementos;
    private List copiar;
    
    public Pila(){
        this.crear();  
    }

    private void crear() {
        this.elementos = new ArrayList(); 
       
    }
    
    public void push (Object elem){
        
        this.elementos.add(elem);
        
    }
    
    public void pop (){
        
        
        if (!this.isEmpy()){
            if (elementos.size() == 1){
                this.crear();
            }
            else{
                    elementos.remove(this.elementos.size()-1);
            }
        }
    }
    
    public Object top (){
        
        return this.elementos.get(this.elementos.size()-1);
    }
    
    

    private boolean isEmpy() {
        return elementos.isEmpty();
    }
    
    
    private void invertirPila(){
        
        
        Pila Paux = new Pila();
        while(!this.isEmpy()){
            
           Paux.push(this.top());
           this.pop();
            
        }
        
        
    }
    
    
    private Pila CopiarContenidoPila(){
        Pila Paux = new Pila();
        for(Object elem:this.elementos){
            
        Paux.push(elem);
        
        }
        return Paux;
    }
    
    
    public void DuplicarPila(){
        
        
        copiar = new ArrayList<> (elementos);
        
        this.push(copiar);
        
        System.out.println(elementos);
        
        
    }
    
    public void ConcatenarPila(){
        
        System.out.println(elementos+""+copiar);
                
        
        
        
    }
    
    public void mostrar (){
        
            System.out.println(elementos);
            
        
        
    }

    
}
