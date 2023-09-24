package patterns.decorator;

import com.opencsv.*;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class WebDataSource implements DataSource {
    private final URL url;
    private final String outputPath;
    private List<String[]> reader;

    public WebDataSource(URL csvUrl, String outputPath) {
        this.url = csvUrl;
        this.outputPath = outputPath;
    }


    @Override
    public void writeData(String data) {
        try {
            FileWriter fileWriter = new FileWriter(outputPath);
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            List<String[]> content = this.reader;
            csvWriter.writeAll(content);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public String readData() {
        StringBuilder content= new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(this.url.openStream()));
            this.reader = new CSVReader(in).readAll();
            String row;
            while ((row = in.readLine()) != null) {
                content.append(row);
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }

}
