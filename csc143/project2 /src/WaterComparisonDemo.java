import java.util.ArrayList;

public class WaterComparisonDemo {
    public static void main(String[] args) {
        // Sample data
        SortedArrayListInterface<YearlyWaterRecord> waterData = new SortedArrayList<>();
        waterData.add(new YearlyWaterRecord("ETH2020", 50.0, 20.0, 15.0, 15.0));
        waterData.add(new YearlyWaterRecord("ETH2021", 55.0, 18.0, 14.0, 13.0));
        waterData.add(new YearlyWaterRecord("IDN2020", 70.0, 15.0, 10.0, 5.0));
        waterData.add(new YearlyWaterRecord("IDN2021", 75.0, 12.0, 8.0, 5.0));

        // Countries and ISO codes
        String[] countries = {"Ethiopia", "Indonesia"};
        String[] isoCodes = {"ETH", "IDN"};

        // Years
        int[] years = {2020, 2021};

        // Instantiate GUI
        new WaterComparisonGui(waterData, countries, isoCodes, years);
    }
}

