package home.hyywk.top;

import java.math.BigDecimal;

public class Calculator {
    private BigDecimal num2;
    public Calculator() {
        this.num2 = new BigDecimal("2");
    }
    /**
     * 计算根号2的值
     * @param accuracy
     * @return
     */
    public BigDecimal calculate(String accuracy) {
        BigDecimal val = new BigDecimal( "1" );

        while ( true ) {
            val = val.add( new BigDecimal( accuracy ) );
            if (  val.multiply( val ).compareTo( this.num2 ) == 1 ) {
                break;
            }
        }
        return val;
    }

}
