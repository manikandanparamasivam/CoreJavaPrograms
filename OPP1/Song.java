public class Song {
    private String songName="";
    private  String lyrics="";

    public void setSongName(String songName) {
        if(songName!=null&&songName!=""){
        this.songName = songName;
        }else{
            System.out.println("Enter a valid Sting");
        }
    }
    public void setLyrics(String lyrics){
        if(lyrics!=null&&lyrics!=""){
        this.lyrics=lyrics;
        }else{
            System.out.println("Enter a valid Sting");
        }
}
    public  void playSong() {
        System.out.println(songName+": lyrics:"+lyrics);
    }

    public String getSongName() {
        return songName;
    }

    public String getLyrics() {
        return lyrics;
    }
}

