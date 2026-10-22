public class Shelter {
    public static void main(String[] args) {
        Dog Millie = new Dog();
        Millie.setName("Millie");
        Millie.setBreed("Beagle");
        Millie.setAge(3);
        System.out.println("This is " + Millie.getName() + ".");
        System.out.println("She is a " + Millie.getAge() + " year old " + Millie.getBreed() + ".");
        System.out.println(
                "She is highly dangerous to all except those who adopt her so save yourself before it's too late.");

    }
}
