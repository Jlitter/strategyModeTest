package bean;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * 芒果计算价格
 *
 * @author litter
 *
 */
public class MangoCost implements IPrice {

	@Override
	public BigDecimal countPrice(Double weight) {
		return new BigDecimal(Double.toString(weight)).multiply(new BigDecimal(20));
	}

}
