package patterns.decorator;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;
// ToDo rename Demo and Decorator (package) and push into git.
public class DecoratorRun {
    public static void main(String[] args) throws IOException {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String outDir = "out";
        Path path = Paths.get(outDir);
        if (!Files.isDirectory(path)){
            Files.createDirectory(path);
        }
        File outputPath = new File (outDir + "/OutputDemo.txt");
        FileDataSource dataSource = new FileDataSource(outputPath);
        DataSourceDecorator encoded =
                new CompressionDecorator(new EncryptionDecorator(dataSource));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(outputPath);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

        String url = "https://www.stats.govt.nz/assets/Uploads/Business-operations-survey/Business-operations-survey-2022/Download-data/business-operations-survey-2022-price-and-wage-setting.csv";
        URL csvUrl = new URL(url);
        WebDataSource webDataSource = new WebDataSource(csvUrl);
      //  DataSourceDecorator webEncoded =
        //        new CompressionDecorator(new EncryptionDecorator(webDataSource));
        System.out.println("- Input WEB CSV,----------------");
        System.out.println(webDataSource.readData());
    }
}