package com.leyou.item.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mr.Zhang
 * @since 2019-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbOrderLogistics extends Model<TbOrderLogistics> {

private static final long serialVersionUID=1L;

    /**
     * 订单id，与订单表一对一
     */
    private Long orderId;

    /**
     * 物流单号
     */
    private String logisticsNumber;

    /**
     * 物流公司名称
     */
    private String logisticsCompany;

    /**
     * 收件人
     */
    private String addressee;

    /**
     * 收件人手机号码
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 街道
     */
    private String street;

    /**
     * 邮编
     */
    private Integer postcode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

}
