package action;

import iface.IPrice;

import java.math.BigDecimal;

/**
 * ͳһ���������Լ�������
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
	 * ����۸�
	 * 
	 * @param path
	 * @return
	 */
	public BigDecimal countCost(Double path){
		return iPrice.countPrice(path);
	}

}
