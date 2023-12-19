package org.acme.api.DTOs;

import java.util.Map;
import java.util.UUID;
public record OrderPricingDTO(UUID orderId, Map<UUID, Integer> productMap) {

}