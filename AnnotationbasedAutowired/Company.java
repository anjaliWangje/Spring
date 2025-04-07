package AnnotationbasedAutowired;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Company {
    @Autowired
    @Qualifier("employees1")
    private  Employee employee;

}
