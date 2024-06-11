package gender_economic_disparity;

import java.util.Comparator;

public class YearComparator implements Comparator<EconomicInequalityData> {

    @Override
    public int compare(EconomicInequalityData o1, EconomicInequalityData o2) {
        return o1.getYear() - o2.getYear();
    }
}
