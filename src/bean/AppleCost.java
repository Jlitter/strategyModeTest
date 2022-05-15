package bean;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * ƻ������۸�
 * 
 * @author litter
 *
 */
public class AppleCost implements IPrice {

	@Override
	public BigDecimal countPrice(Double weight) {
		return new BigDecimal(Double.toString(weight)).multiply(new BigDecimal(8));
		
	}

}
