package com.mycompany.app.kunden;

public record KundenRegistrationRequest(
        String Name,
        String Nachname,
        String email) {
}
