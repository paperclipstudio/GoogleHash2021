import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class GeorgeMain {
    static int D, I, S, V, F;

    static String f1 = "src\\a.txt";
    static String f2 = "src\\b.txt";
    static String f3 = "src\\c.txt";
    static String f4 = "src\\d.txt";
    static String f5 = "src\\e.txt";
    static String f6 = "src\\f.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Parser parser = new Parser(new File(f1));
        Problem problem = parser.parse();
        HashMap<String, Integer> frequency = countStreets(problem);
        frequency.forEach((name, count) -> {
            System.out.println(name + ":" + count);
        });
    }

    public static HashMap<String, Integer> countStreets(Problem prob) {
        HashMap<String, Integer> result = new HashMap<>();
       for (Car car: prob.cars) {
           for (String name: car.names) {
               Integer before = result.getOrDefault(name, 0);
               result.put(name, before + 1);
           }
       }
       return result;
    }
}
