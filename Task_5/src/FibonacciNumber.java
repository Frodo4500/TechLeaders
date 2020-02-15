public class FibonacciNumber {
    public static int getFibonacciNumber(int stepCount){
        int f = 1;
        for (int i = 3; i <= stepCount; i++){
            f =  getFibonacciNumber(stepCount-1) + getFibonacciNumber(stepCount-2);
        }
        return f;
    }
}