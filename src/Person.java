public class Person {
    
    private int age;
    private String name;
    private String hobby = "nothing";
    private String food = "food";
    
    public void eat(){
        System.out.println("Eats: " + food);
    }

    public void status(){
        System.out.println(name + ": " + age + " years old, hobby is " + hobby);
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }    

    public String getHobby(){
        return hobby;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }        
}
