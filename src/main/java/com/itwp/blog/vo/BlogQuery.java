package com.itwp.blog.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Carl Wu on 2020/3/29 14:42
 */
@Data
@NoArgsConstructor
public class BlogQuery {

    private String title;
    private Long typeId;
    private boolean recommend;
}
