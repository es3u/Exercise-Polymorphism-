public   class Car implements vehicle {

    private static String model ;
    private static int day ;


    public Car() {
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public double calculateRentalCost() {
        return day * 50;
    }


    public void displayDetails() {

        System.out.println("Car Model: "+getModel()+"\n " +
                "Daily Rental Rate: $50.0\n" +
                " Rental Cost: "+calculateRentalCost()+"\n");


    }


    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", day=" + day +
                '}';
    }
}
