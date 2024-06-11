package gender_economic_disparity;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadCSV {


    private final File file;

    public ReadCSV(String fileName){
        this.file = new File(fileName);
    }


    public EconomicInequalityData readFile() {
        EconomicInequalityData economicInequalityData = null;
        try(Scanner scanner = new Scanner(file)){
            scanner.nextLine();
            String[] data = scanner.nextLine().split(",");
            economicInequalityData = new EconomicInequalityData(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
            Set<EconomicInequalityData> dataSet = new TreeSet<>();
            dataSet.add(economicInequalityData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return economicInequalityData;
    }


    public static void main(String[] args) {
        ReadCSV readCSV = new ReadCSV("data.csv");
        EconomicInequalityData e=readCSV.readFile();
        System.out.println("The country with the highest wage gap is "+ e.getCountry()+": "+ e.getWageGap());
    }
}
