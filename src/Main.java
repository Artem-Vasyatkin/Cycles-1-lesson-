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
        int total = 0;
        for ( int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
    }
}