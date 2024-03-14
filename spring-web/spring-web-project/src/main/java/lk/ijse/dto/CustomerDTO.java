package lk.ijse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-14
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO implements Serializable {
    private String id;
    private String name;
    private String address;
}
