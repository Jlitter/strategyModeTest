package bean;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * ��ݮ����۸�
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
