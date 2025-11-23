public class GameManager {

    // Holds the single instance of the class
    private static GameManager instance;

    // Private constructor → prevents external instantiation
    private GameManager() { }

    // Returns the single instance of GameManager
    public static GameManager getInstance() {
        if (instance == null) {   // Create instance only once
            instance = new GameManager();
        }
        return instance;
    }

    // Example method
    public void startGame() {
        System.out.println("Game started by game manager!");
    }

    // Example method
    public void stopGame() {
        System.out.println("Game stopped by game manager!");
    }
}
