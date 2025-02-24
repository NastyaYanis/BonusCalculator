import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Объявляем переменные
        int initialBalance = 100; // Начальная сумма на счёте
        int rechargeAmount = 1100; // Сумма пополнения

        // Проверка, если пополнение больше 1000 рублей
        int bonus = 0;
        if (rechargeAmount > 1000) {
            // Рассчитываем бонус
            bonus = (rechargeAmount / 100);  // за каждые 100 рублей — 1 рубль бонуса
        }

        // Итоговая сумма на счёте
        int finalBalance = initialBalance + rechargeAmount + bonus;

        // Выводим результаты
        System.out.println("Сумма пополнения: " + rechargeAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговая сумма на счёте: " + finalBalance + " рублей");
    }
}
