package com.itayscode.clients.notification;

import java.time.LocalDateTime;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String sender,
        String message
) {
}
