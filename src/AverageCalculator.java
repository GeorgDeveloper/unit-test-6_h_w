import java.util.List;

public class AverageCalculator {
    public String compareAverages(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}