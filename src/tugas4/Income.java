package tugas4;

import java.time.LocalDate;

public class Income extends Vehicle {
    private LocalDate transactionDate;
    private int rent;
    private int orderPerHours;
    private int drive;
    private int order;
    private int orderPerkm;
    private long total;

    public Income(String noRegister, Types vehicleType, int year, long price, int seat, long tax,
                  int rent, int orderPerHours, int drive, int order, int orderPerkm, LocalDate transactionDate) {
        super(noRegister, vehicleType, year, price, seat, tax);
        this.rent = rent;
        this.orderPerHours = orderPerHours;
        this.drive = drive;
        this.order = order;
        this.orderPerkm = orderPerkm;
        this.transactionDate = transactionDate;
        this.total = calculateTotal(vehicleType);
    }

    private long calculateTotal(Types type) {
        if (type == Types.SUV) {
            return rent + orderPerHours + drive;
        } else if (type == Types.Taxi) {
            return (long) order * orderPerkm;
        } else if (type == Types.PrivateJet || type == Types.Boat) {
            return drive;
        } else {
            return 0;
        }
    }

    @Override
    public long getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TransactionDate=" + transactionDate +
                ", Rent=" + rent +
                ", OrderPerHours=" + orderPerHours +
                ", Drive=" + drive +
                ", Order=" + order +
                ", OrderPerKm=" + orderPerkm +
                ", Total=" + total;
    }
}
