package customer.service;

import customer.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(123456, "Tran The Huy", "0905783653", "huytran161122@gmail.com"));
        customerList.add(new Customer(145987, "Nguyen Ngoc Trang Chau", "0916499908", "chau310822@gmail.com"));
        customerList.add(new Customer(756314, "Le Nhi KHang", "0905766396", "NhiKhang569@gmail.com"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> findByName(String keyword) {
        List<Customer> result = new ArrayList<>();
        for (Customer student : customerList) {
            if (student.getName().contains(keyword)) {
                result.add(student);
            }
        }
        return result;
    }
}
