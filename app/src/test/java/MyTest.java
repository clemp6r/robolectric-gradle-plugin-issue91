import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RunWith(RobolectricTestRunner.class)
public class MyTest {

    @Test
    public void testClasspathResource() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        System.out.println(properties.getProperty("my.param"));
    }
}
