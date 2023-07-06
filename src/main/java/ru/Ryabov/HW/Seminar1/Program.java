package ru.Ryabov.HW.Seminar1;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }
    static void menu() {
        boolean f = true;
        while (f) {
            System.out.println("\nВведите номер задачи");
            System.out.println("Задача № 1 - Треугольного число");
            System.out.println("Задача № 2 - Вывести все простые числа от 1 до 1000");
            System.out.println("Задача № 3 - Простой калькулятор");
            System.out.println("Введите 'exit' для выхода");
            String number = scanner.nextLine();

            switch (number) {

                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "exit":
                    System.out.println("\nВыход из приложения");
                    scanner.close();
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }
    }



    // Вывести все простые числа от 1 до 1000
    static void task2(){
        {
            for (int i = 2; i <= 1000; i++) {
                boolean easy = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        easy = false;

                    }
                }
                if (easy) {
                    System.out.println(i);

                }
            }
        }
    }

    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static void task1(){
        System.out.println("\nВведите положительное число 'n': ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int factr=1;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
            factr *= i;
        }
        System.out.printf("%d треугольное число (%d - Сумма чисель от 1 до %d\n", n, sum, n);
        System.out.printf("%d - Произведение чисел от 1 до %d(факториал)\n", factr, n);
    }

    // Реализовать простой калькулятор
    static void task3(){

            Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);
            System.out.println("Это есть простой калькулятор,\n он выполняет всего 4(четыре) действия: +, -, *, /.\n" +
                    "Прозьба не пытаться вводить другие операции!\n" +
                    "А теперь введите нужную комбинацию :)");
            System.out.print("\nВведите первое число: ");
            int a = scnr.nextInt();
            System.out.print("Введите одну из операций: ");
            String str = scnr2.nextLine();
            System.out.print("Введите второе число: ");
            int b = scnr.nextInt();

            switch (str) {

                case "+":
                    int c = a + b;
                    System.out.printf("%d + %d = %d\n", a, b, c);
                    break;
                case "-":
                    c = a - b;
                    System.out.printf("%d - %d = %d\n", a, b, c);
                    break;
                case "*":
                    c = a * b;
                    System.out.printf("%d * %d = %d\n", a, b, c);
                    break;
                case "/":
                    c = a / b;
                    System.out.printf("%d / %d = %d\n", a, b, c);
                    break;
//                case "q":     хотел реализовать выход в предыдущее меню, но оно не работает
//                    menu();
//                    break;
                default:
                    System.out.println("\nНекорректный ввод.\nПовторите ввод.\n");
                    task3(); // Здесь рекурсия, надеюсь это приемлимо, ведь нам говорили что рекурсия не есть хорошо
                    break;   // но здесь она вроде выглядит безобидно :)

        }
    }
}

