
public class PrimitiveArray {

    public static void main(String[] args) {
        // Test Data
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 4, 3};
        int[] arr3 = {1, 3, 1, 3, 2, 4};
        int[] arr4 = {1, 3, 1, 3, 2, 4};

        System.out.println("Remove Element");
        boolean removed = removeElement(arr1, 3); 
        System.out.println("Removed: " + removed);
        printArray(arr1); 

        System.out.println("\nInsert Element");
        insertElement(arr2, 5, 2); 
        printArray(arr2); 

        System.out.println("\nFind Duplicates");
        int[] dups = findDuplicateValues(arr3);
        printArray(dups); 

        System.out.println("\nRemove Duplicates");
        int[] unique = removeDuplicateValues(arr4);
        printArray(unique); 
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static boolean removeElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break; 
            }
        }

        if (index == -1) return false; 

        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        arr[arr.length - 1] = 0; 
        
        return true;
    }

    public static void insertElement(int[] arr, int element, int position) {
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return;
        }

        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = element;
    }

    public static int[] findDuplicateValues(int[] arr) {
        int[] temp = new int[arr.length]; 
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyFound = false;
            for(int k=0; k<count; k++) {
                if(temp[k] == arr[i]) alreadyFound = true;
            }
            if(alreadyFound) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp[count++] = arr[i];
                    break; 
                }
            }
        }

        int[] result = new int[count];
        for(int i=0; i<count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static int[] removeDuplicateValues(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (temp[j] == arr[i]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                temp[count++] = arr[i];
            }
        }

        int[] result = new int[count];
        for(int i=0; i<count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}