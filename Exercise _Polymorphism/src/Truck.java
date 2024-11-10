public class Truck implements vehicle {

private static String type ;
private static int week ;



    public Truck() {
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return getWeek() * 500;
    }

    @Override
    public void displayDetails() {


         System.out.println("Truck Type: "+getType()+"\n " +
                "Weekly Rental Rate: 500.0\n" +
                " Rental Cost: "+calculateRentalCost()+"\n");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "type='" + type + '\'' +
                ", week=" + week +
                '}';
    }
}
