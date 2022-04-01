package democlass;

public class Song {

    private String title; // instance variable | field | attribute | properties
    private String artist; // ^^

    public void setTitle(String titleName) {
        this.title = titleName;
    }
    public String getTitle(){
        return this.title;
    }
    public void setArtist(String artistName){
        this.artist = artistName;
    }
    public String getArtist(){
        return this.artist;
    }



}
