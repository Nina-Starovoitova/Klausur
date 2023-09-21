package patterns.decorator;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.opencsv.*;

public class WebDataSource implements DataSource {
    private final URL url;
    private CSVReader reader;

    public WebDataSource(URL csvUrl) {
        this.url = csvUrl;
    }


    @Override
    public void writeData(String outputPath) {
        try {
            FileWriter fileWriter = new FileWriter(outputPath);
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            List<String[]> content = this.reader.readAll();
            csvWriter.writeAll(content);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public String readData() {
        String content= "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(this.url.openStream()));
            this.reader = new CSVReader(in);
            String row;
            while ((row = in.readLine()) != null) {
                content += row;
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return content;
    }
    // ToDo save as a file on a HD.

}
