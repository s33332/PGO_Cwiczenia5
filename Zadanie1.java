class Vehicle {
    start() {
        console.log("Pojazd uruchomiony.");
    }

    stop() {
        console.log("Pojazd zatrzymany.");
    }
}

class Car extends Vehicle {
  numberOfSeats;

    constructor(numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    getNumberOfSeats() {
        return this.numberOfSeats;
    }
}

const myCar = new Car(5);
myCar.start();
myCar.stop();
console.log("Liczba miejsc:", myCar.getNumberOfSeats());