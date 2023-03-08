package TheoInf;

import java.util.ArrayList;

public class aufgabe4 {
    public static void main(String[] args) {
        aufgabe_a();
    }

    public static void aufgabe_b(){
    int gn = 1;
    while ( true ){
        int n = gn;
        int k = 0;
        boolean myboolean = false;
        while ( n != 1 && k < 10000) {
            k++;
            n = function(3, 7, n);
            if(k == 9999)  myboolean = true;

        }
        if(myboolean == false){
            System.out.println(gn);
        }
        gn++;
        if (gn >= 20) break;

    }
    }

    public static void aufgabe_a(){
        int k = 1;
        int n = function(3,1,27);
        while ( n != 1 ){
            System.out.println(n);
            n = function(3,1,n );
            k++;
        }
        System.out.println( "Ergebnis: " + k);
    }

    public static int function(int a, int b, int n){
        if(n%2 == 0){
            return n/2;
        }else{
            return a * n + b;
        }
    }
}