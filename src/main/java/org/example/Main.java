package org.example;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.
        // giveMeMyFloatBack(); // - вот он;
       // fixMyCode1(); // - задача 1 на ревью - проинициализирован массив
       // fixMyCode2(); // - задача 2 на ревью
        // Здесь необходимо изменить иерархию "вылова" ошибок
        // в методе printSum необходимо заменить throws FileNotFoundException на IllegalArgumentException
    checkYourStringForVoid();// - проверка на пустую строку и выброс ошибки
    }

    private static void checkYourStringForVoid() {
        System.out.print("Type yor string here: ");
        try (Scanner input = new Scanner(System.in)) {
            String str = input.nextLine();
                if (str.isEmpty()) {
                    throw new Exception("It can't be void string!");
                } else {
                    System.out.println(str);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }

    private static void fixMyCode2() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws IllegalArgumentException {
        System.out.println(a + b);
    }


    private static void fixMyCode1() {
        try {
            int d = 0;
            int[] intArray = new int[]{3,4,5,7,7,8,9,0,12,56}; // не понял что нужно сделать
            // поэтому просто проинициализировал массив, иначе Java:Error, а её не обработать
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    private static void giveMeMyFloatBack() {
        Scanner input = new Scanner(System.in);
        double whatYourFloat = 0.0;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Pls, type your float here: ");
                whatYourFloat = input.nextFloat();
                flag = true;
            } catch (InputMismatchException n) {
                System.out.print("The number you've typed is not a float(e.g. 45,5). Try again! \n");
                input.nextLine();
            }
        }
        input.close();
        System.out.println("You typed: " + whatYourFloat + ". Well Done!");
    }
}