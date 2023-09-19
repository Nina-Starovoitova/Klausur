package patterns.decorator;

public class WebDataSource implements DataSource {
    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return null;
    }
    // ToDo find a datasource and implement pull data and save as a file on a HD.

}
