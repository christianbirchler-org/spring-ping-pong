package org.christianbirchler.spring_ping_pong;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PingResponse {
    private String msg;
    @Id
    private Long id;

    public PingResponse(String msg) {
        this.msg = msg;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
