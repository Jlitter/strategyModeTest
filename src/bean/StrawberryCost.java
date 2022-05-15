package bean;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * ≤››Æº∆À„º€∏Ò
 * 
 * @author litter
 *
 */
public class StrawberryCost implements IPrice {

	@Override
	public BigDecimal countPrice(Double weight) {

		return new BigDecimal(Double.toString(weight)).multiply(new BigDecimal(13));
	}

}
