public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int n1 = 5;
        System.out.println("Missing number: " + findMissingNumber(arr1, n1));
    }
}
