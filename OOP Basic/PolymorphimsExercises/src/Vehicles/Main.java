package Vehicles;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] carInfo = reader.readLine().split("\\s+");
        String[] truckInfo = reader.readLine().split("\\s+");
        int inputCommands = Integer.parseInt(reader.readLine());
        Vehicle car = new Car(Double.valueOf(carInfo[1]),Double.valueOf(carInfo[2]));
        Vehicle truck = new Truck(Double.valueOf(truckInfo[1]),Double.valueOf(truckInfo[2]));
        for (int i = 0; i < inputCommands; i++) {
            String[] commandsToken = reader.readLine().split("\\s+");
            try {
                if (commandsToken[0].toLowerCase().equals("drive")) {
                    if (commandsToken[1].toLowerCase().equals("car")) {
                        car.driveInKm(Double.valueOf(commandsToken[2]));
                    } else {
                        truck.driveInKm(Double.valueOf(commandsToken[2]));
                    }
                    DecimalFormat df = new DecimalFormat("#.#########################");
                    System.out.println(commandsToken[1] + " travelled " + df.format(Double.valueOf(commandsToken[2])) + " km");
                } else {
                    if (commandsToken[1].toLowerCase().equals("car")) {
                        car.refuel(Double.valueOf(commandsToken[2]));
                    } else {
                        truck.refuel(Double.valueOf(commandsToken[2]));
                    }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(car);
        System.out.println(truck);
        }
    }
