package com.iamsquark.v2t.model.response;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

/**
 * This is model for get ping response.
 */
@Builder
@Getter
public class GetPingResponse {
    private String ping;
    private Instant timeStamp;

}
