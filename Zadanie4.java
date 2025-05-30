class Animal {
    sleep() {
        console.log("Zwierzę śpi.");
    }

    makeNoise() {
        console.log("Zwierzę wydaje dźwięk.");
    }

    roam() {
        console.log("Zwierzę się przemieszcza.");
    }
}

class Feline extends Animal {
    roam() {
        console.log("Kotowate przemieszczają się.");
    }
}

class Canine extends Animal {
    roam() {
        console.log("Psy wędrują.");
    }
}

class Lion extends Feline {
    makeNoise() {
        console.log("Lew ryczy.");
    }
}

class Cat extends Feline {
    makeNoise() {
        console.log("Kot miauczy.");
    }
}

class Wolf extends Canine {
    makeNoise() {
        console.log("Wilk wyje.");
    }
}

class Dog extends Canine {
    makeNoise() {
        console.log("Pies szczeka.");
    }
}