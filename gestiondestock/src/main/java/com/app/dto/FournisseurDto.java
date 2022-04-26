package com.app.dto;

import com.app.model.Adresse;
import com.app.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class FournisseurDto {

    private String nom;

    private String prenom;

    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseur> commandeFournisseurs;
}
