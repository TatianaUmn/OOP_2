package Task1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Reserch implements PrintingFile{
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> filterAge(int age) {
            for (Node t : tree) {
            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }
        return resultAge;
    }


    @Override
    public void write(ArrayList<String> n) throws IOException {
        FileWriter fileWriter = new FileWriter("Tree.txt");
        for (String elemet : n) {
            fileWriter.append(elemet + " ");
        }
        fileWriter.close();
    }
    
}

