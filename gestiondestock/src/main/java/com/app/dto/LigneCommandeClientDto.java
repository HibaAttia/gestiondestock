package com.app.dto;

import com.app.model.Article;
import com.app.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Builder
@Data
public class LigneCommandeClientDto {

    private Article article;

    private CommandeClient commandeClient;

}
