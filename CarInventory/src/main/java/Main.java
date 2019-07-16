//THIS CLASS SHOULD SHOULD GET THE USER INPUT AND ADD IT
//TO THE CAR INVENTORY LIST AND RUN ALL FUNCTIONS
import java.util.Arrays;
import java.util.Scanner;//IMPORT THE SCANNER CLASS
import java.util.ArrayList;//IMPORT THE ARRAY LIST CLASS
import java.util.List;

public class Main {
    //THIS PROGRAM KEEPS TRACK OF THE
    //INVENTORY OF CARS
    public static void main(String[] args) {
        char quit = 'Y';
        String action;
        //CREATE AN OBJECT OF CAR INVENTORY CLASS TO USE ITS VARIABLES
        CarInventory car = new CarInventory();
        //CREATES AN ARRAY LIST
        ArrayList<CarInventory> carList = new ArrayList<>();

        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter your action: ");
            action = scanner.next();

            switch (action) {
                case "add":
                    //KEEPS ASKING USER FOR INPUT TO ADD TO CAR INVENTORY UNTIL THE USER
                    //STATES THAT THEY DO NOT HAVE ANOTHER RECORD
                    do {

                        System.out.println("Car Make: ");
                        car.make = scanner.next();

                        System.out.println("Car Model: ");
                        car.model = scanner.next();

                        System.out.println("Car Year: ");
                        car.year = scanner.nextInt();

                        System.out.println("Car Color: ");
                        car.color = scanner.next();

                        System.out.println("Car Miles: ");
                        car.miles = scanner.nextInt();

                        //ADDS ALL INPUTS INTO THE CAR LIST
                        carList.add(new CarInventory(car.make, car.model, car.year, car.color, car.miles));

                        //ASKS USER IF THEY WOULD LIKE TO ENTER ANOTHER ENTRY
                        System.out.print("Enter Another Car Record? (Y/N)");
                        String word = scanner.next();//CREATES A VAR THAT WILL READ IN THE INPUT FROM USER
                        word = word.toUpperCase();//IF THE USER ENTERS A LOWERCASE LETTER THEN IT WILL MAKE IT A UPPERCASE
                        quit = word.charAt(0);//IT THEN TAKES THE INPUT AND SAVES IT TO QUIT TO SEE IF THE LOOP WILL CONT.
                    } while (quit == 'Y');
                    break;
                case "delete":
                    //ASKS USER TO ENTER THE MAKE AND MODEL OF CAR TO BE DELETED
                    System.out.println("Please Enter the Make you Would Like to Delete: ");
                    String deleteMake = scanner.next();
                    System.out.println("Please Enter the Model you Would Like to Delete: ");
                    String deleteModel = scanner.next();
                    //DELETES A CAR FROM INVENTORY
                    for (int x = 0; x < carList.size(); x++) {//GOES THROUGH THE ENTIRE CAR INVENTORY
                        //IF INPUT MATCHES THE MAKE AND MODEL FROM THE INVENTORY
                        if (carList.get(x).getMake().equals(deleteMake) && carList.get(x).getModel().equals(deleteModel)) {
                            carList.remove(x);//THEN DELETE THAT CAR
                        }
                    }
                    break;
                case "list":
                    if (carList.size() > 0) {//IF CAR LIST IS NOT EMPTY
                        //PRINTS OUT THE ENTIRE CAR LIST
                        for (int i = 0; i < carList.size(); i++) {
                            System.out.print(carList.get(i).getMake() + " ");
                            System.out.print(carList.get(i).getModel() + " ");
                            System.out.print(carList.get(i).getYear() + " ");
                            System.out.print(carList.get(i).getColor() + " ");
                            System.out.println(carList.get(i).getMiles() + " ");
                        }
                    } else {
                        System.out.println("Car Inventory is Empty!");//PRINT THIS IF IT IS EMPTY
                    }
                    break;
                case "search":
                    System.out.println("Please Enter Search Type: ");
                    String type = scanner.next();
                    switch (type) {
                        case "make":
                            System.out.println("Car Make: ");
                            String searchMake = scanner.next();
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getMake().equals(searchMake)) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;

                        case "model":
                            System.out.println("Car Model: ");
                            String searchModel = scanner.next();
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getModel().equals(searchModel)) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;
                        case "year":
                            System.out.println("Car Year: ");
                            int searchYear = scanner.nextInt();
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getYear() == searchYear) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;
                        case "color":
                            System.out.println("Car Color: ");
                            String searchColor = scanner.next();
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getColor().equals(searchColor)) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;
                        case "miles":
                            System.out.println("Please Enter the Maximum Number of Miles: ");
                            int maxMiles = scanner.nextInt();
                            //carList.get(x).getMiles() <= maxMiles
                            for (int x = 0; x < carList.size(); x++) {
                                if (carList.get(x).getMiles() <= maxMiles) {
                                    System.out.print(carList.get(x).getMake() + " ");
                                    System.out.print(carList.get(x).getModel() + " ");
                                    System.out.print(carList.get(x).getYear() + " ");
                                    System.out.print(carList.get(x).getColor() + " ");
                                    System.out.println(carList.get(x).getMiles() + " ");
                                }
                            }

                            break;

                        default:
                            break;
                    }
            }
        } while (!"quit".equals(action));
    }
}