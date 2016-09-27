package aca.factory;

import aca.nike.*;
import aca.productInterface.Product;

public class NikeFactory extends ProductAbstractFactory {
	@Override
	public Product getProduct(String product) {
		if (product == null){
			return null;
		}
		if(product.equalsIgnoreCase("Boots")){
			return new NikeBoots();
		}else if(product.equalsIgnoreCase("Pants")){
			return new NikePants();
		}else if (product.equalsIgnoreCase("Tops")){
			return new NikeTop();
		}else if (product.equalsIgnoreCase("Socks")){
			return new NikeSocks();
		}
		return null;
		
	}

}
