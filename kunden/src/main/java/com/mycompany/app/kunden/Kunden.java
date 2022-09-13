package com.mycompany.app.kunden;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Kunden {
    @Id
    @SequenceGenerator(
            name = "kunden_id_sequence",
            sequenceName = "kunden_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "kunden_id_sequence"
    )
    private Integer id;
    private String Name;
    private String Nachname;
    private String email;


}
