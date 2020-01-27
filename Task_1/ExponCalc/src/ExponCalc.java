public class ExponCalc {
    public double calcWith(byte formulaType, int x, int accuracy) {
        double result = 1D;
        double numerator = 1D;
        double dencominator = 1D;
        int myCount = 1;        // свой счетчик шагов, для учета введенной точности
        byte variableFactSin = 1;             // учет для sin факториала
        boolean sign = true;    // нужна, для смены знака "+" на "-"
        if (formulaType == 1) { // маленькое условие для синуса, чтобы не считать с 1-го слагаемого ;) , хотя  лучше переписать
            variableFactSin = 0;
            result = x;
            numerator *= x;
        };
        //  для подсчета максимальной точности
        double penultVariable = 0D;         //  предпоследний результат
        double lastVariable = 1D;           //  последний результат
        int countMaxAccuracy = 0;           //  для подсчета максимальной точности

        for (int currentAddend = 2; myCount < accuracy; currentAddend++) {

            numerator *= x;
            dencominator *= (currentAddend - variableFactSin);

            switch (formulaType) {
                case 0:             // e^x
                    result += numerator / dencominator;
                    myCount++;
                    break;
                case 1:             // sinx
                    if (currentAddend % 2 != 0) {             // повтор кода - это плохо, но пока идей нет :(
                        result = (sign) ? (result - (numerator / dencominator)) : (result + (numerator / dencominator));
                        sign = !sign;
                        myCount++;
                    }
                    break;
                case 2:             // cosx
                    if (currentAddend % 2 != 0) {
                        result = (sign) ? (result - (numerator / dencominator)) : (result + (numerator / dencominator));
                        sign = !sign;
                        myCount++;
                    }
                    break;
                default:    // вы указывали точность ? - нет, не слышал
                    result += numerator / dencominator;
                    if (penultVariable != lastVariable) {
                        if (penultVariable == 0) {
                            penultVariable = result;
                        } else {
                            lastVariable = penultVariable;
                            penultVariable = result;
                        }
                        ++countMaxAccuracy;
                    } else {
                        System.out.println("Наилучшая точность для числа " + x + " равняется " + countMaxAccuracy);
                        accuracy = myCount;
                    }
                    break;
            }
        }
        return result;
    }
}