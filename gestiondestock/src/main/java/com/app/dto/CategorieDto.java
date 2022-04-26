package com.app.dto;

import com.app.model.Article;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class CategorieDto {


    private String code;

    private String designation;

    private List<Article> articles;
}
