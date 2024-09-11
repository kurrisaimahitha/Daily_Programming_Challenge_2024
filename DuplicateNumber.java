public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        
        hare = nums[0];
        while (hare != tortoise) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return hare;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + findDuplicate(arr)); 
    }
}