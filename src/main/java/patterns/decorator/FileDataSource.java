package patterns.decorator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(File name) {
        this.name = name.getAbsolutePath();
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = Files.newOutputStream(file.toPath())) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
