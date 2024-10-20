package org.example;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) * 2;
        }
        System.out.println("Массив случайных четных чисел: " + Arrays.toString(numbers));
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num != min && num != max) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее арифметическое: " + average);
        } else {
            System.out.println("Недостаточно данных ");
        }
    }
}
