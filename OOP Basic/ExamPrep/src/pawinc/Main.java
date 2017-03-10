package pawinc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AnimalCenterManager acm = new AnimalCenterManager();
        String lineInput = reader.readLine();
        while (!lineInput.equals("Paw Paw Pawah")){
            String[]commandArgs = lineInput.split(" \\| ");
            String commandType = commandArgs[0];
            switch (commandType){
                case "RegisterCleaningCenter":
                    acm.registerCleansingCenter(commandArgs[1]);
                    break;
                case "RegisterAdoptionCenter":
                    acm.registerAdoptionCenter(commandArgs[1]);
                    break;
                case "RegisterDog":
                    acm.registerDog(commandArgs[1],
                            Integer.parseInt(commandArgs[2]),
                            Integer.parseInt(commandArgs[3]),
                            commandArgs[4]
                            );
                    break;
                case "RegisterCat":
                    acm.registerCat(commandArgs[1],
                            Integer.parseInt(commandArgs[2]),
                            Integer.parseInt(commandArgs[3]),
                            commandArgs[4]
                    );
                    break;
                case "SendForCleansing":
                    acm.sendForCleansing(commandArgs[1],commandArgs[2]);
                    break;
                case "Cleanse":
                    acm.cleanse(commandArgs[1]);
                    break;
                case "Adopt":
                    acm.adopt(commandArgs[1]);
                    break;
                default:
                    break;
            }
            lineInput = reader.readLine();
        }
        acm.printStatistics();
    }
}
