package com.example.bankapp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AccountDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link Account#Account()}
     *   <li>{@link Account#setAuthorities(Collection)}
     *   <li>{@link Account#setBalance(BigDecimal)}
     *   <li>{@link Account#setId(Long)}
     *   <li>{@link Account#setPassword(String)}
     *   <li>{@link Account#setTransactions(List)}
     *   <li>{@link Account#setUsername(String)}
     *   <li>{@link Account#getAuthorities()}
     *   <li>{@link Account#getBalance()}
     *   <li>{@link Account#getId()}
     *   <li>{@link Account#getPassword()}
     *   <li>{@link Account#getTransactions()}
     *   <li>{@link Account#getUsername()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    void testGettersAndSetters() {
        // Arrange and Act
        Account actualAccount = new Account();
        actualAccount.setAuthorities(null);
        BigDecimal balance = new BigDecimal("2.3");
        actualAccount.setBalance(balance);
        actualAccount.setId(1L);
        actualAccount.setPassword("iloveyou");
        actualAccount.setTransactions(null);
        actualAccount.setUsername("janedoe");
        actualAccount.getAuthorities();
        BigDecimal actualBalance = actualAccount.getBalance();
        Long actualId = actualAccount.getId();
        String actualPassword = actualAccount.getPassword();
        actualAccount.getTransactions();

        // Assert that nothing has changed
        assertEquals("iloveyou", actualPassword);
        assertEquals("janedoe", actualAccount.getUsername());
        assertEquals(1L, actualId.longValue());
        assertEquals(new BigDecimal("2.3"), actualBalance);
        assertSame(balance, actualBalance);
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>When {@code janedoe}.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link Account#Account(String, String, BigDecimal, List, Collection)}
     *   <li>{@link Account#setAuthorities(Collection)}
     *   <li>{@link Account#setBalance(BigDecimal)}
     *   <li>{@link Account#setId(Long)}
     *   <li>{@link Account#setPassword(String)}
     *   <li>{@link Account#setTransactions(List)}
     *   <li>{@link Account#setUsername(String)}
     *   <li>{@link Account#getAuthorities()}
     *   <li>{@link Account#getBalance()}
     *   <li>{@link Account#getId()}
     *   <li>{@link Account#getPassword()}
     *   <li>{@link Account#getTransactions()}
     *   <li>{@link Account#getUsername()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; when 'janedoe'")
    void testGettersAndSetters_whenJanedoe() {
        // Arrange and Act
        Account actualAccount = new Account("janedoe", "iloveyou", new BigDecimal("2.3"), null, null);
        actualAccount.setAuthorities(null);
        BigDecimal balance = new BigDecimal("2.3");
        actualAccount.setBalance(balance);
        actualAccount.setId(1L);
        actualAccount.setPassword("iloveyou");
        actualAccount.setTransactions(null);
        actualAccount.setUsername("janedoe");
        actualAccount.getAuthorities();
        BigDecimal actualBalance = actualAccount.getBalance();
        Long actualId = actualAccount.getId();
        String actualPassword = actualAccount.getPassword();
        actualAccount.getTransactions();

        // Assert that nothing has changed
        assertEquals("iloveyou", actualPassword);
        assertEquals("janedoe", actualAccount.getUsername());
        assertEquals(1L, actualId.longValue());
        assertEquals(new BigDecimal("2.3"), actualBalance);
        assertSame(balance, actualBalance);
    }
}
