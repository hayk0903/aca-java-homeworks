package aca.factory;

import aca.adidas.*;
import aca.productInterface.Product;

public class AdidasFactory extends ProductAbstractFactory {

	@Override
	public Product getProduct(String product) {
		if (product == null){
			return null;
		}
		if(product.equalsIgnoreCase("Boots")){
			return new AdidasBoots();
		}else if(product.equalsIgnoreCase("Pants")){
			return new AdidasPants();
		}else if (product.equalsIgnoreCase("Tops")){
			return new AdidasTop();
		}else if (product.equalsIgnoreCase("Socks")){
			return new AdidasSocks();
		}
		return null;
		
	}
	

}
