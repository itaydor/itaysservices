package com.itayscode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
