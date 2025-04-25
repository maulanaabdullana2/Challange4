package tugas4;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Income("D 1001 UM", Types.SUV, 2010, 350_000_000, 4, 500_000, 0, 150_000, 0, 0, LocalDate.of(2023, 1, 10));
        Vehicle v2 = new Income("D 1002 UM", Types.SUV, 2015, 350_000_000, 4, 500_000, 0, 150_000, 0, 0, LocalDate.of(2023, 1, 12));
        Vehicle v3 = new Income("D 1003 UM", Types.SUV, 2010, 350_000_000, 5, 500_000, 0, 150_000, 0, 0, LocalDate.of(2023, 1, 13));
        Vehicle v4 = new Income("D 1004 UM", Types.SUV, 2015, 350_000_000, 5, 500_000, 0, 150_000, 0, 0, LocalDate.of(2023, 1, 13));
        Vehicle v5 = new Income("D 11 UK", Types.Taxi, 2002, 175_000_000, 4, 0, 0, 0, 45, 4500, LocalDate.of(2023, 1, 10));
        Vehicle v6 = new Income("D 12 UK", Types.Taxi, 2015, 225_000_000, 4, 0, 0, 0, 75, 4500, LocalDate.of(2023, 1, 12));
        Vehicle v7 = new Income("ID8089", Types.PrivateJet, 2018, 1_500_000_000_000L, 14, 0, 0, 55_000_000, 0, 0, LocalDate.of(2023, 1, 15));
        Vehicle v8 = new Income("Boat18", Types.Boat, 2002, 2_000_000_000, 12, 0, 0, 10_000_000, 0, 0, LocalDate.of(2023, 1, 21));
        Vehicle v9 = new Income("D 13 UK", Types.Taxi, 2020, 275_000_000, 4, 0, 0, 0, 90, 4500, LocalDate.of(2023, 1, 18));
        Vehicle v10 = new Income("ID9999", Types.PrivateJet, 2020, 1_750_000_000_000L, 12, 0, 0, 75_000_000, 0, 0, LocalDate.of(2023, 1, 23));

        List<Vehicle> listVehicle = List.of(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);

        long subTotal = 0;
        long totalIncomeCar = 0;
        long totalIncomeBoat = 0;
        int SUV = 0, Taxi = 0, Plane = 0, Boat = 0;
        long totalTax = 0;

        for (Vehicle vehicle : listVehicle) {
            System.out.println(vehicle.toString());

            subTotal += vehicle.getTotal();
            totalTax += vehicle.getTax();

            if (vehicle.getVehicleType() == Types.SUV || vehicle.getVehicleType() == Types.Taxi) {
                totalIncomeCar += vehicle.getTotal();
                if (vehicle.getVehicleType() == Types.SUV) SUV++;
                else Taxi++;
            } else if (vehicle.getVehicleType() == Types.Boat) {
                totalIncomeBoat += vehicle.getTotal();
                Boat++;
            } else if (vehicle.getVehicleType() == Types.PrivateJet) {
                Plane++;
            }
        }

        System.out.println();
        System.out.println("Subtotal: " + subTotal);
        System.out.println("TotalTax: " + totalTax);
        System.out.println("TotalIncomeCar: " + totalIncomeCar);
        System.out.println("TotalIncomeBoat: " + totalIncomeBoat);
        System.out.println("TotalCar: " + (SUV + Taxi));
        System.out.println("TotalPlane: " + Plane);
        System.out.println("TotalBoat: " + Boat);
    }
}
