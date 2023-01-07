package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", true);
        Person person2 = new Person("Петр", false);
        Cat cat = new Cat("Васька", true, 1);
        Dog dog = new Dog("Шарик", false, 12, 60);
        Animal animal = new Cat("Мурзик", false, 5);
        Animal animal2 = new Cat("Барсик", false, 10);
        Dog animal3 = new Dog("Пушок", false, 6, 40);
        Dog animal4 = new Dog("Тузик", false, 4, 70);


        ArrayList<Animal> myList = new ArrayList<>();
        myList.add(animal);
        myList.add(animal2);
        myList.add(animal3);
        myList.add(animal4);
        myList.add(cat);
        myList.add(dog);
        System.out.println("Первоначальный список животных: " + myList);
        System.out.println("Список животных по возрасту: ");

        Collections.sort(myList);
        for (Animal a : myList) {
            animal.compareTo(a);
            System.out.println(a.toString());
        }

        ArrayList<Dog> dogArray = new ArrayList<>();
        dogArray.add(dog);
        dogArray.add(animal3);
        dogArray.add(animal4);
        System.out.println("Первоначальный список собак: " + dogArray);
        Collections.sort(dogArray, new DogComparator());
        System.out.println("Список собак по росту: " + dogArray);

        System.out.println("Список крупных собак: ");
        for (Dog element : dogArray) {
            if(element.getHeight() > 45)
            System.out.println(element);
        }

   
        System.out.println("Кого нужно позвать? \n"
            + "1 - котика \n"
            + "2 - пса");
        Scanner in = new Scanner(System.in);
        int animalChoice = in.nextInt();
        in.close();

        person.animalCall(animalChoice, person, dog, cat);
        System.out.print("\n");
        person2.animalCall(animalChoice, person, dog, cat);
        System.out.print("\n"); 
        
    }
       
}

