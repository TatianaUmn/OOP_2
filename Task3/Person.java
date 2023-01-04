package Task3;

public class Person {
    private String name;
    private boolean owner;

    public Person(String name, boolean owner) {
        this.name = name;
        this.owner = owner;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOwner() {
        return owner;
    }

    public void animalCall(int animalChoice, Person person, Dog dog, Cat cat) {
        if(animalChoice == 1) {
            if(owner) {
                System.out.println(name + " зовет: " + cat.getName() + " иди ко мне.");
                cat.come(); 
                cat.eating();
            } else {
                System.out.println(name + " зовет: " + cat.getName() + " иди ко мне."); 
                cat.stand();
                }
        } else if(animalChoice == 2) {
            if(owner) {
                System.out.println(name + " зовет: " + dog.getName() + " иди ко мне.");
                dog.come(); 
                dog.eating();
            } else {
                System.out.println(name + " зовет: " + dog.getName() + " иди ко мне."); 
                dog.stand();
                }

        }
    }

}
