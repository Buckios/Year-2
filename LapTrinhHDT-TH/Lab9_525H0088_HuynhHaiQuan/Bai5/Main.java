public class Main {
    public static void main(String[] args) {
        CharacterManagement manager = new CharacterManagement();
        
        Character baseCharacter = new Character("Warrior", 10, 100, 50, 30);
        manager.serializeCharacter(baseCharacter, "character.ser");

        Character loadedCharacter = manager.deserializeCharacter("character.ser");
        if (loadedCharacter != null) {
            System.out.println(loadedCharacter);
            
            Character modifiedCharacter = manager.action(loadedCharacter);
            System.out.println(modifiedCharacter);
            
            manager.serializeCharacter(modifiedCharacter, "hero.ser");
            
            Character finalCharacter = manager.deserializeCharacter("hero.ser");
            System.out.println(finalCharacter);
        }
    }
}