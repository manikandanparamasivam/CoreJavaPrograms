package CoreJava.OOP;

public class TestSong {
    public static void main(String[] args) {


        Song s1 = new Song();
        Song s2 = new Song();
        s1.setSongName("abhioooo");
        s1.setLyrics("Malama Pitha Pithadhe Malama Pitha Pithadhe Mala Pitha Pithadhe Malama Pithadhe Hey Malama Pitha Pithadhe Malama Pitha Pithadhe Mala Pitha Pithadhe Malama Pithadhe");
        s1.playSong();
        System.out.println("songname:"+s1.getSongName());
        s2.setSongName("WestonSong");
        s2.setLyrics("One of them ones Right Weston Road Flows, I did this sh_t for my n_gga Renny Back when we couldn't buy pizza cause we were down to pennies Feel like we go back a century runnin");
        s2.playSong();
        System.out.println("songname:"+s2.getSongName());
    }
}
