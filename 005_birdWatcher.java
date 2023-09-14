
class BirdWatcher {
    private final int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int [] days = birdsPerDay;
        int length = days.length - 1;
        for (int i = 0; i < length; i++) {
            days[i] = days[i+1];
        }
        days[length] = days[length - 1] + 1;

    }

    public boolean hasDayWithoutBirds() {
        /*int [] days = this.birdsPerDay;
        for (int i:days) {
            if(days[i] == 0) return true;
        }
        return false;*/
        int [] days = birdsPerDay;
        for (int i = 0; i < 6; i++) {
            if(birdsPerDay[i] == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumFirstDays = 0;
        int[] days = this.birdsPerDay;
        if (numberOfDays > 7)
            for (int i = 0; i < days.length; i++) {
                sumFirstDays += days[i];
            }
        else {
            for (int i = 0; i < numberOfDays; i++) {
                sumFirstDays += days[i];
            }
        }
        return sumFirstDays;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < 6; i++) {
            if (birdsPerDay[i] >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
