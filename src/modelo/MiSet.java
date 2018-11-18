
package modelo;
import java.util.HashSet;
import java.util.Set;


public class MiSet {
   
    private Set <datos_set> miConjunto;
    
    
    public MiSet(){
        
    this.crear();
}

    public void crear() {
        
        
        miConjunto = new HashSet<datos_set>();
    }
    public void agregar (datos_set e){
        
        miConjunto.add(e);
        
    }
    
    public void listar (){
        
        for(datos_set e : miConjunto){
            System.out.println("hola  :" +e.getNombre()+"  tu edad es  "+e.getEdad());
        }
    }
}
        
    
        
       
    
    

