package trabajo;


public class Ejemplo_1 {
    
    public static void main(String[] args) 
    {
        String paises[]=new String[6];
        //Chile
        // Chile Perú Bolivia México España
        paises[0]="Chile";
        paises[1]="Colombia";
        paises[2]="Ecuador";
        paises[3]="Costa Rica";
        paises[4]="Venezuela";
        paises[5]="México";
        System.out.println("largo = " + paises.length);
        //System.out.println(paises[5]);
        for(int i=0;i<paises.length;i++)
        {
            System.out.println(paises[i]);
        }
    }
            
    
}
