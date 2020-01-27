public class Main {

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор, умеющий считать e^x, sinx и cosx с учетом точности и e^x с автоподбором точности.");
        ExponCalc exponCalc = new ExponCalc();

/*
        0 - считаем e^x
        1 - считаем sinx
        2 - считаем cosx
        любое число в рамках размерности байта  -  вычисляет e^x с автоподбором наилучшей точности
*/
        double result = exponCalc.calcWith((byte) 2, 5, 2);
        System.out.println(result);
    }
}
