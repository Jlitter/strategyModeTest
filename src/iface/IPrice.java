package iface;

import java.math.BigDecimal;

/**
 * ����۸�
 *
 * @author litter
 */
public abstract interface IPrice {
	
	/**
	 * ���ؼ����ļ۸�
	 * @param weight
	 * @return
	 */
	BigDecimal countPrice(Double weight);
	
}
