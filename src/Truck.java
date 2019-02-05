 class Truck extends Car{

    int weight;

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public Truck(String name, int tank, int averageFuelConsumption, boolean airConditionOn, int weight) {
         super(name, tank, averageFuelConsumption, airConditionOn);
         this.weight = weight;
     }
 }
