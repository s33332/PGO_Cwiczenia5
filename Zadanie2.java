class Car extends Vehicle {
  numberOfSeats;

    constructor(numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    getNumberOfSeats() {
        return this.numberOfSeats;
    }

    start() {
        console.log("Samochód uruchomiony.");
    }

    stop() {
        console.log("Samochód zatrzymany.");
    }
}

const newCar = new Car(4);
newCar.start();
newCar.stop();