import java.util.Random;

public class TableNo {
    public static void main(String[] args) {

        int[] tableNr = new int [10];
        Random rnd = new Random();

        for(int i = 0; i<tableNr.length; i++){

            tableNr[i] = rnd.nextInt(20);
        }

        int x = 0;
        do{
            System.out.print(tableNr[x] + " ");
            x++;
        } while(x<tableNr.length);

        x = 9;

        do{
            System.out.print(tableNr[x] + " ");
            x--;
        } while(x>=0);
    }
}
