import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.Exception;

public class Ans009 {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("test.properties");
                InputStreamReader in = new InputStreamReader(stream, "UTF-8")) {

            Properties props = new Properties();
            props.load(in);
            System.out.println(props.getProperty("abc"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
