
package javaapplication9;
import java.util.*;

public class JavaApplication9 {
    public static void main(String[] args) {
     Scanner leer=new Scanner (System.in);
     ArrayList<String> nombre= new ArrayList();
     ArrayList<Integer> salariodias = new ArrayList();
     ArrayList<Integer> dias = new ArrayList();
     ArrayList<Integer> total = new ArrayList();
     boolean continuar=true;
     int decision=1,total1=0;
     while(continuar){
         System.out.println("Ingrese el nombre del empleado");
         nombre.add(leer.next());
         System.out.println("Ingrese el salario x dia");
         salariodias.add(leer.nextInt());
         System.out.println("Ingrese los dias trabajados");
         dias.add(leer.nextInt());
         System.out.println("Otro trabajador mas (0 para salir)(1 para continuar)");
         decision=leer.nextInt();
         if (decision==0){
             continuar=false;
         }
     }
     for(int x=0;x<nombre.size();x++){
        
         total1=salariodias.get(x)*dias.get(x);
         total.add(total1);
         System.out.println(nombre.get(x)+"\t"+salariodias.get(x)+"\t"+dias.get(x)+"\t"+total.get(x));

         
     }
       

    }
    
}
