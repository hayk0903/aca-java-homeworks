package aca.factoryRunner;

import aca.factory.FactoryProducer;
import aca.factory.ProductAbstractFactory;
import aca.productInterface.Product;

public class Runner {

	public static void main(String[] args) {
		ProductAbstractFactory brand1 = FactoryProducer.getFactory("Adidas");
		
		Product adidasBoots = brand1.getProduct("boots");
		adidasBoots.info();
		
		Product adidasSocks = brand1.getProduct("socks");
		adidasSocks.info();
		
		ProductAbstractFactory brand2 = FactoryProducer.getFactory("Nike");
		
		Product nikeBoots = brand2.getProduct("boots");
		nikeBoots.info();
		
		Product nikePants = brand2.getProduct("PANTS");
		nikePants.info();

	}

}
