package BeanScope;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Prototype {
    @Value("Maharashtra")
    private String State;
    @Value("pune")
    private  String District;

}
