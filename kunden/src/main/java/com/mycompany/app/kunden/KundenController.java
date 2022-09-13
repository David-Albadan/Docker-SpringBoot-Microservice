package com.mycompany.app.kunden;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/kunde")
public record KundenController(KundenService kundenService) {

    @PostMapping
     public  void registerKunden(@RequestBody KundenRegistrationRequest kundenRegistrationRequest){
        log.info("new kunden registration {}", kundenRegistrationRequest);
        kundenService.registerKunden(kundenRegistrationRequest);
     }
}
