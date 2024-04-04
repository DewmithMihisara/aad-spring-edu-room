package lk.ijse.repositories;

import lk.ijse.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */

public interface CustomerRepository extends JpaRepository<Customer,String> {
    List<Customer> findCustomersByName(String name); // This is a custom query method
    Customer searchByNameAndAddress(String name, String address);
    int countCustomersByAddressStartingWith(String address);
    @Query(value = "SELECT * FROM customer", nativeQuery = true)
    List<Customer> getAllCustomers();
    @Query(value = "select c from Customer c")
    List<Customer> getAllCustomerWithJPQL();
    @Query(value = "from Customer c")
    List<Customer> getCustomerWithHQL();
    @Query(value = "select * from Customer where name = ?1 and address = ?2",nativeQuery = true)
    List<Customer> getAllCustomerByNameAAndAddress(String name, String address);
}
