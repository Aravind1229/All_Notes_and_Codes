package productservices.bo;

import productservices.dao.productDAO;
import productservices.dao.productDAOimpl;
import productservices.dto.Product;

public class productBOimpl implements productBO {
    private static productDAO dao=new productDAOimpl();
	@Override
	public void create(Product product) {
     dao.create(product);
	}

	@Override
	public Product findproduct(int id) {
		return dao.read(id);
	}

}
