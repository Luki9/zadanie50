class Vehicle {

    private String name;
    private int tank;
    private double averageFuelConsumption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public Vehicle(String name, int tank, double averageFuelConsumption) {
        this.name = name;
        this.tank = tank;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    double reachDistance() {
        return 100 * getTank() / getAverageFuelConsumption();
    }
    void printinfo(){

        System.out.println(getName());
        System.out.println(getAverageFuelConsumption());
        System.out.println(getTank());
    }
}
