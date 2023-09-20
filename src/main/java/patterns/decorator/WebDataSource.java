package patterns.decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class WebDataSource implements DataSource {
    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() throws MalformedURLException {
        URL stockURL = new URL("http://example.com/stock.csv");
        BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));
        CSVReader reader = new CSVReader(in);
        return null;
    }
    // ToDo find a datasource and implement pull data and save as a file on a HD.

}
