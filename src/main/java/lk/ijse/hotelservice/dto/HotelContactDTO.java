package lk.ijse.hotelservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lahiru Dilshan
 * @created Mon 1:35 PM on 10/9/2023
 * @project nexttravel
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HotelContactDTO {
    private String contact;
}
