public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int total_units=speed*221;
       return speed<=4?total_units:speed<9?total_units*0.9:speed==9?total_units*0.8:total_units*0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed)/60;
    }
}
