public class App {
    public static void main(String[] args) throws Exception {
        
        Person kim = new Person();
        Person tung = new Vietnamese();

        kim.setName("Kim");
        kim.setAge(30);
        kim.status();
        kim.eat();

        tung.setName("Tung");
        tung.setAge(22);
        tung.setHobby("games");
        tung.status();
        tung.eat();

        
    }
}
