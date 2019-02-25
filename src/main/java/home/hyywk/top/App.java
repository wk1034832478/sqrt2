package home.hyywk.top;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 使用逼近法求出根号2的值
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        BigDecimal consequence;
        String accuracy;
        Scanner scanner = new Scanner( System.in );
        while ( true ) {
            System.out.print("请输入精度：");
            accuracy = scanner.next();
            if ( accuracy.equals("exit")) {
                break;
            }
            consequence = calculator.calculate( accuracy );
            System.out.println("根号2：" + consequence );
        }
    }
}
