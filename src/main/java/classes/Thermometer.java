package classes;

public class Thermometer extends Publisher{
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(){
        for (int i = 0; i < 10; i++){
            temperature = (int)(10 + (Math.random()*12));
            notify(temperature);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
