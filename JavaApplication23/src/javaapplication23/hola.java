package Romano;

import java.util.Scanner;


public class Euclides {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main (String[] Args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int primerNum=pideNumEntero("");
        
        System.out.print("Introduce el segundo numero: ");
        int segundoNum= pideNumEntero("");
        
        
        
        System.out.println("La mitja per el metodo de Euclides es:"+obtener_mcd(primerNum, segundoNum));
    }
   
    static int obtener_mcd(int primerNum, int segundoNum) {
       if(segundoNum==0)
           return primerNum;
       else
           return obtener_mcd(segundoNum, primerNum % segundoNum);
   }
    
    
    static int pideNumEntero(String mensaje){
        int result;
        
        System.out.print(mensaje);
       
        while(!scan.hasNextInt()){
            scan.next();
            
            System.err.println("Tiene que ser un numero entero");
            
            System.out.print("Vueleve a introducirlo:");
        }
        result=scan.nextInt();
        return result;
    }
}
