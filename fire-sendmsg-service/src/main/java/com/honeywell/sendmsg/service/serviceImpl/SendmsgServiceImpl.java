package com.honeywell.sendmsg.service.serviceImpl;

import com.honeywell.sendmsg.service.entity.SendBody;
import com.honeywell.sendmsg.service.service.SendmsgService;
import com.honeywell.sendmsg.service.utils.HttpConection;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;


@Service
public class SendmsgServiceImpl implements SendmsgService {

    // @Value("${appId}")
    private static String appId = "appId";

    // @Value("${secretkey}")
    private static String secretkey = "secretkey";


    private String getAutho() {
        StringBuffer sb = new StringBuffer();
        StringBuffer append = sb.append(appId).append(":").append(secretkey);
        String encode = new BASE64Encoder().encode(append.toString().getBytes());
        return "Basic " + encode;
    }

    @Override
    public boolean sendMsgToOneAccount(SendBody sendBody) {
        String auto = getAutho();
        String s = HttpConection.pushMsg(auto, sendBody);
        System.out.println(s + "==========");
        return false;
    }

    @Override
    public boolean sendMsgToMultiAccount() {
        return false;
    }

    @Override
    public boolean sendMsgToLargeAccount() {
        return false;
    }
}
