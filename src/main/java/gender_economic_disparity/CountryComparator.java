package gender_economic_disparity;

import java.util.Comparator;

public class CountryComparator implements Comparator<EconomicInequalityData> {
    @Override
    public int compare(EconomicInequalityData o1, EconomicInequalityData o2) {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}
