public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        System.out.println("Correct cost: ");
        int CostIsCorrect = service.calculate(200_00);
        System.out.println(CostIsCorrect);

        System.out.println("CostIsUnder0: ");
        int CostIsUnder0 = service.calculate(-200_00);
        System.out.println(CostIsUnder0);

        System.out.println("CostIsLessThan20: ");
        int CostIsLessThan20 = service.calculate(1_00);
        System.out.println(CostIsLessThan20);

        System.out.println("CostIs20: ");
        int CostIs20 = service.calculate(20_00);
        System.out.println(CostIs20);
    }
}