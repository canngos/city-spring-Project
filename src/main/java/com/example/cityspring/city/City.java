package com.example.cityspring.city;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "my_city")
@Getter
@Setter
@NoArgsConstructor
public class City {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "president")
    private String president;

    private LocalDate dateOfRepublic;
}
