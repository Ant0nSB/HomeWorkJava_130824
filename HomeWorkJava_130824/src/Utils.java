import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static boolean isNumInArray(int[] arr, int num) {
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getUserArray() {
        Scanner scan = new Scanner(System.in);
        int[] userNums = new int[ConstantsClass.COUNT_SET_SIZE];
        int count = 0;

        while (count < userNums.length) {
            System.out.println("Введите уникальный номер (от 1 до 50): ");
            int userNum = scan.nextInt();

            if (userNum >= 1 && userNum <= 50 && !isNumInArray(userNums, userNum)) {
                userNums[count] = userNum;
                count++;
            } else {
                System.out.println("Неверный ввод или номер уже введен. Попробуйте снова.");
            }
        }
        return userNums;
    }

    public static int[] getLuckyArray() {
        int[] luckyNums = new int[ConstantsClass.COUNT_SET_SIZE];
        Random random = new Random();
        int count = 0;

        while (count < luckyNums.length) {
            int luckyNum = random.nextInt(50) + 1;

            if (!isNumInArray(luckyNums, luckyNum)) {
                luckyNums[count] = luckyNum;
                count++;
            }
        }
        return luckyNums;
    }

    public static int winNums(int[] arr1, int[] arr2) {
        int numWin = 0;
        for (int num : arr1) {
            if (isNumInArray(arr2, num)) {
                numWin++;
            }
        }
        return numWin;
    }

    public static void printWinResult(int num) {
        System.out.println("Совпало " + num + " значений");
    }
}
