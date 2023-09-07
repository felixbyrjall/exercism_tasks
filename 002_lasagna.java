// Task: Cook your Lasagna
// https://exercism.org/tracks/java/exercises/lasagna/


public class Lasagna {
    int COOKING_TIME = 40;
    int TIME_PER_LAYER = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return COOKING_TIME;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timePassed){
        expectedMinutesInOven();
        return expectedMinutesInOven() - timePassed;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes (int amountOfLayers){
        return TIME_PER_LAYER * amountOfLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes (int amountOfLayers, int timePassed){
        return (amountOfLayers * TIME_PER_LAYER) + timePassed;
    }
}

