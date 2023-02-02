package com.kodilla.challenges.allegro.information;

public class AllegroInformationService implements InformationService {
    @Override
    public void sendEmail(String email) {
        System.out.println("sending Email");
    }
}
