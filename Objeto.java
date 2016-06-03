
package trabajo;

import java.util.ArrayList;

public class Objeto 
{
    public static void main(String[] args) 
    {
        ArrayList<String> lista=new ArrayList();
        lista.add("Chile");
        lista.add("México");
        lista.add("Colombia");
        lista.add("Perú");
        lista.add("Panamá");
        lista.add("Venezuela");
        System.out.println("largo = "+ lista.size());
        
        for(int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }
        System.out.println("##############################");
        //haremos un foreach
        for( String l : lista )
        {
            System.out.println(l);
        }
        
    }
}
