package Ferrari;

public class Ferrari implements Car{
    private String model;
    private String driverName;

    public Ferrari(String model,String driverName){
        this.model = model;
        this.driverName = driverName;
    }

    @Override
    public String pushBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getDriverName() {
        return this.driverName;
    }
}
