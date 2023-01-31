public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int cost = 10_000;
        int miles = service.calculate(cost);
        System.out.println(miles);
        System.out.println("For the cost of " + cost + " you will receive " + miles + " miles");

    }
}