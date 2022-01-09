
package soru7;
import java.util.Scanner;


public class Soru7 {


    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int sayi=k.nextInt();
        int n =(int) (Math.log10(sayi)+1);
        int GO=1;
     
   
        while(sayi!=0){
            
        int bd=sayi%10;
           sayi=sayi/10;
           if(bd!=0)
             GO=GO*bd;
        }
        double sonuc=Math.pow(GO, (1/n));
        System.out.println("girilen sayının rakamlarının geometrik ortalaması : "+sonuc);
     
    }
    
}
