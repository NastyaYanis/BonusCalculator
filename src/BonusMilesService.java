public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRuble = 20; // 1 миля за каждые 20 рублей
        return price / milesPerRuble; // Целочисленное деление, дробные мили не учитываются
    }
}
