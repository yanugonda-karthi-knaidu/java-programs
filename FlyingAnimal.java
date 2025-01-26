interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class FlyingAnimal implements Animal, Bird {
    public void eat() {
        System.out.println("Flying animal eats");
    }

    public void fly() {
        System.out.println("Flying animal flies");
    }

    public static void main(String[] args) {
        FlyingAnimal fa = new FlyingAnimal();
        fa.eat();
        fa.fly();
    }
}
