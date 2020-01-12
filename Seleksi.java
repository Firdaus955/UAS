package UAS;
import static java.lang.System.out;
import java.util.Scanner;
public class Seleksi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int B1,B2,B3,B4,B5,B;
        out.print("B1= ");B1=in.nextInt();
        out.print("B2= ");B2=in.nextInt();
        out.print("B3= ");B3=in.nextInt();
        out.print("B4= ");B4=in.nextInt();
        out.print("B5= ");B5=in.nextInt();
        B=B1;
        if(B<B2)B=B2;
        if(B<B3)B=B3;
        if(B<B4)B=B4;
        if(B<B5)B=B5;
        
        out.println("Bilangan Terbesar= "+B);
        
        B=B1;
        if(B>B2)B=B2;
        if(B>B3)B=B3;
        if(B>B4)B=B4;
        if(B>B5)B=B5;
        
        out.println("Bilangan Terkecil= "+B);
    }
}
