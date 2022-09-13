package com.mycompany.app.kunden;

import org.springframework.stereotype.Service;
@Service
public record KundenService(KundenRepository kundenRepository) {
    public void registerKunden(KundenRegistrationRequest request) {
        Kunden kunden = Kunden.builder()
                .Name(request.Name())
                .Nachname(request.Nachname())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        // todo: store kunden in db
        kundenRepository.save(kunden);

    }
}
