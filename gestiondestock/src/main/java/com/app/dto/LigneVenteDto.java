package com.app.dto;

import com.app.model.Ventes;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {


    private Ventes vente;

    private BigDecimal quantite;

}
