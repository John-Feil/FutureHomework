package democlass;

public class Jukebox {
    public static void main(String[] args) {
        // Make a object from our Class (template)
        //DataType referenceVariable = newDataType();
        //instance of the class = object == song1
        Song song1 = new Song();
        // Title no no longer public:  song1.title = "Who runs the world";
        // System.out.println(song1.title);
        // song1.setTitle("Who runs the world");
        // System.out.println(song1.getTitle());

        Song song2 = new Song();
        song2.setTitle("POWER");
        song2.setArtist("Kanye West");
        System.out.println(song2.getTitle());
        System.out.println(song2.getArtist());
    }
}
