public class maxInWindow {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 9, 1, 5 };
        // Sliding window problem we have find max of every sequencial set of 3 array
        int k = 3;
        int val[] = new int[arr.length - k + 1];

        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            val[i] = max;
        }

        for (int i : val) {
            System.out.print(i + " ");
        }

    }
}
