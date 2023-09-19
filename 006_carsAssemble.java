public class CarsAssemble {
    public int carsPerSpeed = 221;

    public double productionRatePerHour(int speed) {
        double result;
        if (speed >= 4) {
            result = carsPerSpeed * speed;
        } else if (speed >= 8) {
            result = (carsPerSpeed * speed) * 0.9;
        } else if (speed == 9) {
            result = (carsPerSpeed * speed) * 0.8;
        } else {
            result = (carsPerSpeed * speed) * 0.77;
        }
        return result;
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHours = productionRatePerHour(speed);
        int carsPerMinute = (int)carsPerHours / 60;
        return carsPerMinute;
    }
}
