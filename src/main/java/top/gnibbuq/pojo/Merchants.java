package top.gnibbuq.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 这个是物流表
 */
@Component
@Data
public class Merchants {
    //物流名称
    private String merchants;
    //物流缩写
    private String merchantsAbbreviation;
}
