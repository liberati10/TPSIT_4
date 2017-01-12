package areaperimetrotriangolo;

import java.util.Scanner;

public class Areaperimetrotriangolo {

    public static void main(String[] args) {
        int lato1;
        int lato2;
        int base;
        int alt;
        int per;
        int area;
           
        Scanner input = new Scanner(System.in);
        do{
        do{
        System.out.println("inserisci lato1");
        lato1 = input.nextInt();
        }while(lato1 <= 0);
        do{
        System.out.println("inserisci lato2");
        lato2 = input.nextInt();
        }while(lato2 <= 0);
        do{  
        System.out.println("inserisci base");
        base = input.nextInt();
        }while(base <= 0);
        do{
        System.out.println("inserisci altezza");
        alt = input.nextInt();
        }while(alt <= 0);
        }while(lato1 + lato2 <= base);
        per = lato1 + lato2 + base;
        System.out.println("perimetro=" + per);
        area = base * alt;
        System.out.println("area=" + area);

    }
}
