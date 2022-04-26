package com.app.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class Adresse {

    @Column(name="adresse1")
    private String adresse1;

    @Column(name="adresse2")
    private String adresse2;

    @Column(name="ville")
    private String ville;

    @Column(name="codePostale")
    private String codePostale;

    @Column(name="pays")
    private String pays;

}
