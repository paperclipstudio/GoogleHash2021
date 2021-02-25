import java.util.ArrayList;

public class Problem {

    static int d,i,s,v,f;
    ArrayList<Street> streets = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();

    public Problem(int d, int i, int s, int v, int f, ArrayList<Car> cars, ArrayList<Street> streets) {
        this.d = d;
        this.i = i;
        this.s = s;
        this.v = v;
        this.f = f;
        this.streets = streets;
        this.cars = cars;
    }

    public void print() {
        for(Street s : streets){
            System.out.println(s.toString());
        }

        for(Car c : cars){
            System.out.println(c.toString());
        }
    }
}
