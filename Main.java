public class Main {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0 ; i<10 ; i++){
            if (i==7) {
                break;
            } else if (i %3 == 0) {
                continue;
            }
            total = total +i;

        }
        System.out.println(total);
        String label = total > 10 ? "big" : "small";
        System.out.println(label);
        int[] nums = {3, 10, 15, 7};
        for (int n : nums) {
            System.out.println(n + " " + classify(n));
        }

    }

    static String classify(int n){
        if (n%2 == 0) {
            return "even";
        } else if (n%5 == 0) {
            return "odd, divisible by 5";
        } else {
            return "odd";
        }
    }
}
