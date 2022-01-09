
package soru8;
import java.util.Scanner;


public class Soru8 {

   
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi;
        int tahmin=0;
        int adim=0;
        System.out.println("tahminiz");
        sayi=(int) (Math.random()*100)+1;
        while(tahmin!=sayi){
            adim=adim+1;
            
            tahmin= k.nextInt();
            if(tahmin<sayi)
                System.out.println("tahminiz çok küçük");
            if(tahmin>sayi)
                  System.out.println("tahminiz çok büuük");
            
            
            
        }
        System.out.println("adım sayısı:"+adim+"\n"+"sayı buldunuz.");
            
       

    }
    
}
