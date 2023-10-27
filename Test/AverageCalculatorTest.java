import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class AverageCalculatorTest {
    @Test
    public void testCompareAverages_FirstListIsGreater() {
        AverageCalculator calculator = new AverageCalculator();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        String result = calculator.compareAverages(list1, list2);
        assertEquals(result, "Первый список имеет большее среднее значение");
    }

    @Test
    public void testCompareAverages_SecondListIsGreater() {
        AverageCalculator calculator = new AverageCalculator();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        String result = calculator.compareAverages(list1, list2);
        assertEquals(result, "Второй список имеет большее среднее значение");
    }

    @Test
    public void testCompareAverages_AveragesAreEqual() {
        AverageCalculator calculator = new AverageCalculator();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        String result = calculator.compareAverages(list1, list2);
        assertEquals(result, "Средние значения равны");
    }
}

