import java.util.*;

class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            Integer count = hashMap.get(word);
            if (count == null)
                hashMap.put(word, 1);
            else
                hashMap.put(word, count + 1);
        }

        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
