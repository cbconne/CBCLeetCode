import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class GenerateBinaryStringsWithoutAdjacentZeros {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generateBinaryStrings(n, "", result);
        return result;
    }

    public void generateBinaryStrings(int n, String currentString, List<String> result) {
        if (currentString.endsWith("00")) {
            return;
        }
        if (Optional.ofNullable(currentString).orElse("").length() == n) {
            result.add(currentString);
            return;
        }
        generateBinaryStrings(n, currentString + "0", result);
        generateBinaryStrings(n, currentString + "1", result);
    }

    public static void main(String[] args) {
        GenerateBinaryStringsWithoutAdjacentZeros test = new GenerateBinaryStringsWithoutAdjacentZeros();
        System.out.println(test.validStrings(3));
    }
}