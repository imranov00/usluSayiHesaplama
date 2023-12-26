import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int k;
        int total=1;


        Scanner inp =new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayı:");
        n= inp.nextInt();
        System.out.println("Üs Olacak Sayı :");
        k = inp.nextInt();


        for (int i = 1; i<=k; i++){
            total *=n;

        }
        System.out.println("Üslü Sayınız: "  + total);




    }
}