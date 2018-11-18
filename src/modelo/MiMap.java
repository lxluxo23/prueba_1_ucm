
package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MiMap {
    
    Map map = new HashMap();
    
    
    public void agregar ( Object clave,Object valor){
        
        map.put(clave,valor);
        
    }
    
    public void listar(){
        
        Iterator it = map.entrySet().iterator();
        
        while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = (Object)entry.getKey();
                Object value = (Object)entry.getValue();
                System.out.println("clave: " + key + ", valor: " + value);
        }
        
        
        
    }
    
    
}
