package ChirpApp;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String email;
    private List<User> followers;
    private List<User> following;
    private List<Chirp> chirps;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.chirps = new ArrayList<>();
    }

    public void follow(User user) {
        if (!this.following.contains(user)) {
            this.following.add(user);
            user.followers.add(this);
            System.out.println(this.username + " followed " + user.username);
        }
    }

    public void unfollow(User user) {
        if (this.following.contains(user)) {
            this.following.remove(user);
            user.followers.remove(this);
            System.out.println(this.username + " unfollowed " + user.username);
        }
    }

    public void chirp(String message) {
        Chirp newTweet = new Chirp(message, this.username);
        this.chirps.add(newTweet);
        System.out.println(this.username + " chirpeed: " + message);
    }

    public void likeChirp(Chirp tweet) {
        tweet.likeChirp();
        System.out.println(this.username + " liked a chirp.");
    }

    public void showChirps() {
        for (Chirp tweet : this.chirps) {
            tweet.displayChirp();
        }
    }
}