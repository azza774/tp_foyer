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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idBloc;
    String nonBloc;
    long capacityBloc;

    @ManyToOne
    @JoinColumn(name = "foyer_id")
    Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    List<Chambre> chambres;
}
