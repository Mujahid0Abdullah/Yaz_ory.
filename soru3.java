//*
//**
//***
//****

package soru3;
import java.util.Scanner;

public class soru3 {



    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("lütfen üçgenin yüksekliği giriniz ");
        int yk=k.nextInt();
        String star="*";
        String sonuc="";
        for(int i=0;i<yk;i++){
            sonuc =sonuc+star;
             System.out.println(sonuc);
        }
        
      
    }
    
}
