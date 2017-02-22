package StaticIdAndRate;


import PersonClass.TestAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, TestAccount> testAccounts = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = "";
        while (!command.equals("End")) {
            String[] commandsArgs = command.split("\\s+");
            String commandType = commandsArgs[0];
            switch (commandType) {
                case "Create":
                    BankAccount account = new BankAccount();
                    System.out.printf("Account %s Created%n", account);
                case "Deposit":

                case "SetInterest":
                        BankAccount.setInterestRate(Double.parseDouble(commandsArgs[1]));
                        break;
                case "GetInterest":
                    System.out.println(testAccounts.get(Integer.parseInt(commandsArgs[1])));
                case "Print":
            }
            command = reader.readLine();
        }
    }
}
