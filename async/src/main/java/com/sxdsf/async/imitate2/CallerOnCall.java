package com.sxdsf.async.imitate2;

/**
 * com.sxdsf.async.imitate2.CallerOnCall
 *
 * @author SXDSF
 * @date 2017/11/5 下午11:42
 * @desc 当打电话的时候
 */

public interface CallerOnCall<T> {

    void call(CallerEmitter<T> callerEmitter);
}
