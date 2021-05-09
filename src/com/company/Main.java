package com.company;

import java.math.BigDecimal;
/**
 * @author : ZH
 * @date : 2021/5/9
 */
public class Main {

    public static void main(String[] args) {
        //初始化金额
        BigDecimal moneyPerson=new BigDecimal("0.242423");
        //保留两位小数
        BigDecimal roundMoneyPerson=moneyPerson.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("保留两位小数:"+roundMoneyPerson);
        //初始化对象-个人红包
        PersonalRedPacket personalRedPacket=new PersonalRedPacket(roundMoneyPerson);
        personalRedPacket.snatch();
        personalRedPacket.snatch();

        System.out.println("-------****--------------");

        //初始化金额
        BigDecimal moneyGroup=new BigDecimal("40");
        //保留两位小数
        BigDecimal roundMoneyGroup=moneyGroup.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println("保留两位小数:"+roundMoneyGroup);
        //初始化对象-群红包
        GroupRedPacket groupRedPacket = new GroupRedPacket(roundMoneyGroup,4);
        int count=groupRedPacket.getCount();
        for(int i=0;i<=count;i++){
            groupRedPacket.snatch();
        }

    }
}
