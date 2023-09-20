package patterns.decorator;

import java.net.MalformedURLException;

public interface DataSource {
    void writeData(String data);

    String readData() throws MalformedURLException;
}
