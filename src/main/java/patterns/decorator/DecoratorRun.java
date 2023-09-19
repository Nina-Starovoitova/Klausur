package patterns.decorator;
import java.io.File;
import java.io.IOException;
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
    }
}