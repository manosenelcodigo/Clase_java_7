
package trabajo;

import java.util.ArrayList;
import modelo.Persona;


public class Objeto2 {
    
    public static void main(String[] args) 
    {
        ArrayList<Persona> lista=new ArrayList();
        lista.add(new Persona("César Cancino","yo@cesarcancino.com","4523234",76));
        lista.add(new Persona("nombre","correo","312",65));
        lista.add(new Persona("nombre 2","correo 2","222",12));
        lista.add(new Persona("nombre 3","correo 3","2344",87));
        System.out.println("largo : "+lista.size());
        for(int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i).getNombre());
            System.out.println(lista.get(i).getCorreo());
            System.out.println(lista.get(i).getTelefono());
            System.out.println(lista.get(i).getId());
            System.out.println("############################");
        }
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        for(Persona l : lista)
        {
            System.out.println(l.getNombre());
            System.out.println(l.getCorreo());
            System.out.println(l.getTelefono());
            System.out.println(l.getId());
            System.out.println("############################");
        }
        
       
    }
}
