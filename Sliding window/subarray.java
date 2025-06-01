
public class subarray {
    public static void main(String[] args) {
        int arr[] = { 100, 200, 300, 400, 500 };
        int k = 2; // answer will be : 700 (sum of max 300 + 400)

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum - arr[i-1] + arr[i + k - 1];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
