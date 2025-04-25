package tugas4;

public class Vehicle {
    private String noPolice;
    private Types vehicleType;
    private int year;
    private long price;
    private int seat;
    private long tax;

    public Vehicle(String noPolice, Types vehicleType, int year, long price, int seat) {
        this.noPolice = noPolice;
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.seat = seat;
        this.tax = (long) (price * 0.01);
    }

    public String getNoPolice() {
        return noPolice;
    }

    public Types getVehicleType() {
        return vehicleType;
    }

    public int getYear() {
        return year;
    }

    public long getPrice() {
        return price;
    }

    public int getSeat() {
        return seat;
    }

    public long getTax() {
        return tax;
    }


    public long getTotal(){
        return 0;
    }


    @Override
    public String toString() {
        return "NoPolice='" + noPolice + '\'' +
                ", Type=" + vehicleType +
                ", Year=" + year +
                ", Price=" + price +
                ", Seat=" + seat +
                ", Tax=" + tax + ", ";
    }
}
