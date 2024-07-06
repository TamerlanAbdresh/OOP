// Main.java
public class Main {
    public static void main(String[] args) {
        ToshibaBattery toshiba1 = new ToshibaBattery(3.7, 1.5, 5000, 1000);
        ToshibaBattery toshiba2 = new ToshibaBattery(3.7, 1.6, 5100, 1100);
        ToshibaBattery toshiba3 = new ToshibaBattery(3.7, 1.7, 5200, 1200);
        ToshibaBattery toshiba4 = new ToshibaBattery(3.7, 1.8, 5300, 1300);
        ToshibaBattery toshiba5 = new ToshibaBattery(3.7, 1.9, 5400, 1400);

        DuracellBattery duracell1 = new DuracellBattery(3.7, 1.5, 5000, 0.1);
        DuracellBattery duracell2 = new DuracellBattery(3.7, 1.6, 5100, 0.2);
        DuracellBattery duracell3 = new DuracellBattery(3.7, 1.7, 5200, 0.3);
        DuracellBattery duracell4 = new DuracellBattery(3.7, 1.8, 5300, 0.4);
        DuracellBattery duracell5 = new DuracellBattery(3.7, 1.9, 5400, 0.5);

        FlashLight flashLight1 = new FlashLight(new Battery[]{toshiba1, duracell1});
        FlashLight flashLight2 = new FlashLight(new Battery[]{toshiba2, duracell2});
        FlashLight flashLight3 = new FlashLight(new Battery[]{toshiba3, duracell3});
        FlashLight flashLight4 = new FlashLight(new Battery[]{toshiba4, duracell4});
        FlashLight flashLight5 = new FlashLight(new Battery[]{toshiba5, duracell5});

        FlashLight[] flashLights = {flashLight1, flashLight2, flashLight3, flashLight4, flashLight5};

        double maxLifeTime = 0;

        for (FlashLight flashLight : flashLights) {
            double lifeTime = flashLight.getTotalLifeTime();
            System.out.println("FlashLight lifetime: " + lifeTime);
            if (lifeTime > maxLifeTime) {
                maxLifeTime = lifeTime;
            }
        }

        System.out.println("FlashLight with maximum lifetime: " + maxLifeTime);
    }
}
