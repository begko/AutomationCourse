public class GameCharacter {

    private String name;
    private int health;
    private int power;

    // Private constructor → can only be accessed by Builder
    private GameCharacter() { }

    @Override
    public String toString() {
        return "GameCharacter {" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", power=" + power +
                '}';
    }

    // BUILDER CLASS
    public static class Builder {

        private String name;
        private int health;
        private int power;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setPower(int power) {
            this.power = power;
            return this;
        }

        public GameCharacter build() {
            GameCharacter character = new GameCharacter(); // <--- new here!
            character.name = this.name;
            character.health = this.health;
            character.power = this.power;
            return character;
        }
    }
}
