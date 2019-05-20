package top.gnibbuq.pojo;

import lombok.Data;

/**
 * 这个是商品表
 */
@Data
public class Commodity {
    //商品名称
    private String commodityName;
    //商品缩写
    private String commodityNameAbbreviation;
    //备注信息
    private String remarks;
    //完整每箱件数
    private int fullBox;
    //剩余件数
    private int theRemainingNumber;
    //整箱数
    private int totalBox;

}
