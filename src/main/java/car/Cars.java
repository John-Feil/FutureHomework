package car;

public class Cars {
    private String name;
    private String color;
    private String[] songList = {"Song1","Song2","Song3"};

    public void setName(String carName){
        this.name = carName;
    }
    public void setColor(String carColor){
        this.color = carColor;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public void getRandomSong(){
        int length = songList.length;
        double rand = Math.random() * length;
        System.out.println(rand);
        System.out.println(songList[(int) rand]);
    }

}
