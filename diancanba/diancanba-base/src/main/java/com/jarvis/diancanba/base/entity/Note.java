package com.jarvis.diancanba.base.entity;

import com.jarvis.diancanba.base.pojo.DcbFood;

import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/2/1 12:07
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/2/1 12:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Note {

    private Long foodId;
    private String foodName;
    private Float price;
    private int num;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
