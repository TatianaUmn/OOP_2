package Task1;

import java.util.ArrayList;

public class GeoTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendPatent(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
             
        
    }

    public void appendBrother(Person brother, Person sister) {
        tree.add(new Node(brother, Relationship.brother, sister));
        tree.add(new Node(sister, Relationship.sister, brother));
        
    }

    public void appendWife(Person husband, Person wife) {
        tree.add(new Node(husband, Relationship.husband, wife));
        tree.add(new Node(wife, Relationship.wife, husband));
    }
       
}

