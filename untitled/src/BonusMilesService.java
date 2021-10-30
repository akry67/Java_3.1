public class BonusMilesService {
    public long calculate(int cost) {
        int rubleMile = 20;
        int Miles = cost / rubleMile;

        return Miles;
    }
}