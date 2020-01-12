
package UAS;
public class Classpecahan {
    int bulat,pembilang,penyebut;
    Classpecahan(){
        bulat=0;pembilang=0;penyebut=1;
    }
    Classpecahan(int x){
        bulat=x;pembilang=0;penyebut=1;
    }
    Classpecahan(int x,int y){
        bulat=0;pembilang=x;penyebut=y;
    }
    Classpecahan(int x,int y,int z){
        bulat=x;pembilang=y;penyebut=z;
    }
    int gcd(int x,int y){
    if(y==0) return(x);
    else return (gcd(y,x%y));
}
    void reduksi(){
        int temp=gcd(pembilang,penyebut);
        pembilang=pembilang/temp;penyebut=penyebut/temp;
        if(pembilang>=penyebut){
        pembilang=pembilang%penyebut;
    }
        else bulat=0;
}

Classpecahan tambah(Classpecahan X){
    Classpecahan T = new Classpecahan();
    T.bulat=0;
    T.pembilang=(bulat*penyebut+pembilang)*X.penyebut+penyebut*(X.bulat*penyebut+X.pembilang);
    T.penyebut=penyebut*X.penyebut;
    T.reduksi();
    return T;
}
Classpecahan kurang(Classpecahan X){
    Classpecahan T = new Classpecahan();
    T.bulat=0;
    
    T.pembilang=(bulat*penyebut+pembilang)*(X.bulat*X.penyebut+X.pembilang);
    T.penyebut=penyebut*X.penyebut;
    T.reduksi();
    return T;
}
String toStr(){
    String T="";
    if(penyebut==1)
        if(pembilang==0)
            T=T+bulat;
        else{
            T=T+(bulat+pembilang);
            pembilang=0;
        }
    else if(bulat==0)
        T=T+pembilang+"/"+penyebut;
    return(T);
}
public static void main (String[] args){
    Classpecahan p=new Classpecahan(2,4);
    Classpecahan p1=new Classpecahan();
    Classpecahan p2=new Classpecahan(2);
    Classpecahan p3=new Classpecahan(5,2,3);
    
    System.out.println(p.toStr()+"+"+p3.toStr()+"="+p.tambah(p3).toStr());
    System.out.println(p2.toStr());
}
}
