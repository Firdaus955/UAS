
package UAS;
import static java.lang.System.out;
import java.util.Scanner;
public class Sekuensial {
    public static void main (String[] args){
        int d,H,J,M,D;
        Scanner in = new Scanner(System.in);
        out.print("Masukan Jumlah Detik = ");d=in.nextInt();
        D=d;
        H=D/86400;D=D%86400;
        J=D/3600;D=D%3600;
        M=D/60;D=D%60;
        out.print(d+" Detik = ");
        out.print(H+" Hari ");
        out.print(J+" Jam ");
        out.print(M+" Menit ");
        out.print(D+" Detik \n");
    }
    
}
