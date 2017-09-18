package org.seckill.exception;

//秒杀相关异常(所有的秒杀相关异常都继承自它)
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
