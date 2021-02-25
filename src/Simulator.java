import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulator {
    public static void run(File problem, File solution) throws FileNotFoundException {
        Scanner line = new Scanner(solution);
        String oneLine = line.nextLine();
        int intersectionCount = (new Scanner(oneLine)).nextInt();
        for (int i=0; i<intersectionCount; i++) {
            oneLine = line.nextLine();
            int intersection = (new Scanner(oneLine)).nextInt();
            int streetsGreenFor = (new Scanner(oneLine)).nextInt();
            for (int j = 0; j < streetsGreenFor; j++) {
                Scanner thisLine = new Scanner(line.nextLine());
                String name = thisLine.next();
                int greenFor = thisLine.nextInt();
            }

            String name = "";

        }



    }
}
