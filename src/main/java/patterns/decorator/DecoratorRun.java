package patterns.decorator;
// ToDo rename Demo and Decorator (package) and push into git.
public class DecoratorRun {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        FileDataSource dataSource = new FileDataSource("out/OutputDemo.txt");
        DataSourceDecorator encoded =
                new CompressionDecorator(new EncryptionDecorator(dataSource));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}