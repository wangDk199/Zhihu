package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ke
 * @ClassName Section
 * @Description TOOD
 * @Date 2020/1/16
 * @Version 1.0
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
