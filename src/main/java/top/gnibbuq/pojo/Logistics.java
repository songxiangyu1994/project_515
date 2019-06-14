package top.gnibbuq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 商家表
 */
@Component
@Data
public class Logistics {
    //商家名称
    private String logistics;
    //商家缩写
    private String logisticsAbbreviation;
}
