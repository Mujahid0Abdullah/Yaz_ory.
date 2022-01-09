
package soru5;

import java.util.Scanner;
public class Soru5 {
    

   
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("lütfen dörtgenin en değeri olarak bir tamsayı giriniz: ");
        int en =k.nextInt();
        System.out.println("lütfen dörtgenin boy değeri olarak bir tamsayı giriniz: ");
        int boy =k.nextInt();
        for(int i=0;i<boy;i++){
            for(int j=0;j<en;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
            
    }
    
}
