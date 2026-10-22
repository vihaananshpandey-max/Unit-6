public class Artwork {
    String name;
    String artist;
    int year;

    public Artwork(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public static void main(String[] args) {
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo da Vinci", 1503);
        Artwork raft = new Artwork("The Raft of the Medusa", "Théodore Géricault", 1818);
        System.out.println("This work is called" + raft.name + ".");
        System.out.println("It was created by " + raft.artist + " in " + raft.year + ".");
    }
}
