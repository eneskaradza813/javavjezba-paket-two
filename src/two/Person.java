package two;

public class Person {

   private String name;
   private String surname;
   private int age;
   
    public Person(String name, String surname, int mladost){
        this.name = name;
        this.surname = surname;
        this.age = mladost;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    
    
}
