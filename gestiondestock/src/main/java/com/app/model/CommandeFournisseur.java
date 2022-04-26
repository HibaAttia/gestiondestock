package com.app.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {

    @Column(name="code")
    private String code;

    @Column(name="dateCommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name="idfournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandefournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

}
