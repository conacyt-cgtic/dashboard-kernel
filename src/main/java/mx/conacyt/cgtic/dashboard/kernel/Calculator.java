package mx.conacyt.cgtic.dashboard.kernel;

import org.apache.log4j.Logger;

public class Calculator {
    private final static Logger LOG = Logger.getLogger(Calculator.class);
    
    public long computeFactLen(int n) {
        LOG.info("Calculating fact len for:: "+n); 
        double res = 1.0;
        for(int i=1; i<=n; i++)
            res = res + Math.log10(i);
        return (long)res;
    }
}
