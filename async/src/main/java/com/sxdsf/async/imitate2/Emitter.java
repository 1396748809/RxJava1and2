package com.sxdsf.async.imitate2;

/**
 * com.sxdsf.async.imitate2.Emitter
 *
 * @author SXDSF
 * @date 2017/11/5 下午11:41
 * @desc 用于发射数据
 */

public interface Emitter<T> {

    void onReceive(T t);

    void onCompleted();

    void onError(Throwable t);
}
