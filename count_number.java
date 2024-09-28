package bill_payment;
import java.util.Scanner;
public class hh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("entr your number");

        int num = sc.nextInt();
        int a[] = new int[num];

        System.out.println("entr number"+num);

        for (int i = 0; i <num;i++){
            a[i] = sc.nextInt();

        }

    int sum= 0;
        for (int i = 0; i<num;i++){
            sum += a[i];

    }
        System.out.println("total="+sum);
    }
}


