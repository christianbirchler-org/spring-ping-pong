package org.christianbirchler.spring_ping_pong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PingController {

    @GetMapping("/ping")
    public PingResponse getPingResponse() {
        return new PingResponse("pong");
    }
}
