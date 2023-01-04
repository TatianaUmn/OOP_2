package Task3;

public abstract class Animal {

    protected String name;
    protected boolean hungry;

    public Animal(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
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
}
