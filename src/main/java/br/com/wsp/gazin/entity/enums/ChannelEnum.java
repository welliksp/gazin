package br.com.wsp.gazin.entity.enums;

import br.com.wsp.gazin.entity.Channel;

public enum ChannelEnum {

    EMAIL(1L, "email"),
    SMS(2L, "sms"),
    PUSH(3L, "push"),
    WHATSAPP(4L, "whatsapp");


    private Long id;
    private String description;

    ChannelEnum(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Channel toChannel(){
        return new Channel(id, description);
    }
}
