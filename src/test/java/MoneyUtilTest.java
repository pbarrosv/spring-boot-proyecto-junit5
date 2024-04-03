import com.app.junit.project.MoneyUtil;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest(){
        String money = MoneyUtil.format(1000);
        Assertions.assertEquals("$1000.00",money);
    }

    @Test
    public void negativemoneyTest(){
        String money = MoneyUtil.format(-1000);
        Assertions.assertEquals("-$1000.00",money);
    }

    @Test
    public void euroMoneyTest(){
        String money = MoneyUtil.format(-1000,"€");
        Assertions.assertEquals("-€1000.00",money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptioneuroMoneyTest(){
       MoneyUtil.format(-1000,null);
        //Assertions.assertEquals("-€1000.00",money);
    }
}
