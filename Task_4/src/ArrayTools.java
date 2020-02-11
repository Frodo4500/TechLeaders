public class ArrayTools {

    public static int loopMaximalElementInOneDimensionalArray(int oneArray[]) {
        int maxElement = 0;
        for (int i=0 ; i<oneArray.length;i++){
            if (oneArray[i] > maxElement) { maxElement = oneArray[i]; };
        }
//        for (int i : oneArray){             // почему не работает
//            if (oneArray[i] > maxElement) { maxElement = oneArray[i]; };
//        }
        return maxElement;
    }

    public static String swapLines(int twoArray[][]) {
        int i = 0;
        int j = 2;
        for (int k = 0; k < twoArray.length; k++) {
            int[][] arrayZ = {{0, 0}, {0, 0}};
            arrayZ[0][0] = twoArray[i][k];
            twoArray[i][k] = twoArray[j][k];
            twoArray[j][k] = arrayZ[0][0];
        }
        return "Смена строк выполнена";
    }

    public static String swapColumns(int twoArray[][]){
        int i = 0;
        int j = 2;
        for (int k = 0; k < twoArray.length; k++) {
            int[][] arrayZ = {{0, 0}, {0, 0}};
            arrayZ[0][0] = twoArray[k][i];
            twoArray[k][i] = twoArray[k][j];
            twoArray[k][j] = arrayZ[0][0];
        }
        return "Смена столбцов выполнена";
    }
}

//        главная диагональ
//                i=j