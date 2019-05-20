package top.gnibbuq.pojo;

import lombok.Data;

/**
 * 订单表
 */
@Data
public class Order {
    //商品名称
    private String commodityName;
    //商家名称
    private String logistics;
    //物流名称
    private String merchants;
    //出库箱数
    private int outBox;
    //出库单件
    private int outRemainingNumber;
}
