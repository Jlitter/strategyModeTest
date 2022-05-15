package bean;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * 水果折扣计算价格
 *
 * @author litter
 *
 */
public class FruitReduceCost implements IPrice {

	private final double rate;

	public FruitReduceCost() {
		this.rate = 0.8;
	}

	@Override
	public BigDecimal countPrice(Double price) {
		return new BigDecimal(Double.toString(price)).multiply(new BigDecimal(Double.toString(this.rate)));

	}

}
