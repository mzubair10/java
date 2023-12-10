import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class classPhotos {
    public static boolean classPhotosF(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        if (redShirtHeights.equals(blueShirtHeights))
            return false;
        boolean canBeTakenV = (canBeTaken(redShirtHeights.get(0), blueShirtHeights.get(0)) ? true : false);
        for (int iter = 1; iter < redShirtHeights.size(); iter++) {
            boolean tempBool = canBeTakenV;
            if (canBeTaken(redShirtHeights.get(iter), blueShirtHeights.get(iter)) == tempBool)
                continue;
            else
                return false;
        }
        return true;
    }

    public static boolean canBeTaken(int item1, int item2) {
        return item1 > item2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(4, 5));
        ArrayList<Integer> bluehirtHeights = new ArrayList<>(Arrays.asList(5, 4));
        System.out.println(classPhotosF(redShirtHeights, bluehirtHeights));
    }
}
