import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    File file;

    public Parser(File file){
        this.file = file;
    }

    public String[][] getData() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        ArrayList<String[]> dataList = new ArrayList<>();
        while (scanner.hasNextLine())
        {
            dataList.add(lineSplit(scanner.nextLine()));
        }

        String[][] data = new String[dataList.size()][];
        for(int i = 0; i < data.length; i++){
            data[i] = dataList.get(i);
        }
        return data;
    }

    public Problem parse() throws FileNotFoundException {
        Parser parser = new Parser(file);

        int d, I, S, V, F;
        String[][] data = getData();

        d = Integer.parseInt(data[0][0]);
        I =Integer.parseInt(data[0][1]);
        S = Integer.parseInt(data[0][2]);
        V = Integer.parseInt(data[0][3]);
        F = Integer.parseInt(data[0][4]);

        ArrayList<Street> streets = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        for(int i = 1; i <= S; i++){
            int start = Integer.parseInt(data[i][0]);
            int end = Integer.parseInt(data[i][1]);
            String name = data[i][2];
            int time = Integer.parseInt(data[i][3]);
            streets.add(new Street(start,end,name,time));
        }

        for(int i = 1; i <= V; i++){
            int streetsNum = Integer.parseInt(data[i+S][0]);
            ArrayList<String> streetNames = new ArrayList<>();
            for(int j = 1; j <= streetsNum; j++){
                streetNames.add(data[i+S][j]);
            }
            cars.add(new Car(streetsNum, streetNames));
        }
        return new Problem(d, I, S, V, F, cars, streets);
    }


    public String[] lineSplit(String input){
        String[] tokens = input.split(" ");
        return tokens;
    }


}
