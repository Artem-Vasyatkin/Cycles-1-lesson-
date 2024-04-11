import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("\nTraining");
        //tack1
        for ( int a = 0; a < 10; a++) {
            System.out.println("Итерация цикла " + a);
        }
        //task2
        System.out.println("\n");
        for ( int i = 2020; i < 2070; i = i +4) {
            System.out.println("Весокосный год " + i);
        }
        //tack3
        System.out.println("\n");
        int salary = 65535;
        int total2 = 0;
        for ( int i = 0; i < 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary;
            System.out.println("Месяц " + i + " Итого " + total2);
        }

        System.out.println("\nHomework");
        System.out.println("\nTask 1");

        for ( int z = 1; z <= 10; z++) {
            System.out.println(z);
        }

        System.out.println("\nTask 2");

        for ( int x = 10; x > 0; x--) {
            System.out.println(x);
        }

        System.out.println("\nTask 3");

        for ( int c = 0; c < 17; c = c + 2) {
            System.out.println(c);
        }

        System.out.println("\nTask 4");

        for ( int v = 10; v >= -10; v--) {
            System.out.println(v);
        }

        System.out.println("\nTask 5");

        for ( int b = 1904; b <= 2096; b = b + 4) {
            System.out.println(b + " год является високосным.");
        }

        System.out.println("\nTask 6");

        for ( int n = 7; n <= 98; n = n + 7) {
            System.out.println(n);
        }

        System.out.println("\nTask 7");

        for ( int w = 1; w <= 512; w = w * 2) {
            System.out.println(w);
        }

        System.out.println("\nTask 8");

        int sum = 29_000;
        int total = 0;
        for ( int a = 1; a <= 12; a++){
            total = total + sum;
            System.out.println("Месяц " + a + " сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("\nTask 9");

        int sum1 = 29_000;
        int total1 = 0;
        for ( int s = 1; s <= 12; s++) {
            total1 = total1 + sum1 / 100 ;
            System.out.println("Месяц " + s + " сумма накоплений равна " + total1 + " рублей».");
        }

        System.out.println("\nTask 10");

        int number = 2;
        for ( int k = 1; k <= 10; k++) {
            System.out.println(number + "*" + k + "=" + k * number);
        }
    }
}