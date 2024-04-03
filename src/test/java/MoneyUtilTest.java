import com.app.junit.project.MoneyUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest(){
        String money = MoneyUtil.format(1000);
        Assertions.assertEquals("$1000.00",money);
    }
}
