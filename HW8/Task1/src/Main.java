public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.print("Развернутый массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
