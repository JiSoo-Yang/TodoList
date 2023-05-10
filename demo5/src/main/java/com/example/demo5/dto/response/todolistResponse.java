package com.example.demo5.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class todolistResponse {
    private long id;
    private String detail;

    public todolistResponse(long id, String detail) {
        this.id = id;
        this.detail = detail;
    }
}
