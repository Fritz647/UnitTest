public class calculateTest {
    public static void addTest(){
        if(calculate.add(2,2)==4) System.out.println("Ошибок нет");
        else System.out.println("Ошибки есть");
    }
    public static void subtractionTest(){
        if(calculate.subtraction(4,2)==2) System.out.println("Ошибок нет");
        else System.out.println("Ошибки есть");
    }
    public static void multiplicationTest(){
        if(calculate.multiplication(2,2)==4) System.out.println("Ошибок нет");
        else System.out.println("Ошибки есть");
    }
    public static void divisionTest(){
        if(calculate.division(2,2)==1) {
            System.out.println("Ошибок нет");
        }
        else System.out.println("Ошибки есть");
    }
    public static void xponentiationTest(){
        if(calculate.exponentiation(2,2)==4) System.out.println("Ошибок нет");
        else System.out.println("Ошибки есть");
    }
}
