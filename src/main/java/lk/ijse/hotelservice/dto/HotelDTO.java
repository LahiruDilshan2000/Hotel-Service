package lk.ijse.hotelservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Sat 10:41 AM on 10/7/2023
 * @project nexttravel
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HotelDTO {

    private Integer hotelId;

    private String hotelName;

    private Integer hotelCategory;

    private String hotelLocation;

    private String locationUrl;

    private String hotelEmail;

    private List<HotelContactDTO> contactList;

    private String isPetAllow;

    private Double fullDPrice;

    private Double halfDPrice;

    private Double fullTPrice;

    private Double halfTPrice;

    private String cancellationCriteria;

    private byte[] hotelImageLocation;
}
