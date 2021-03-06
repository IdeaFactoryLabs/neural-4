package io.neural.jwt.claim;

import java.util.HashMap;
import java.util.Map;

/**
 * The ClaimsHolder class is just a wrapper for the Map of Claims used for building a JWT.
 */
public final class ClaimsHolder {
	
    private Map<String, Object> claims;

    public ClaimsHolder(Map<String, Object> claims) {
        this.claims = claims == null ? new HashMap<String, Object>() : claims;
    }

    public Map<String, Object> getClaims() {
        return claims;
    }
    
}
