package cn.cnzcb.assembler;

/**
 * Created by Administrator on 2019/12/26.
 */
public interface IAssembler<R,T> {
    T convert(R r,T t);
}
