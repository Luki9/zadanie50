class Car extends Vehicle {

    private boolean airCondition;

    public boolean AirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airConditionOn) {
        this.airCondition = airConditionOn;
    }

    public Car(String name, int tank, int averageFuelConsumption, boolean airConditionOn) {
        super(name, tank, averageFuelConsumption);
        this.airCondition = airCondition;
    }

    @Override
    double reachDistance() {

        if (airCondition)
            return 100 * getTank()/(getAverageFuelConsumption() + 0.8);

        else return reachDistance();



    }
}


