package productservices.dao;

import java.util.HashMap;
import java.util.Map;

import productservices.dto.Product;

public class productDAOimpl implements productDAO {
    Map<Integer,Product>products= new HashMap<>();
	@Override
	public void create(Product product) {
    products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
