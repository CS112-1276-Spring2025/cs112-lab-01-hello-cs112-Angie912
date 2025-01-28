public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS112! from Angelina.");
        System.out.println("I will tell you a bit about myself!");

        Main.animals();
        //String writer, String illustrator, String colorist, String title, int issueNume
        Comic favorite = new Comic();
        
        // i dont know why my default int displays 0 isntead of 115. I set it to work around my default.
        favorite.setIssueNum(115);

        System.out.println("My favorite comic is... " + favorite);

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