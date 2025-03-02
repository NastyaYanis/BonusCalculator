public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); // Создаём объект сервиса
        int price = 10_000; // Цена билета
        int miles = service.calculate(price); // Рассчитываем бонусные мили
        System.out.println("Начисленные мили: " + miles); // Вывод результата
    }
}
