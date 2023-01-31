public class BonusMilesService {
    public int calculate(int cost) {
        int miles = cost / 20;

        if (cost < 0) {
            cost = 0;
        }
        return miles;
    }
}



