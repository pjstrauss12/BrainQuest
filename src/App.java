public class App {
    public static void main(String[] args) throws Exception {
        //Welcome message
        System.out.println("Welcome to BrainQuest!");
        
        //instantiate a creature object by calling its constructor
        Creature c = new Creature("Sphynx", 50);
        
        System.out.println(c.toString());
    }

    
}
