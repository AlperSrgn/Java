package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// sadece database veri erişim kodları buraya yazılır.
		System.out.println("JDBC ile Veritabanına Eklendi");
	}
}
