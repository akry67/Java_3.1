public class BonusMilesService {
    public int calculate(int cost) {
        int rubleMile = 20;
        int Miles = cost / rubleMile;

        return Miles;
    }
}