// ToshibaBattery.java
public class ToshibaBattery extends Battery {
    private double voltage;
    private double current;
    private double energy;
    private double extraEnergy;

    public ToshibaBattery(double voltage, double current, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.current = current;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    @Override
    double getPower() {
        return voltage * current;
    }

    @Override
    double getLifeTime() {
        return (energy + extraEnergy) / getPower();
    }
}
