import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int l = 100;
        int p = 191;
        int q = 167;
        int s = 599;
        int n = p * q;
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> myRandom = new ArrayList<>();

        myList.add((s*s)%n);
        if ( gcd(s,n) == 1 && p%4 == 3 && q%4==3){
            for(int i = 0; i< l; i++) {
                myList.add( ((myList.get(i)*myList.get(i)) % n));
                myRandom.add(myList.get(i + 1) % 2);
            }
            System.out.println(myRandom.size());
            System.out.println(getRuns(myRandom));
        }else {
            System.out.println("Fehler");
        }
    }
    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }

    public static int getRuns (ArrayList<Integer> input){
        int runs = 1;
        int merke = input.get(0);

        for(int i = 1; i < input.size(); i ++){
            if(input.get(i) != merke){
                runs++;
                merke = input.get(i);
            }
        }
        return runs;
    }
}