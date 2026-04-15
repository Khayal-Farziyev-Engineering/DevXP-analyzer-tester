package com.devxp.analyzer.security.mock;

import com.devxp.analyzer.security.SecurityConfig.Role;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Mock authentication provider for use in tests and local development.
 *
 * <p><strong>WARNING:</strong> This class bypasses real authentication.
 * It must never be wired into a production deployment.</p>
 */
public class MockAuthProvider {

    /** Pre-seeded users: username → role */
    private final Map<String, Role> userStore = new HashMap<>();

    public MockAuthProvider() {
        userStore.put("admin",     Role.ADMIN);
        userStore.put("developer", Role.DEVELOPER);
        userStore.put("viewer",    Role.VIEWER);
    }

    /**
     * Simulates authentication by returning the role for a known username.
     *
     * @param username the username to authenticate
     * @return an {@link Optional} containing the user's {@link Role}, or empty if unknown
     */
    public Optional<Role> authenticate(String username) {
        return Optional.ofNullable(userStore.get(username));
    }

    /**
     * Registers a new mock user.
     *
     * @param username the username
     * @param role     the role to assign
     */
    public void registerUser(String username, Role role) {
        userStore.put(username, role);
    }

    /** Returns the number of registered mock users. */
    public int getUserCount() {
        return userStore.size();
    }
}
