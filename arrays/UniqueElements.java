package arrays;
//
//public class UniqueElements {
//    public static int countUniqueElements(int[] arr) {
//        int uniqueCount = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == arr[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                uniqueCount++;
//            }
//        }
//        return uniqueCount;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5};
//        System.out.println("Number of unique elements: " + countUniqueElements(arr));
//    }
//}

public class UniqueElements {
    public static Integer findSmallestRepeatingElement(int[] arr) {
        Integer smallestRepeating = null;

        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            // Check if the current element repeats
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            // Update smallestRepeating if current element is smaller and repeating
            if (isRepeating) {
                if (smallestRepeating == null || arr[i] < smallestRepeating) {
                    smallestRepeating = arr[i];
                }
            }
        }

        return smallestRepeating;
    }

    public static Integer findLargestRepeatingElement(int[] arr) {
        Integer smallestRepeating = null;

        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            // Check if the current element repeats
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break;
                }
            }
            // Update smallestRepeating if current element is smaller and repeating
            if (isRepeating) {
                if (smallestRepeating == null || arr[i] > smallestRepeating) {
                    smallestRepeating = arr[i];
                }
            }
        }

        return smallestRepeating;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,4,4,3,3,2,1};
        Integer result = findLargestRepeatingElement(arr);
        if (result != null) {
            System.out.println("Smallest repeating element: " + result);
        } else {
            System.out.println("No repeating elements found.");
        }
    }
}

