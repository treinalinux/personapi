package corp.empresa.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    private  Long id;

    // private PhoneType type;

    private  String number;
}
