 class Vehicle {

    private String name;
    private int tank;
    private  int averageFuelConsumption;

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

     public int getAverageFuelConsumption() {
         return averageFuelConsumption;
     }

     public void setAverageFuelConsumption(int averageFuelConsumption) {
         this.averageFuelConsumption = averageFuelConsumption;
     }

     public Vehicle(String name, int tank, int averageFuelConsumption) {
         this.name = name;
         this.tank = tank;
         this.averageFuelConsumption = averageFuelConsumption;
     }
 }
