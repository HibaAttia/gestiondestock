package com.app.dto;

import com.app.model.Article;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MvtStkDto {

    private Article article;
}
}
