
package soru9;




public class soru9 {

   
    public static void main(String[] args) {
      
          String[] birler={" ","bir","iki", "üç" ,"dört", "beş" ,"altı", "yedi" ,"sekiz", "dokuz"};
     String[] onlar={" ","On", "yirmi", "otuz", "kırk"," elli", "altmış", "yetmiş"," seksen", "doksan"};
     String[] arr=new String[99];
     for(int i=1;i<=99;i++){
         arr[i-1]=onlar[i/10]+" "+birler[i%10];
         
         
     }
     for(int i=0;i<arr.length;i++){
         System.out.printf("%6s |",arr[i]); //System.out.println(Arrays.deepToString(arr).replace("dokuz, ", "dokuz \n").trim());
     }
     
    
    }
    
    
    
}
