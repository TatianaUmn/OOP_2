package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", true);
        Person person2 = new Person("Петр", false);
        Cat cat = new Cat("Васька", true);
        Dog dog = new Dog("Шарик", false);
        
    
        System.out.println("Кого нужно позвать? \n"
            + "1 - котика \n"
            + "2 - пса");
        Scanner in = new Scanner(System.in);
        int animalChoice = in.nextInt();
        in.close();

        person.animalCall(animalChoice, person, dog, cat);
        System.out.print("\n");
        person2.animalCall(animalChoice, person, dog, cat);
        
        
    }
       
}
