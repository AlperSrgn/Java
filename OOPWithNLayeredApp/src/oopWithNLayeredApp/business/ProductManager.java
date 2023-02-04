package oopWithNLayeredApp.business;


import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Price can not be less than 10");  // basic example
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) { // [db,file]
			logger.log(product.getName());
		}
	}
}
