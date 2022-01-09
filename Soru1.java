
package soru1;

import java.util.Scanner;
public class Soru1 {

   
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("boynuzu cm olarak giriniz: ");
        
      
        int boy=k.nextInt();
     System.out.print("kilonuzu kg olarak giriniz: ");
        
        int kilo=k.nextInt();
        double oran = boy/kilo;
        if(oran<2.0)
            System.out.println("şişman");
        else if (oran>2.0 && oran<=2.5)
            System.out.println("normal");
        else
            System.out.println("zayif");
    }
    
}
