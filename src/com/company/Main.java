package com.company;
class Bicycle  {
    protected String brand = "Ford";
    int cadence = 0;
    int vitesse = 0;
    int engrenage= 1;
    void changerCadence(int newValue) { cadence = newValue; }
    void changerEngrenage(int newValue) { engrenage = newValue; }
    void accelerer(int increment) {vitesse = vitesse + increment; }
    void freiner(int decrement) {vitesse = vitesse - decrement; }
    void afficherEtat()
    {
        System.out.println("cadence:" + cadence + " vitesse:" + vitesse + " engrenage:" + engrenage);
    }
}
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}
class VTT extends Bicycle {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle();
        System.out.println("brand:" + bike1.brand);
    }
}

public class Main {
    public static void main(String[] args) {
	// write your code here
        // Creer deux objets Bicycle
        Pig p =new Pig();
        p.animalSound();
        p.sleep();
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        System.out.println("brand:" + bike1.brand);
        bike1.changerCadence(50);
        bike1.accelerer(10);
        bike1.changerEngrenage(2);
        bike1.afficherEtat();
        bike2.changerCadence(50);
        bike2.accelerer(10);
        bike2.changerEngrenage(2);
        bike2.changerCadence(40);
        bike2.accelerer(10);
        bike2. changerEngrenage(3);
        bike2.afficherEtat();
    }
}
