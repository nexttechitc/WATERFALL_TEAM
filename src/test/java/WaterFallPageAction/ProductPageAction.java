package WaterFallPageAction;

import WaterFallPageLocator.ProductPageLocator;
import WtareFallUtility.WaterFallBase;

public class ProductPageAction extends WaterFallBase{
	
	
	ProductPageLocator productPageLocator = new ProductPageLocator();
	public void ClickAddToCart() throws Exception {
		productPageLocator.AddToCart.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}

}
