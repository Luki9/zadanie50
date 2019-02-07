class Truck extends Car {

    int load;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public Truck(String name, int tank, int averageFuelConsumption, boolean airConditionOn, int load) {
        super(name, tank, averageFuelConsumption, airConditionOn);
        this.load = load;
    }

    @Override
    double reachDistance() {
        double reachDistance;
        if (getLoad() > 0 && AirCondition())
            reachDistance = 100 * getTank() / getAverageFuelConsumption() + 1.6 + 0.5 * getLoad() / 300;


        if (getLoad() > 0 && !AirCondition())
            reachDistance = 100 * getTank() / getAverageFuelConsumption() + 1.6 * getLoad() / 300;
        else reachDistance = super.reachDistance();

        return reachDistance;
    }

    void printInfo() {
        super.printinfo();
        System.out.println();

    }
}

