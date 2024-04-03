import com.app.junit.project.MultiplosDeTresOrCinco;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NumbersTest {

    @Test
    public void should_returnNumbers_whenBotNullMultiploOf3Or5(){
        MultiplosDeTresOrCinco mul = new MultiplosDeTresOrCinco();
        List<String> numberList = mul.getNumbers();
        Assert.assertEquals("1",numberList.get(0));
        Assert.assertEquals("2",numberList.get(1));
        Assert.assertEquals("6",numberList.get(5));
        Assert.assertEquals("13",numberList.get(12));
    }

    @Test
    public void should_returnFizz_whenBotNullMultiploOf3(){
        MultiplosDeTresOrCinco mul = new MultiplosDeTresOrCinco();
        List<String> numberList = mul.getNumbers();
        Assert.assertEquals("Fizz",numberList.get(2));
        Assert.assertEquals("Fizz",numberList.get(5));
        Assert.assertEquals("Fizz",numberList.get(8));
        Assert.assertEquals("Fizz",numberList.get(11));
    }
}
