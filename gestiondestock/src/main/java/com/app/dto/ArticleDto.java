package com.app.dto;

import com.app.model.Categorie;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private String codeArticle;


    private String designation;


    private BigDecimal prixUnitaireHt;


    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    private CategorieDto categorie;
}
