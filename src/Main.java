class Main {
    public static void main(String[] args) {

        Car[] car = new Car[3];
        car[0] = new Car("Volvo ", 60, 8, false);
        car[1] = new Car("Audi", 50, 7, false);
        car[2] = new Truck("Iveco", 200, 20, false, 300);


        for (int i = 0; i < car.length; i++) {

            car[i].printinfo();


        }

    }


}
