
package practica.pkg1;

import implementacion.*;
import java.util.Scanner;
import pppp.persona;

public class Practica1 {
    //elaborar un menú
    //con cada opcion ejemplo: opcion 1: eliminar; opcion 2: agregar" verificar imagen en la carpeta de programacion"
  //listar crear eliminar

       

   
    public static void main(String[] args) {
        implpersona ip=new implpersona();
        Scanner intr= new Scanner (System.in);
        int tecla;
        
        System.out.println("menu de presonas");
        System.out.println("presiona el numero a elegir");
        System.out.println("3.-Agregar persona");
        System.out.println("2.-Eliminar persona ");
        System.out.println("1.-listar");
        tecla=intr.nextInt();
        switch(tecla){
            case 1:
                
         persona  p1=new persona();
         p1.setNombres("Alex");
         p1.setAp_paterno("Zela");
         p1.setAp_materno("Mamani");
         p1.setSexo("M");
         ip.create(p1) ; 
         
         persona  p2=new persona();
         p2.setNombres("Ainya");
         p2.setAp_paterno("ZZK");
         p2.setAp_materno("YMMYT");
         p2.setSexo("F");
         ip.create(p2) ;
         System.out.println(p2);
         
         persona  p3=new persona();
         p3.setNombres("Estefi");
         p3.setAp_paterno("Heibu");
         p3.setAp_materno("Mamani");
         p3.setSexo("M");
         ip.create(p3) ;
         System.out.println(p3);
         
            break;
            case 2: ip.delete(1);    
             
             break;
            case 3: 
                 for (persona p : ip.list()) {
                    System.out.println(p.getId()+"\t"+ p.getNombres()+" \t "+p.getAp_paterno()+"\t"+p.getAp_materno()+"\t"+p.getSexo());
                   }       
                    
                    break;
    }         
        
    }}
    

