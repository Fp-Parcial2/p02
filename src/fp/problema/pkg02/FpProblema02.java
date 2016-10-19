
package fp.problema.pkg02;
import java.util.*;

public class FpProblema02 {
/** 
 2.Realizar un programa que convierta una cantidad de metros dada
         en su equivalente en Pies, Yardas y Millas.*/
    /*yardas= 1.09361m
    pies=3.28084m
    millas=0.000621371m*/
 
    public static void main(String[] args) {
        int m;
        double ft;
        double yd;
        double mll;
        ft=3.28084;
        yd=1.09361;
        mll=00.00062371;
        
       Scanner entradaDato= new Scanner(System.in);
        System.out.println("Introduce los metros a convertir");
        m= entradaDato.nextInt();
        
        System.out.println("Tu resultado es:" + ft*m + " ft,   " +yd*m + "yd,   "+ mll * m +"mll   ");
    }
    
}
