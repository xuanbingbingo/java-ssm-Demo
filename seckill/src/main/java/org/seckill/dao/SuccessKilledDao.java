package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复的
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询Successkilled并携带秒杀成功对象实体
     * @param secKillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long secKillId);
}
