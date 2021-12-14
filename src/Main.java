import java.util.Scanner;

public class Main {

    static int pow(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("Taban değerini giriniz :");
        a = scan.nextInt();

        System.out.println("Üs değerini giriniz :");
        b = scan.nextInt();

        System.out.println("Üs işlemi sonucu :" + pow(a,b));
    }
}