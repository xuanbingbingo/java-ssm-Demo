package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/*
 *业务接口：站在"使用者"的角度设计接口
 * 三个方面：1。方法定义粒度 2。参数 3。返回类型
 *
 */

public interface SeckillService {

    /*
     *查询所有的秒杀记录
     * @return
     */

    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */

    Seckill getById(long seckillId);

    /**
     *秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间
     *
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /*
     * 执行秒杀操作（md5是为了防止用户秒杀的url被篡改）
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException;

}
