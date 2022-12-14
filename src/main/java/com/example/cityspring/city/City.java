package com.example.cityspring.city;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

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
