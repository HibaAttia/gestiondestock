package com.app.dto;

import com.app.model.Article;
import com.app.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Article article;

    private CommandeFournisseur commandeFournisseurs;
}


