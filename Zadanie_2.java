import java.util.Arrays;

public class Zadanie_2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        sumNumbers();
        polarityNumbers();
        truthPolarity();
        repeatLines();
        leapYears();
        booleanArray();
        longArray();
        multiplyArray();
        bivariateArray();
        refundArray();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 21;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    public static void sumNumbers() {
        int a = 5;
        int b = 16;
        boolean c = (a + b <= 20) && (a + b >= 10);
        System.out.println(c);
    }
    public static void polarityNumbers() {
        int a = -1;
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static void truthPolarity() {
        int a = -1;
        boolean b = a < 0;
        System.out.println(b);
    }
    public static void repeatLines() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Указанная строка");
        }
    }
    public static void leapYears() {
        int year = 904;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
                System.out.println(leapYear);
    }
    public static void booleanArray() {
        int[] nums = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                nums[i] = 0;
            } else nums[i] = 1;
            System.out.print(nums[i] + " ");
    }}
    public static void longArray() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
    }}
    public static void multiplyArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }}
    public static void bivariateArray() {
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }    else {
                        table[i][j] = 0;
                    }
                    System.out.println();
                }}}
    public static void refundArray() {
        int len = 6;
        int initialValue = 78;
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }

    }
}