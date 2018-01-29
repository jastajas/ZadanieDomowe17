import java.util.Random;

public class TableNo {
    public static void main(String[] args) {

        int[] tableNr = new int [10];
        Random rnd = new Random();

        String a = "";
        String b = "";

        for(int i = 0; i<tableNr.length; i++){

            tableNr[i] = rnd.nextInt(20);
            a += " " + tableNr[i];
            b = tableNr[i] + " " + b;
        }
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
    }
}
