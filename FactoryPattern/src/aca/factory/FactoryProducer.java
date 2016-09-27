package aca.factory;

public class FactoryProducer {
	 public static ProductAbstractFactory getFactory(String brand){
		   
	      if(brand.equalsIgnoreCase("Adidas")){
	         return new AdidasFactory();
	         
	      }else if(brand.equalsIgnoreCase("Nike")){
	         return new NikeFactory();
	      }
	      
	      return null;
	   }

}
