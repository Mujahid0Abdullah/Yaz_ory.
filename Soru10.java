
package soru10;
import java.util.Scanner;

public class Soru10 {

    
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("lütfen Vize notunuzu giriniz: ");
        int vize =k.nextInt();
        System.out.println("lütfen Final notunuzu giriniz: ");
        int Final =k.nextInt();
        double ort=vize*0.4+Final*0.6;
         System.out.println("ortalama notu: "+ort);
        if (ort>=50){
             System.out.println("geçtiniz");
        }else{
             System.out.println("kaldınız");
        }
    }
    
}
