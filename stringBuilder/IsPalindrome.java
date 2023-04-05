package stringBuilder;

public class IsPalindrome {
    public static void main(String[] args) {
        isPalindrome("racecar");
        isPalindrome("level");
        isPalindrome("deified");
        isPalindrome("Civic");
        isPalindrome("Radar");
        isPalindrome("Hannah");

        StringBuilder sb1 = new StringBuilder("code");
        StringBuilder sb2 = new StringBuilder("code");
        int a = Integer.MAX_VALUE;
        int[] nums = {1,2,34,5,5,6,2,3,4,7,8,9};
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
           a = Math.min(a, nums[i]);
           if (nums[i] >= 6 && nums[i] <= 7 ) {
               continue;
           }
            System.out.print(nums[i]);
        }


    }

    public static boolean isPalindrome(String word){
        StringBuilder sb1 = new StringBuilder(word);
        sb1.reverse();
        System.out.println("Is " + word + " palindrome: " + sb1.toString().equalsIgnoreCase(word));
        return sb1.toString().equalsIgnoreCase(word);
    }

}
