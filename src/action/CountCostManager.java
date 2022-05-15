package action;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * 统一管理车类型以及费用类
 * 
 * @author litter
 *
 */
public class CountCostManager {
	
	IPrice iPrice;
	
	/**
	 *
	 * 
	 * @param price
	 */
	public void setCostType(IPrice price){
		iPrice = price;
	}
	
	/**
	 * 计算价格
	 * 
	 * @param path
	 * @return
	 */
	public BigDecimal countCost(Double path){
		return iPrice.countPrice(path);
	}

}
