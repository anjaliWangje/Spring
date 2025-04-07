package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String student_name;
}

