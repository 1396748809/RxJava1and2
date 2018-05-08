package com.sxdsf.async.imitate2;

/**
 * com.sxdsf.async.imitate2.NewThreadSwitcher
 *
 * @author SXDSF
 * @date 2017/11/15 上午12:42
 * @desc 文件描述
 */

public class NewThreadSwitcher extends Switcher {

    @Override
    public Worker createWorker() {
        return new NewThreadWorker();
    }
}
