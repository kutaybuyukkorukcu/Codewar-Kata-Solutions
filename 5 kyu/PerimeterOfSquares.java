import java.math.BigInteger;
import java.util.function.*;
import java.util.stream.*;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {

        Supplier<BigInteger> fib = new Supplier() {
            private BigInteger prev = BigInteger.valueOf(0);
            private BigInteger curr = BigInteger.valueOf(1);

            public BigInteger get() {
                BigInteger nextValue = this.prev.add(this.curr);
                this.prev = this.curr;
                this.curr = nextValue;
                return this.prev;
            }
        };

        BigInteger fibSum = Stream.generate(fib)
                .limit(n.intValue() + 1)
                .reduce(BigInteger.ZERO, BigInteger::add);
        
        return BigInteger.valueOf(4).multiply(fibSum);
    }
}

//:vault-boy-thumps-up:
