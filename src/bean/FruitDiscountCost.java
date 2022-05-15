package bean;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * 水果满减计算价格
 *
 * @author litter
 *
 */
public class FruitDiscountCost implements IPrice {
	private  final int reduceValue = 100;
	@Override
	public BigDecimal countPrice(Double price) {
		if (price >= reduceValue) {
			int mod = (int) (price / 100);
			return new BigDecimal(Double.toString(price)).subtract(new BigDecimal(10*mod));
		}else {
			return  new BigDecimal(Double.toString(price));
		}
	}

}
