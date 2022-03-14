package productservices.bo;

import productservices.dto.Product;

public interface productBO {
void create(Product product);
Product findproduct(int id);
}
