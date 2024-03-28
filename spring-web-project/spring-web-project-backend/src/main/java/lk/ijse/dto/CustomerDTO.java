package lk.ijse.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {
    @Null(message = "is auto generated")
    private String id;
    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "^[A-Za-z ]*$", message = "Name should only contain letters")
    private String name;
    @NotBlank(message = "Address is mandatory")
    private String address;
}
