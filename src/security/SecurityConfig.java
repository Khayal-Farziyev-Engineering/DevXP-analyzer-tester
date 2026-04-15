package com.devxp.analyzer.security;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Base security configuration for DevXP Analyzer.
 *
 * <p><strong>NOTE:</strong> This is a skeleton/mock configuration intended for
 * development and testing purposes only. Do NOT use this in production without
 * a proper security review.</p>
 */
public class SecurityConfig {

    /** Roles available in the system. */
    public enum Role {
        ADMIN,
        DEVELOPER,
        VIEWER
    }

    private final Map<String, Set<Role>> rolePermissions = new HashMap<>();

    public SecurityConfig() {
        rolePermissions.put("read",   Set.of(Role.ADMIN, Role.DEVELOPER, Role.VIEWER));
        rolePermissions.put("write",  Set.of(Role.ADMIN, Role.DEVELOPER));
        rolePermissions.put("delete", Set.of(Role.ADMIN));
    }

    /**
     * Checks whether the given role is permitted to perform {@code action}.
     *
     * @param role   the caller's role
     * @param action the action to check (e.g. "read", "write")
     * @return {@code true} if permitted
     */
    public boolean isPermitted(Role role, String action) {
        Set<Role> allowed = rolePermissions.getOrDefault(action, Collections.emptySet());
        return allowed.contains(role);
    }

    /** Returns an unmodifiable view of the permission map. */
    public Map<String, Set<Role>> getRolePermissions() {
        return Collections.unmodifiableMap(rolePermissions);
    }
}
