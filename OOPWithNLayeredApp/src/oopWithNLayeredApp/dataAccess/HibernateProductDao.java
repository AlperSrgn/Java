package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// sadece database veri erişim kodları buraya yazılır.
		System.out.println("Hibernate ile Veritabanına Eklendi");
	}
}