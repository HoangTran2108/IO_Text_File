import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\Administrator\\Desktop\\IO_Text_File\\th2\\src\\number");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\Administrator\\Desktop\\IO_Text_File\\th2\\src\\number", maxValue);
    }
}