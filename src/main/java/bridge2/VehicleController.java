package bridge2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VehicleController {

    private static final String ERROR_MESSAGE = "error,error,danger,danger,zły numer";

    //zeby odwolac sie do listy w metodzie statycznej,
    //musi ona też byc statyczna, czyli po private dodajemy static.
                            //musimy dodać new ArrayList do pola, bo
                     //inaczej nie zadziała.
    private static List<IVehicle> vehicles=new ArrayList<>();

    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        //zeby dodac do listy kilka pojazdow, musimy napisac ne Car
        //i w klasie Car stworzyc konstruktor z name.inaczej
        //nie zadziała

        vehicles.add(new Car("trabant"));
        vehicles.add(new Boat("Sołdek"));
        vehicles.add(new Aircraft("Hopsasa"));

        //mamy stworzyć nieskończoną pętlę
        System.out.println(" 1 = move right, 2 = move left, 3 = move up,  4 = move down ");
        System.out.println(" wybierz liczbę od 1-4 : ");

        //System.out.println(vehicles);

        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                processInput(input);
            }else {
                System.out.println(ERROR_MESSAGE);
                scanner.next();
            }



            }}

            //musimy zrobić metodę przypisującą liczbę do określonego ruchu


            private static void processInput ( int input ){
                if (input == 1) {
                    vehicles.forEach(iVehicle -> iVehicle.moveRight());
                } else if (input == 2) {
                    vehicles.forEach(iVehicle -> iVehicle.moveLeft());
                } else if (input == 3) {
                    vehicles.forEach(iVehicle -> iVehicle.moveUp());
                } else if (input == 4) {
                    vehicles.forEach(iVehicle -> iVehicle.moveDown());
                } else {
                    System.out.println(ERROR_MESSAGE);
                }
            }
        }


