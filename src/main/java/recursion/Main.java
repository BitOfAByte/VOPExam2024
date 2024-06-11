package recursion;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of odd numbers from 1 to 10 (iterative):"+ iterativeOddSum(1,10));
        System.out.println("\nSum of odd numbers from 1 to 10 (recursive):"+recursiveOddSum(1,10));

    }

    public static int iterativeOddSum(int start, int end) {
        int sum=0;
        for (int i = start; i <= end; i++) {
            if(i%2!=0)
                sum=sum+i;
        }
        return sum;
    }

    //TODO
    public static int recursiveOddSum(int start, int end) {
        if(start>end)
            return 0;
        if(start%2==0)
            return recursiveOddSum(start+1,end);
        return start+recursiveOddSum(start+2,end);
    }
}
