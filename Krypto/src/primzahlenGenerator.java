import java.util.ArrayList;

public class primzahlenGenerator {

    public static void main(String[] args) {
        System.out.println(getPrim(100000));
    }

    public static ArrayList<Integer> getPrim(int max){
        int[] list = new int[max];
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 0; i < list.length; i++) list[i] = i;
        for (int i = 2; i < list.length; i++){
            int multiplier = 2;
            while (i * multiplier < list.length) list[i * multiplier++] = 0;
        }
        for(int i : list){
            if(i != 0 && i >= 2 ) output.add(list[i]);
        }
        return output;
    }

}
