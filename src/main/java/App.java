import classes.Thermometer;
import classes.UserOne;
import classes.UserTwo;

public class App {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        thermometer.addSubscriber(new UserOne());
        thermometer.addSubscriber(new UserTwo());

        thermometer.startMeasuring();
    }
}
