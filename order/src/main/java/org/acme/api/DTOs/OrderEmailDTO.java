package org.acme.api.DTOs;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
public record OrderEmailDTO(UUID CommandeId, BigDecimal TotalAmount, LocalDateTime RecievedAT , boolean Orderstatus)
{

}