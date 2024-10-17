import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException{

        long totalCovid = 0;

        long withCovidColumn = Files.lines(Paths.get("data.csv"), StandardCharsets.UTF_8)
        .getFirst()
        .map(line -> line.split(";"))
        

        long withCovid = Files.lines(Paths.get("data.csv"), StandardCharsets.UTF_8)
            .map(line -> line.split(";"))
            .filter(line -> line[136].equals("1"))
            .count();

            // System.out.println(withCovid);

            long covidVaccinated = Files.lines(Paths.get("data.csv"), StandardCharsets.UTF_8)
            .map(line -> line.split(";"))
            .filter(line -> line[136].equals("1"))
            .filter(line -> line[154].equals("1"))
            .count();
            // .filter(line -> line[136].equals("1"))
            // .collect(Collectors.toList()); 

            System.out.println(covidVaccinated);

    }
}
