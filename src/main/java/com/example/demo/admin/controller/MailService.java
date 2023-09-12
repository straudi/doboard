package com.example.demo.admin.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/api")
public class MailService {
    private MailMessage mailMessage;
    @GetMapping("/{mail}")
    public String getMail(@PathVariable String mail){
        /*
        - GET요청
           - 입력한 데이터를  URL에 붙혀서 전송을 한다 -> 데이터가 다 보임으로 취약
           - 전송할 수 있는 데이터는 256바이트를 넘기지 못한다.
           - 캐싱을 할 수 있다.
           - 동일한 get요청은 항상 동일한 응답을 보내야 한다.
        */
        return mail;
    }

    @PostMapping("/{mail}")
    public String postMail(@PathVariable String mail) {
        /*
        - POST요청
            - 입력한 데이터를 본분안에 포함해서 전송(URL에 대이터가 보이지 않음으로 GET보다 보안에 우수)
            - 전송할 수 있는 데이터 길이의 제한이 없다.
            - 복잡한 형태의 데이터를 보낼 수 있다.
            - 캐시할 수 없다
            - 동일한 post요청이라도 다른 응답을 보낼 수 있다.
        */
        return mail;
    }

    @PutMapping("/")
    public void putMail() {
        /*
         - PUT요청
            - URI에 해당하는 데이터를 새로 만들거나 수정할 때 사용
            - URI에 보내는 데이터에 해당하는 리소스를 지칭하고 post같은 경우에는 처리할 리소스를 지칭
            - 동일한 put요청은 동일한  응답을 보낸다.
        */
    }

    @DeleteMapping("/{mail}")
    public String deleteMail(@PathVariable String mail) {
        /*
          -DELETE요청
            - URI에 해당하는 리소스를 삭제할 때 사용한다.
            - 동일한 delete요청은 동일한  응답을 보낸다.
        */
        return mail;
    }

    @PatchMapping("/{mail}")
    public String patchMail(@PathVariable String mail) {
        /*
          - PATCH요청
             - URI에서 자원의 일부를 업데이트
             - 기존 엔티티와 새 데이터만 보냄
             - 동일한 patch요청은 동일한  응답을 보낸다.
        */
        return mail;
    }
}