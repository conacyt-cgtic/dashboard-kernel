package mx.conacyt.cgtic.dashboard.kernel;

import org.apache.log4j.Logger;

/**
 * abc
 * 
 * @author garellano
 *
 */
public class Calculator {
    private final static Logger LOG = Logger.getLogger(Calculator.class);
    
    /**
     * xyz
     * 
     * @param n
     * @return long
     */
    public long computeFactLen(int n) {
        LOG.info("Calculating fact len for:: "+n); 
        double res = 1.0;
        for(int i=1; i<=n; i++)
            res = res + Math.log10(i);
        return (long)res;
    }
    
    public double divide(int a, int b) {
        if(a==0 && b==0) {
            throw new RuntimeException("El resultado es: INDETERMINADO");
        }
        if(b==0) {
            throw new RuntimeException("El resultado es: INFINITO");
        } else {
            return (double)a/b;
        }
    }
}
