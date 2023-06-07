public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа № 3");


        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4),

        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };
        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };

        Transport[] transports = new Transport[cars.length + bicycles.length + trucks.length];

        for (int i = 0; i < cars.length; i++) {
            transports[i] = cars[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            transports[i + cars.length] = bicycles[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + cars.length + bicycles.length] = trucks[i];
        }


       for (Car car : cars) {
            car.updateTyre();
            car.checkEngine();
         }

        for (Bicycle bicycle : bicycles) {
             bicycle.updateTyre();
          }


        for (Truck truck : trucks) {
            truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();
        }


















    }
}

