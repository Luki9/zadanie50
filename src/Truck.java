 class Truck extends Car{

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
         return super.reachDistance();
         reachDistance()
     }
 }

