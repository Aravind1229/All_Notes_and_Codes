package productservices.dao;

import productservices.dto.Product;

public interface productDAO {
 void create(Product product);
 Product read(int id);
 void update(Product product);
 void delete(int id);
}
