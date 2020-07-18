import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "pretty",
        features = "classpath:com/challenge"
)
/**
 Esta clase ejecuta dos los features existentes en la carpeta resources y todos sus escenarios.
 @author Carlos Garcia
 */
public class TestSuite {
}
