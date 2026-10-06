package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;

    @OneToOne
    @JoinColumn(name = "universite_id") // clé étrangère dans la table Foyer
    Universite universite;


    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    List<Bloc> blocs;


}
