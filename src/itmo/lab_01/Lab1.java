package itmo.lab_01;

import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args)
    {
        /** Лаба1. Упражнение 1. */

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");


        /** Лаба1. Упражнение 2. */

        double rez1 = (46 + 10) * ( (double)10 / (double)3 );
        double rez2 = 29 * 4 * (-15);

        System.out.println(rez1);
        System.out.println(rez2);


        /** Лаба1. Упражнение 3. */

        int number = 10500;
        double rezult = ((double)number/(double)10)/(double)10;
        System.out.println(rezult);


        /** Лаба1. Упражнение 4. */

        double n1 = 3.6;
        double n2 = 4.1;
        double n3 = 5.9;
        double rezult2 = n1 * n2 * n3;
        System.out.println(rezult2);


        /** Лаба1. Упражнение 5. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int a2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int a3 = scanner.nextInt();

        System.out.println("Вы ввели следующие числа: ");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        /** Лаба1. Упражнение 6. */

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите число b: ");
        int b = scanner2.nextInt();

        if (b % 2 != 0)
        {
            System.out.println("Нечетное");
        }
        else
        {
            if (b > 100)
            {
                System.out.println("Выход за пределы диапазона");
            }
            else
            {
                System.out.println("Четное");
            }
        }
    }
}
