import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

class Car {
    private String model;
    private int topSpeed;
    private float acceleration;
    private float braking;
    private float cornering;

    // escriu el codi aqui


    public Car(String model, int topSpeed, float acceleration, float braking, float cornering) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.braking = braking;
        this.cornering = cornering;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getBraking() {
        return braking;
    }

    public void setBraking(float braking) {
        this.braking = braking;
    }

    public float getCornering() {
        return cornering;
    }

    public void setCornering(float cornering) {
        this.cornering = cornering;
    }
}

public class b0ae0cotxeclassl0 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.ENGLISH);

            int numCars = scanner.nextInt();
            scanner.nextLine();

            Car[] cars = new Car[numCars];

            for (int i = 0; i < numCars; i++) {
                cars[i] = new Car(scanner.nextLine(), scanner.nextInt(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
                scanner.nextLine();
            }

            Arrays.sort(cars, Comparator.comparingInt(a -> -a.getTopSpeed()));
            for (int i = 0; i < numCars; i++) {
                System.out.format("%-20s  %4d  %4.2f  %4.2f  %4.2f %n", cars[i].getModel(), cars[i].getTopSpeed(), cars[i].getAcceleration(), cars[i].getBraking(), cars[i].getCornering());
            }
        }

}
