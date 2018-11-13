package com.honeywell.sendmsg.service.service;


import com.honeywell.sendmsg.service.entity.SendBody;

public interface SendmsgService {
    // 单个账号	给单个设备的账户推送通知
    boolean sendMsgToOneAccount(SendBody sendBody);


    // 批量账号	给批量设备的账户推送通知
    boolean sendMsgToMultiAccount();

    //  高级批量账号	给批量设备的账户推送通知 （推送目标帐号数量 ≥10000）
    boolean sendMsgToLargeAccount();

}
