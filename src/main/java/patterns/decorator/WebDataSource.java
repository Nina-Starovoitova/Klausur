package patterns.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class WebDataSource implements DataSource {
    private final URL url;
    private CSVReader reader;

    public WebDataSource(URL csvUrl) {
        this.url = csvUrl;
    }


    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        BufferedReader in = null;
        String content= "";
        try {
            in = new BufferedReader(new InputStreamReader(this.url.openStream()));

            this.reader = new CSVReader(in);
            String row;
            while ((row = in.readLine()) != null) {
                content +=row;
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return content;
    }
    // ToDo find a datasource and implement pull data and save as a file on a HD.

}
