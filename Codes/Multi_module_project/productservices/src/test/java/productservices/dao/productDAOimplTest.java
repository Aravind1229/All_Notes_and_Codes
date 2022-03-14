package productservices.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import productservices.dto.Product;

public class productDAOimplTest {

	@Test
	public void createShouldCrateAProduct() {
		productDAO dao=new productDAOimpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("It's Awesome");
		product.setPrice(1000);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Iphone",product.getName());
	}

}
