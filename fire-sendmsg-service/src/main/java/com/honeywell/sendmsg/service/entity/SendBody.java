package com.honeywell.sendmsg.service.entity;


import lombok.Data;

@Data
public class SendBody {
    private String audience_type;
    private String platform = "android";
    private Message message;
    private String message_type = "notify";


}
