public class ChirpApp {
    public static void main(String[] args) {
        User alice = new User("Alice", "alice@example.com");
        User bob = new User("Bob", "bob@example.com");

        // Follow/unfollow actions
        alice.follow(bob);
        bob.follow(alice);

        // Posting tweets
        alice.chirp("Hello world!");
        bob.chirp("Just had coffee!");

        // Like a chirp
        Chirp sampleChirp = new Chirp("Learning Java!", "Alice");
        bob.likeChirp(sampleChirp);

        // Display tweets
        System.out.println("\nAlice's Chirps:");
        alice.showChirps();
        
        System.out.println("\nBob's Chirps:");
        bob.showChirps();
    }
}
