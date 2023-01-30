public class BonusMilesService {
    public int calculate(int cost) {

        if (cost < 0) {
            cost = 0;
        }

        return cost / 20 / 100;
    }

    public int calculate(int miles){
        if (miles < 0) {
            miles = 0;
            }

            return miles / 30 / 200;
        }

    }

