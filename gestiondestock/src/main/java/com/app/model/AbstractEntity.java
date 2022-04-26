package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@MappedSuperclass
// va automatiquement écouter cette classe, et chaque fois qu'elle trouve creationDate, lastModifiedDate,
// va mettre à jour ces champs dans la base de donnée automatiquement
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @Column(name ="creationDate", nullable = false)
    @JsonIgnore
    private Instant creationDate;
    @LastModifiedDate
    @Column(name = "lastModifiedDate")
    @JsonIgnore
    private Instant lastModifiedDate;

}
