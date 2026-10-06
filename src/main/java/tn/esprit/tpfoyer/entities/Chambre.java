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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    long numeroChambre;
    TypeChambre typeCh;

    @ManyToOne
    @JoinColumn(name = "bloc_id")
    Bloc bloc;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    List<Reservation> reservations;
}
