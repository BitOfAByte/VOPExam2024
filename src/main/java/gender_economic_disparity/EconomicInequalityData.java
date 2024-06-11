package gender_economic_disparity;

import java.util.Set;
import java.util.TreeSet;

public class EconomicInequalityData implements Comparable<EconomicInequalityData> {
    private final String country, code;
    private final int year;
    private final double wageGap;

    public EconomicInequalityData(String country, String code, int year, double wageGap) {
        this.country = country;
        this.code = code;
        this.year = year;
        this.wageGap = wageGap;
    }

    public String getCountry() {
        return country;
    }

    public String getCode() {
        return code;
    }

    public int getYear() {
        return year;
    }

    public double getWageGap() {
        return wageGap;
    }

    @Override
    public String toString() {
        return String.format("%s \t \t %s \t \t %d \t \t %.2f\n", getCountry(), getCode(), getYear(), getWageGap());
    }

    @Override
    public int compareTo(EconomicInequalityData e) {
        return Double.compare(this.wageGap, e.wageGap);
    }


    public static void main(String[] args) {
        System.out.println("Sorting based on Wage Gap");
        Set<EconomicInequalityData> e1= new TreeSet<>();
        e1.add(new EconomicInequalityData("Brazil","BRA" ,1981, 34.21));
        e1.add(new EconomicInequalityData("Uruguay","URY", 1989,22.22));
        e1.add(new EconomicInequalityData("Argentina","ARG",2004,02.08));
        System.out.println(e1);

        System.out.println("Sorting based on Year");
        Set<EconomicInequalityData> e2 = new TreeSet<>(new YearComparator());
        e2.addAll(e1);
        System.out.println(e2);

        System.out.println("Sorting based on Country");
        Set<EconomicInequalityData> e3 = new TreeSet<>(new CountryComparator());
        e3.addAll(e1);
        System.out.println(e3);
    }


}