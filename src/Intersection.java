import java.util.ArrayList;

public class Intersection {
    int id;

    ArrayList<String> incomingStreets;
    ArrayList<String> outgoingStreets;

    public Intersection(int id) {
        this.id = id;
        incomingStreets = new ArrayList<>();
        outgoingStreets = new ArrayList<>();
    }
}
