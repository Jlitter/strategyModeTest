package action;

import bean.FruitDiscountCost;
import bean.FruitReduceCost;
import bean.StrawberryCost;
import bean.MangoCost;
import bean.AppleCost;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author litter
 */
public class MainActivity {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入所选策略模式：");
			int sample = scanner.nextInt();
			scanner.nextLine();
			CountCostManager mCountCostManager = new CountCostManager();
			System.out.println("请输入所选水果各斤数：");
			String fruitWeight = scanner.nextLine();
			String[] arr = fruitWeight.split(" ");
			BigDecimal applePrice;
			BigDecimal strawberryPrice;
			BigDecimal mangoPrice;
			BigDecimal price;
			switch (sample) {
				case 1:
					mCountCostManager.setCostType(new AppleCost());
					applePrice = mCountCostManager.countCost(Double.parseDouble(arr[0]));
					mCountCostManager.setCostType(new StrawberryCost());
					strawberryPrice = mCountCostManager.countCost(Double.parseDouble(arr[1]));
					price = applePrice.add(strawberryPrice);
					System.out.println(price + "\n");
					break;

				case 2:
					mCountCostManager.setCostType(new AppleCost());
					applePrice = mCountCostManager.countCost(Double.parseDouble(arr[0]));
					mCountCostManager.setCostType(new StrawberryCost());
					strawberryPrice = mCountCostManager.countCost(Double.parseDouble(arr[1]));
					mCountCostManager.setCostType(new MangoCost());
					mangoPrice = mCountCostManager.countCost(Double.parseDouble(arr[2]));
					price = applePrice.add(strawberryPrice).add(mangoPrice);
					System.out.println(price + "\n");
					break;

				case 3:
					mCountCostManager.setCostType(new AppleCost());
					applePrice = mCountCostManager.countCost(Double.parseDouble(arr[0]));
					mCountCostManager.setCostType(new StrawberryCost());
					strawberryPrice = mCountCostManager.countCost(Double.parseDouble(arr[1]));
					mCountCostManager.setCostType(new FruitReduceCost());
					BigDecimal reducePrice = mCountCostManager.countCost(strawberryPrice.doubleValue());
					mCountCostManager.setCostType(new MangoCost());
					mangoPrice = mCountCostManager.countCost(Double.parseDouble(arr[2]));
					price = applePrice.add(reducePrice).add(mangoPrice);
					System.out.println(price + "\n");
					break;

				case 4:
					mCountCostManager.setCostType(new AppleCost());
					applePrice = mCountCostManager.countCost(Double.parseDouble(arr[0]));
					mCountCostManager.setCostType(new StrawberryCost());
					strawberryPrice = mCountCostManager.countCost(Double.parseDouble(arr[1]));
					mCountCostManager.setCostType(new MangoCost());
					mangoPrice = mCountCostManager.countCost(Double.parseDouble(arr[2]));
					price = applePrice.add(strawberryPrice).add(mangoPrice);
					mCountCostManager.setCostType(new FruitDiscountCost());
					BigDecimal discountPrince = mCountCostManager.countCost(price.doubleValue());
					System.out.println(discountPrince + "\n");
					break;

				default:
					break;

			}
		}catch (Exception ignored){

		}
	}

}
