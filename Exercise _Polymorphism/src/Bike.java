public class Bike implements vehicle {
private static String brand ;
private static int hour ;

    public Bike() {
    }

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return   getHour() * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+getBrand()+"\n " +
                "Hourly Rental Rate: 10.0\n" +
                " Rental Cost: "+calculateRentalCost()+"\n");


    }


    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", hour=" + hour +
                '}';
    }
}
