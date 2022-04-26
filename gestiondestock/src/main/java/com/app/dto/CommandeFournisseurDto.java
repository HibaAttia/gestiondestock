package com.app.dto;

import com.app.model.Fournisseur;
import com.app.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseurDto {

    private String code;

    private Instant dateCommande;

    private Fournisseur fournisseur;

    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
