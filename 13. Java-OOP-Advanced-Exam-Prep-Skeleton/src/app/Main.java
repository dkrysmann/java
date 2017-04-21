package app;

import app.models.strategies.RecyclableGarbageStrategy;
import app.models.strategies.StorableGarbageStrategy;
import app.models.wastes.BurnableGarbage;
import app.models.strategies.BurnableGarbageDisposalStrategy;
import app.models.wastes.RecyclableGarbage;
import app.models.wastes.StorableGarbage;
import app.waste_disposal.DefaultGarbageProcessor;
import app.waste_disposal.annotations.Burnable;
import app.waste_disposal.annotations.Recyclable;
import app.waste_disposal.annotations.Storable;
import app.waste_disposal.contracts.GarbageProcessor;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static GarbageProcessor garbageProcessor = new DefaultGarbageProcessor();
    static double energyBalance = 0;
    static double capitalBalnce = 0;
    public static void main(String[] args){

        addStragies(garbageProcessor);

    }

    private static void addStragies(GarbageProcessor garbageProcessor) {
        garbageProcessor.getStrategyHolder().addStrategy(Burnable.class,new BurnableGarbageDisposalStrategy());
        garbageProcessor.getStrategyHolder().addStrategy(Recyclable.class,new RecyclableGarbageStrategy());
        garbageProcessor.getStrategyHolder().addStrategy(Storable.class,new StorableGarbageStrategy());
    }
    private static void processCommand(String commandArg){
        String[] args = commandArg.split("\\|");
        String wasteName = args[0];
        double wasteWeight = Double.parseDouble(args[1]);
        double wasteVolumePerKg = Double.parseDouble(args[2]);
        String typeOfWaste = args[3];

        Waste waste = null;
        switch (typeOfWaste){
            case "Recyclable":
                waste = new RecyclableGarbage(wasteName,wasteWeight,wasteVolumePerKg);
                break;
            case "Burnable":
                waste = new BurnableGarbage(wasteName,wasteWeight,wasteVolumePerKg);
                break;
            case "Storable":
                waste = new StorableGarbage(wasteName,wasteWeight,wasteVolumePerKg);
                break;
        }
       ProcessingData processingData = garbageProcessor.processWaste(waste);
        energyBalance += processingData.getEnergyBalance();
        capitalBalnce += processingData.getCapitalBalance();
        System.out.printf("%.2f kg of %s successfully processed!%n",wasteWeight,wasteName);
    }
}
