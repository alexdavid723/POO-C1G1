
package implementacion;
import java.util.*;
import pppp.persona;


public class implpersona {
    List<persona> lis=new ArrayList<>();
    int id=0;
    public void create (persona p){
        id=id+1;
        p.setId(id);
        lis.add(p);
        
    }
    public List<persona> list(){
        return lis;
    }
    public void delete(int id){
        for (persona ps : lis){
            if(id==ps.getId()){
            System.out.print("  Eliminando"+ps.getNombres());
            lis.remove(ps);
            
        }
    }
    
}}
