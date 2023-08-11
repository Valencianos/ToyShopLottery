package ToyShopModules;

import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;

public class Launch {
    public static void main(String[] args) throws IOException {
        Lottery lottery = new Lottery();
        // Добавляем игрушки в магазин
        Lottery.put("1 Ball 10 0.10");
        Lottery.put("2 Doll 15 0.15");
        Lottery.put("3 Car 7 0.07");
        Lottery.put("4 Mosaic 5 0.06");
        Lottery.put("5 Lego 3 0.04");
        Lottery.put("6 Gum 20 0.20");
        Lottery.put("7 Clock 8 0.08");
        Lottery.put("8 Coupon 30 0.30");

        // Вызываем метод getToyById() 10 раз
        for (int i = 0; i < 10; i++) {
            int wonToyId = Lottery.getToyId();
            Toys wonToy = Lottery.getToyById(wonToyId);
            if (wonToy != null) {
                System.out.println("Выиграна игрушка: " + wonToy.getName() + " (id: " + wonToy.getId() + ", вес: " + wonToy.getFreq() + ")");
            } else {
                System.out.println("Игрушки закончились");
            }
        }

        // Сохраняем результаты в файл
        Lottery.saveToFile("Result.txt");
    }
}
