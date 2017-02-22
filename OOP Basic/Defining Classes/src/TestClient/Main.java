package TestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,TestAccount> testAccounts = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = "";
        while (!command.equals("End")){
            String[] commandsArgs = command.split("\\s+");
            String commandType = commandsArgs[0];
            switch (commandType){
                case "Create":
                    executeCreateCommand(testAccounts, commandsArgs[1]);
                    break;
                case "Deposit":
                    executeDepositCommand(testAccounts, commandsArgs);
                    break;
                case "Withdraw":
                    executeWithdrawCommand(testAccounts,commandsArgs);
                    break;
                case "Print":
                    executePrintCommand(testAccounts,commandsArgs);
                    break;
            }
            command = reader.readLine();
        }
    }

    private static void executePrintCommand(HashMap<Integer, TestAccount> testAccounts, String[] commandsArgs) {
        int id = Integer.parseInt(commandsArgs[1]);
        TestAccount testAccount = testAccounts.get(id);
        if (!testAccounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else{
            System.out.printf("Account %s, balance %.2f%n",testAccount,testAccount.getBalance());
        }
    }

    private static void executeWithdrawCommand(HashMap<Integer, TestAccount> testAccounts, String[] commandsArgs) {
        int id = Integer.parseInt(commandsArgs[1]);
        double amount = Double.parseDouble(commandsArgs[2]);
        if(!testAccounts.containsKey(id)){
            System.out.println("Account does not exist");
            return;
        }
        try {
            testAccounts.get(id).withdraw(amount);
        }catch (IllegalStateException ilgl){
            System.out.println(ilgl.getMessage());
        }
    }

    private static void executeDepositCommand(HashMap<Integer, TestAccount> testAccounts, String[] commandsArgs) {
        int id = Integer.parseInt(commandsArgs[1]);
        double amount = Double.parseDouble(commandsArgs[2]);
        if(!testAccounts.containsKey(id)){
            System.out.println("Account does not exist");
            return;
        }

        try {
            testAccounts.get(id).deposit(amount);
        }catch (IllegalArgumentException ilgl){
            System.out.println(ilgl.getMessage());
        }
    }

    private static void executeCreateCommand(HashMap<Integer, TestAccount> accounts, String commandsArg) {
        int id = Integer.parseInt(commandsArg);
        if(accounts.containsKey(id)){
            System.out.printf("Account already exists%n");
        }else{
           TestAccount testAccount = new TestAccount();
           testAccount.setId(id);
           accounts.put(id,testAccount);
        }
    }
}
