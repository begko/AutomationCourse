public class Main {
    public static void main(String[] args) {

        // --- Singleton usage ---
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();

        // --- Builder usage ---
        GameCharacter character = new GameCharacter.Builder()
                .setName("Begum")
                .setHealth(95)
                .setPower(75)
                .build();

        // Print the created character
        System.out.println(character);

        gameManager.stopGame();
    }
}
