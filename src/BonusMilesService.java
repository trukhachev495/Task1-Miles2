public class BonusMilesService {

    public int calculate(int cost) {

        int amountOfRublesForOneMile = 20;
        int bonusMiles = cost / amountOfRublesForOneMile;
        return bonusMiles;
    }


}
