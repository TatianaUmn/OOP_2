package Task3;

public class Dog extends Animal implements Action{

    private int height;

    public Dog(String name, boolean hungry, int age, int height) {
        super(name, hungry, age);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    
   
    @Override
    public void come() {
        System.out.println("пёс по имени " + name + " идет к хозяину");
        
    }

    @Override
    public void stand() {
        System.out.println("пёс по имени " + name + " не идет к чужому человеку");
        
    }

    @Override
    public void eating() {
        if (hungry) {
            System.out.println("пёс по имени " + name + " просит у хозяина кушать");
        } else {
            System.out.println("пёс по имени " + name + " не голоден");
        }
        
    }
    
}

