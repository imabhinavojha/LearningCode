import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class favouriteSinger {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Map<Integer, Integer> singerCounts = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                int singer = sc.nextInt();
                singerCounts.put(singer, singerCounts.getOrDefault(singer, 0) + 1);
            }
    
            int maxCount = 0;
            int numFavoriteSingers = 0;
            for (Map.Entry<Integer, Integer> entry : singerCounts.entrySet()) {
                int singer = entry.getKey();
                int count = entry.getValue();
    
                if (count > maxCount) {
                    maxCount = count;
                    numFavoriteSingers = 1;
                } else if (count == maxCount) {
                    numFavoriteSingers++;
                }
            }
    
            System.out.println(numFavoriteSingers);
        
    }

}
