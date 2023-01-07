package Task3;

public abstract class Animal implements Comparable<Animal>{

    protected String name;
    protected boolean hungry;
    protected int age;

    public Animal(String name, boolean hungry, int age) {
        this.name = name;
        this.hungry = hungry;
        this.age = age;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHungry() {
        return hungry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }

    public String toString() {
        return name;
    }
}
