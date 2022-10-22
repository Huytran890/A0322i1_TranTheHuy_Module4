package management_customer.service;

import management_customer.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "BMW", 2000000.0, "I8", "Germany"));
        productMap.put(2, new Product(2, "Mercedes", 2500000.0, "MayBach", "Germany"));
        productMap.put(3, new Product(3, "Vin-fast", 3000000.0, "President", "Vietnam"));
    }

    @Override
    public List<Product> productAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) {
        product.setId((int) (Math.random() * 1000));
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void edit(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product : this.productAll()) {
            if ((product.getName().toLowerCase()).contains(name.toLowerCase())) {
                productList.add(product);
            }
        }
        return productList;
    }
}
