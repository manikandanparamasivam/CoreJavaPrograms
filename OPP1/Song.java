package CoreJava.OOP;

public class Song {
    private String songName="";
    private  String lyrics="";
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public void setLyrics(String lyrics){
        this.lyrics=lyrics;
}
    public  void playSong() {
        System.out.println(songName+" lyrics:"+lyrics);
    }

    public String getSongName() {
        return songName;
    }

    public String getLyrics() {
        return lyrics;
    }
}

