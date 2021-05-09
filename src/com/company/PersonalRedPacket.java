package com.company;

import java.math.BigDecimal;

/**
 * @author : ZH
 * @date : 2021/5/9
 */
public class PersonalRedPacket {
    private BigDecimal money;

    public PersonalRedPacket(BigDecimal money) {
        BigDecimal bigDecimal = new BigDecimal(0);
        if (money.compareTo(bigDecimal) == 1) {
            this.money = money;
        } else {
            System.out.println("初始化红包金额错误");
            this.money = new BigDecimal(0);
        }
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void snatch() {
        //判断红包金额大于0
        BigDecimal bigDecimal1 = new BigDecimal(0);
        BigDecimal bigDecimal2 = new BigDecimal(-1);
        if (this.money.compareTo(bigDecimal1) == 1) {
            System.out.println("恭喜你抢到" + this.money + "元红包");
            this.money=new BigDecimal(-1);

        } else if (this.money.compareTo(bigDecimal2) == 0) {
            System.out.println("你已经领过该红包了");

        } else {
            System.out.println("红包金额为0!");
        }
    }

}
