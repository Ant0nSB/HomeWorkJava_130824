import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class LotteryClass {

    public void run() {
        // Генерация выигрышных номеров
        int[] luckyNums = Utils.getLuckyArray();

        // Запуск игры для трех игроков
        for (int i = 1; i <= ConstantsClass.COUNT_PLAYER; i++) {
            System.out.println("Игрок " + i + ", введите ваши номера:");
            int[] userNums = Utils.getUserArray();

            // Вывод номеров на консоль
            System.out.println("Номера лотереи: ");
            Utils.printArray(luckyNums);
            System.out.println("Номера игрока " + i + ": ");
            Utils.printArray(userNums);

            // Проверка совпадений и вывод результата
            int countWin = Utils.winNums(luckyNums, userNums);
            Utils.printWinResult(countWin);
        }
    }
}
