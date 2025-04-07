package Annotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Classes {
    @Value("TDIT")
    private String classname;
    @Value("Warje")
    private String classAdress;
    @Value("#{temp}")
    private List<String>classdepartment;


}
