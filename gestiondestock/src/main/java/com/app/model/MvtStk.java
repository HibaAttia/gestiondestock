package com.app.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="MvtStk")
public class MvtStk extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
}
