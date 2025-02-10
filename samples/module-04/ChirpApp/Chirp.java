package ChirpApp;

import java.util.Date;

class Chirp {
    private String content;
    private String author;
    private int likes;
    private Date timestamp;

    public Chirp(String content, String author) {
        this.content = content;
        this.author = author;
        this.likes = 0;
        this.timestamp = new Date(); // Automatically sets the current time
    }

    public void likeChirp() {
        likes++;
    }

    public void displayChirp() {
        System.out.println("@" + author + ": " + content + " [" + likes + " Likes] - " + timestamp);
    }
}


