/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;
import java.util.Scanner;
public class Method {
    public static double reamur(double K){
        return(4/5.0*K);
    }
    public static double fahrenhit(double K){
        return(9/5.0*K+32);
    }
    public static double kelvin(double K){
        return(273+K);
    }
    public static void cetak(String c,double K){
        System.out.println(c+" = "+K);
    }
    public static void main(String[] args){
        int B;
        Scanner in = new Scanner(System.in);
        System.out.print("Celsius= ");B=in.nextInt();
        cetak("Celsius",B);
        cetak("Reamur",reamur(B));
        cetak("Fahrenhit",fahrenhit(B));
        cetak("Kelvin",kelvin(B));
        
    }
}
