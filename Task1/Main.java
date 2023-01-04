package Task1;

public class Main {
    public static void main(String[] args) throws Exception{
        Person irina = new Person("Ирина", 48);
        Person mark = new Person("Марк", 50);
        Person vasya = new Person("Вася", 28);
        Person katya = new Person("Катя", 27);
        Person masha = new Person("Маша", 21);
        Person jane = new Person("Женя", 2);
        Person ivan = new Person("Ваня", 5);
        GeoTree gt = new GeoTree();
        gt.appendPatent(irina, vasya);
        gt.appendPatent(irina, masha);
        gt.appendPatent(mark, vasya);
        gt.appendPatent(mark, masha);
        gt.appendPatent(vasya, jane);
        gt.appendPatent(vasya, ivan);
        gt.appendPatent(katya, jane);
        gt.appendPatent(katya, ivan);
        gt.appendBrother(ivan, jane);
        gt.appendBrother(vasya, masha);
        gt.appendWife(mark, irina);
        gt.appendWife(vasya, katya);

        Reserch newReserch = new Reserch(gt);

        System.out.println("Дети Ирины: ");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        newReserch.write(new Reserch(gt).spend(irina, Relationship.parent));

        System.out.println("Сестры Ивана: ");
        System.out.println(new Reserch(gt).spend(ivan,
                Relationship.brother));
        

        System.out.println("Муж Кати: ");
        System.out.println(new Reserch(gt).spend(katya,
                Relationship.wife));

        System.out.println("Люди младше 25 лет: ");
        System.out.println(new Reserch(gt).filterAge(25)); 
        
    }

}
