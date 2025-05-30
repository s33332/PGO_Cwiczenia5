class Animal {
    sleep() {
        console.log("Zwierzę śpi.");
    }

    roam() {
        console.log("Zwierzę się przemieszcza.");
    }

    makeNoise() {
        console.log("Zwierzę wydaje dźwięk.");
    }
}

class Lion extends Animal {
    makeNoise() {
        console.log("Lew ryczy.");
    }
}

class Cat extends Animal {
    makeNoise() {
        console.log("Kot miauczy.");
    }
}

class Wolf extends Animal {
    makeNoise() {
        console.log("Wilk wyje.");
    }
}

class Dog extends Animal {
    makeNoise() {
        console.log("Pies szczeka.");
    }
}

const lion = new Lion();
lion.makeNoise();