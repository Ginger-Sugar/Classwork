

package FlooringMastery.Dto;

import java.math.BigDecimal;

/**
 *
 * @author Shantoria Taylor  

 */
public class State {
    
     private String stateAbbr;
     
    private BigDecimal taxRate;

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }


}
