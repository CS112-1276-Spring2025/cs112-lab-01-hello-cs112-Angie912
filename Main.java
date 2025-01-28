public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS112! from Angelina.");
        System.out.println("I will tell you a bit about myself!");

        Main.animals();

        System.out.println("Do I like geckos?" + Main.isAnimal("crested gecko"));
        System.out.println("Do I like cats?" + Main.isAnimal("cats"));
    
    }
    public static void animals() {
        System.out.println("I own a leopard gecko, crested gecko, posion dart frog and a dog!");

    }

    public static boolean isAnimal(String topic) {
        String myAnimals = "I own a leopard gecko, crested gecko, posion dart frog and a dog!";

        return myAnimals.contains(topic);
    }

}