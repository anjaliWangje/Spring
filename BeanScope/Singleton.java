package BeanScope;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Singleton {
    @Value("Latur")
    private  String District;
    @Value("Bhusani")
    private  String village;

}
