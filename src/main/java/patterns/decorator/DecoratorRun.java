package patterns.decorator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;

// ToDo rename Demo and Decorator (package) and push into git.
public class DecoratorRun {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String outDir = "out";
       URL csvUrl = null;
        Path path = Paths.get(outDir);
        if (!Files.isDirectory(path)) {
            try {
                String url = "https://www.stats.govt.nz/assets/Uploads/Business-operations-survey/Business-operations-survey-2022/Download-data/business-operations-survey-2022-price-and-wage-setting.csv";
                csvUrl = new URL(url);
                Files.createDirectory(path);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            // ToDO throw Exceptions based on method signature.
        }
        File outputPath = new File(outDir + "/OutputDemo.txt");
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


        WebDataSource webDataSource = new WebDataSource(csvUrl);
        //  DataSourceDecorator webEncoded =
        //        new CompressionDecorator(new EncryptionDecorator(webDataSource));
        System.out.println("- Input WEB CSV,----------------");
        System.out.println(webDataSource.readData());
        webDataSource.writeData(outDir + "/data.csv");
        DataSourceDecorator sourceDecorator = new DataSourceDecorator(webDataSource);
        sourceDecorator.writeData(sourceDecorator.readData());
    }
}