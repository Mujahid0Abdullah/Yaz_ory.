/*
*  Eğik atış yapılan cismin gidebileceği maksimum uzaklık
*   Cismin yatay düzlemde aldığı yol.
* R=(v^2*sin(2a))/g
*/
package soru4;

import java.util.Scanner;


public class soru4 {
    static double g=9.8;
    static double menzil(double v,double o){
    double R;
    R=(Math.pow(v,2)*Math.sin(o*2))/g;
    
    return R;
    }

  
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("cismin hızını giriniz");
       double hiz=k.nextDouble();
        System.out.println("cismin atiş açısını giriniz");
        double aci=k.nextDouble();
        System.out.printf("Xmax = %f m", menzil(hiz,Math.toRadians(aci)));
        

    }
    
}
