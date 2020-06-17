package com.jarvis.diancanba.base.entity;

import com.jarvis.diancanba.base.pojo.DcbBoss;
import com.jarvis.diancanba.base.pojo.DcbRestaurant;

/**
 * @Description:
 * @CreateDate: 2019/12/25 18:52
 * @UpdateUser: jarvis
 * @UpdateDate: 2019/12/25 18:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BossAndRestaurant {
    private DcbBoss boss;
    private DcbRestaurant restaurant;

    public DcbBoss getBoss() {
        return boss;
    }

    public void setBoss(DcbBoss boss) {
        this.boss = boss;
    }

    public DcbRestaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(DcbRestaurant restaurant) {
        this.restaurant = restaurant;
    }
}
