package patterns.abstractfactory;

import java.io.IOException;


public class Demo {
    private static Application configureApplication() throws IOException {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("Windows")){
            factory = new WindowsFactory();
        }
        else if (osName.contains("Linux")){
            factory = new LinuxFactory();
        }
        else {
           throw new IOException("The system does not exsist!");
        }
        app = new Application(factory);
        return app;

    }

    public static void main(String[] args) {
        Application app = null;
        try {
            app = configureApplication();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        app.paint();
    }
}
