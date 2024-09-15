package br.com.wsp.gazin.entity.enums;

import br.com.wsp.gazin.entity.Status;

public enum StatusEnum {

    PENDING(1L, "pending"),
    SUCCESS(2L, "success"),
    ERROR(3L, "error"),
    CANCELED(4L, "canceled");


    private Long id;
    private String description;

    StatusEnum(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Status toChannel() {
        return new Status(id, description);
    }
}
