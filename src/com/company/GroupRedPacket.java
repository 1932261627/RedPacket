package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : ZH
 * @date : 2021/5/9
 */
public class GroupRedPacket extends PersonalRedPacket{
    private int count;

    public GroupRedPacket(BigDecimal money, int count) {
        super(money);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void snatch(){
        Random random = new Random();
        if(count>1){
            double randomMoney=random.nextDouble()*super.getMoney().doubleValue();
            BigDecimal bg = new BigDecimal(randomMoney);
            BigDecimal res = bg.setScale(2, BigDecimal.ROUND_HALF_UP);
            System.out.println("恭喜你抢到"+res+"元红包");
            super.setMoney(super.getMoney().subtract(res));
            this.count--;
        }else if(count==1){
            System.out.println("恭喜你抢到"+super.getMoney()+"元红包");
            super.setMoney(new BigDecimal(0));
            count--;
        }else{
            System.out.println("你来晚了,红包已经被抢完了!");
        }
    }


}
