public class Main {

    public static void main(String[] args) {
        int oneArray[] = {4,3,12,36,45,9,66,12,3};
        int twoArray[][] = {{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(ArrayConverter.loopMaximalElementInOneDimensionalArray(oneArray));

        System.out.println(ArrayConverter.swapColumns(twoArray));
        System.out.println(ArrayConverter.swapLines(twoArray));
    }
}