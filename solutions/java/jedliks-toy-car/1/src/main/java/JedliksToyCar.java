public class JedliksToyCar {
    private int distance;
    private int battery=100;
    private final static String DRIVEN_METERS = "Driven %s meters";
    private final static String BATTERY_PERCENTAGE="Battery at %d";
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format(DRIVEN_METERS,distance);
    }

    public String batteryDisplay() {
        return battery==0?"Battery empty":String.format(BATTERY_PERCENTAGE,battery)+"%";
    }

    public void drive() {
        if(battery>0){
            distance+=20;
            battery--;
        }
    }
}
