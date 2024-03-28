package lk.ijse.repositories;

import lk.ijse.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
