public class Octopus {
    int tentacles = 8;

    public static void main(String[] args) {
        Octopus Tom = new Octopus();
        System.out.println("Tom has " + Tom.tentacles + " tentacles.");
        Tom.tentacles -= 2;
        System.out.println("Due to violent dolphins Tom now has " + Tom.tentacles + " tentacles left.");

    }
}
