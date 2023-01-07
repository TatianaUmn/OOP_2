package Task3;

public class Cat extends Animal implements Action{
    

    public Cat(String name, boolean hungry, int age) {
        super(name, hungry, age);
    }

    
   
    @Override
    public void come() {
        System.out.println("котик " + name + " идет к хозяину");
        
    }

    @Override
    public void stand() {
        System.out.println("котик " + name + " не идет к чужому человеку");
        
    }

    @Override
    public void eating() {
        if (hungry) {
            System.out.println("котик " + name + " просит у хозяина кушать");
        } else {
            System.out.println("котик " + name + " не голоден");
        }
    }
    
}