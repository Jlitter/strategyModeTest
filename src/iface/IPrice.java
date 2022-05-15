package iface;

import java.math.BigDecimal;

/**
 * 计算价格
 *
 * @author litter
 */
public abstract interface IPrice {
	
	/**
	 * 返回计算后的价格
	 * @param weight
	 * @return
	 */
	BigDecimal countPrice(Double weight);
	
}
