import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<vehicle> rentedVehicles = new ArrayList<>();


        vehicle carP = new Car();
        Car car = new Car();

        vehicle bikeP = new Bike();
        Bike bike = new Bike();

        vehicle truckP = new Truck();
        Truck truck = new Truck();



            boolean Do = true ;

        do{
            int inputUser  ;

            try{
            System.out.println("Vehicle Rental System \n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles \n" +
                    "5. Exit\n");
                 inputUser = in.nextInt();
                 in.nextLine();

            if(inputUser>5 || inputUser<1){
                throw new Exception ("pleas enter number 1 to 5");
            }
            }catch (InputMismatchException e){
                System.out.println(e);
                    break;
            }catch (Exception e){
                System.out.println(e);
                continue;
            }

            try {
                switch (inputUser){

                    case 1 : {

                        System.out.println("Enter your choice: 1");

                        System.out.print("Enter Car Model: ");
//                        in.nextLine();
                        car.setModel(in.nextLine());

                        System.out.print("\nEnter Rental Days:");

                        car.setDay(in.nextInt());

                        carP.calculateRentalCost();
                        ;

                        rentedVehicles.add(carP);
                        break;
                    }
//                    catch (Exception e) {
//                        System.out.println("Enter real data");
//                    }



                    case 2: {


                        System.out.println("Enter your choice: 2");
                        System.out.print("Enter Car Brand: ");

                        car.setModel(in.nextLine());

                        System.out.print("Enter Rental Days:");

                        bike.setHour(in.nextInt());

                        bikeP.calculateRentalCost();

                        rentedVehicles.add(bikeP);
                        break;
                    }
                    case 3: {

                        System.out.println("Enter your choice: 3");
                        System.out.print("Enter Car Brand: ");

                        truck.setType(in.nextLine());

                        System.out.print("Enter Rental Days:");

                        truck.setWeek(in.nextInt());



                        truckP.calculateRentalCost();

                        rentedVehicles.add(truckP);
                        break;
                    }
                    case 4: {

                        for (vehicle v : rentedVehicles) {

                            v.displayDetails();
                        }
                        break;

                    }
                    case 5: {
                        System.out.println("Thank you for using the Vehicle Rental System!");
                        Do =false ;
                        break;
                    }
                }

            }catch (Exception e){
                System.out.println("please enter a real data!");
            }


        }while (Do == true);


    }
}