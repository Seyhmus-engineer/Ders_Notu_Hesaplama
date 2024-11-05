
package ders_notu_hesaplama;

import java.util.Scanner;

/*
   Basit düzeyde yapılmış Ders notu hesaplama
*/


public class Ders_notu_hesaplama {
    private static Scanner input=new Scanner(System.in);

    
    public static void main(String[] args) {
        
        double vize, var_final, ortalama;
        System.out.print("Vize notunu giriniz: ");
        vize=input.nextDouble();
        System.out.print("Final notunu giriniz: ");
        
        var_final=input.nextDouble();
        if(var_final>=50){
        ortalama= vize*0.4 + var_final*0.6;
        
        if(ortalama<44.99){
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= FF");
            System.out.println("Dersten Kaldınız");
        }
        else if(ortalama>=45.00 && ortalama<=49.99) {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= DD");
            System.out.println("Dersten sorumlu Geçtiniz");
        }
        else if(ortalama>=50.00 && ortalama<=59.99) {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= DC");
            System.out.println("Dersten Geçtiniz");
        }
        else if(ortalama>=60.00 && ortalama<=69.99) {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= CC");
            System.out.println("Dersten Geçtiniz");
        }
        else if(ortalama>=70.00 && ortalama<=79.99) {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= CB");
            System.out.println("Dersten Geçtiniz");
        }
        else if(ortalama>=80.00 && ortalama<=84.99) {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= BB");
            System.out.println("Dersten Geçtiniz");
        }
        else if(ortalama>=85.00 && ortalama<=89.99) {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= BA");
            System.out.println("Dersten Geçtiniz");
        }
        else {
            System.out.println("Ortalamanız= "+ortalama);
            System.out.println("Harf notunuz= AA");
            System.out.println("Dersten Geçtiniz");
    }
        
        
    }
        else {
            System.out.println("Final notunuz 50 nin altında olduğundan dersten kaldınızı");
            
            
        }
    }
    
}
