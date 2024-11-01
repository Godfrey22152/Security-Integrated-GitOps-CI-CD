package com.example.bankapp.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TransactionDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link Transaction#Transaction()}
     *   <li>{@link Transaction#setAccount(Account)}
     *   <li>{@link Transaction#setAmount(BigDecimal)}
     *   <li>{@link Transaction#setId(Long)}
     *   <li>{@link Transaction#setTimestamp(LocalDateTime)}
     *   <li>{@link Transaction#setType(String)}
     *   <li>{@link Transaction#getAccount()}
     *   <li>{@link Transaction#getAmount()}
     *   <li>{@link Transaction#getId()}
     *   <li>{@link Transaction#getTimestamp()}
     *   <li>{@link Transaction#getType()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    void testGettersAndSetters() {
        // Arrange and Act
        Transaction actualTransaction = new Transaction();
        Account account = new Account();
        account.setBalance(new BigDecimal("2.3"));
        account.setId(1L);
        account.setPassword("iloveyou");
        account.setUsername("janedoe");
        actualTransaction.setAccount(account);
        BigDecimal amount = new BigDecimal("2.3");
        actualTransaction.setAmount(amount);
        actualTransaction.setId(1L);
        LocalDateTime timestamp = LocalDate.of(1970, 1, 1).atStartOfDay();
        actualTransaction.setTimestamp(timestamp);
        actualTransaction.setType("Type");
        Account actualAccount = actualTransaction.getAccount();
        BigDecimal actualAmount = actualTransaction.getAmount();
        Long actualId = actualTransaction.getId();
        LocalDateTime actualTimestamp = actualTransaction.getTimestamp();

        // Assert that nothing has changed
        assertEquals("Type", actualTransaction.getType());
        assertEquals(1L, actualId.longValue());
        assertEquals(new BigDecimal("2.3"), actualAmount);
        assertSame(account, actualAccount);
        assertSame(amount, actualAmount);
        assertSame(timestamp, actualTimestamp);
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>Given {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.</li>
     *   <li>When {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>
     * {@link Transaction#Transaction(BigDecimal, String, LocalDateTime, Account)}
     *   <li>{@link Transaction#setAccount(Account)}
     *   <li>{@link Transaction#setAmount(BigDecimal)}
     *   <li>{@link Transaction#setId(Long)}
     *   <li>{@link Transaction#setTimestamp(LocalDateTime)}
     *   <li>{@link Transaction#setType(String)}
     *   <li>{@link Transaction#getAccount()}
     *   <li>{@link Transaction#getAmount()}
     *   <li>{@link Transaction#getId()}
     *   <li>{@link Transaction#getTimestamp()}
     *   <li>{@link Transaction#getType()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; given BigDecimal(String) with '2.3'; when BigDecimal(String) with '2.3'")
    void testGettersAndSetters_givenBigDecimalWith23_whenBigDecimalWith23() {
        // Arrange
        BigDecimal amount = new BigDecimal("2.3");
        LocalDateTime timestamp = LocalDate.of(1970, 1, 1).atStartOfDay();

        Account account = new Account();
        account.setBalance(new BigDecimal("2.3"));
        account.setId(1L);
        account.setPassword("iloveyou");
        account.setUsername("janedoe");

        // Act
        Transaction actualTransaction = new Transaction(amount, "Type", timestamp, account);
        Account account2 = new Account();
        account2.setBalance(new BigDecimal("2.3"));
        account2.setId(1L);
        account2.setPassword("iloveyou");
        account2.setUsername("janedoe");
        actualTransaction.setAccount(account2);
        BigDecimal amount2 = new BigDecimal("2.3");
        actualTransaction.setAmount(amount2);
        actualTransaction.setId(1L);
        LocalDateTime timestamp2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        actualTransaction.setTimestamp(timestamp2);
        actualTransaction.setType("Type");
        Account actualAccount = actualTransaction.getAccount();
        BigDecimal actualAmount = actualTransaction.getAmount();
        Long actualId = actualTransaction.getId();
        LocalDateTime actualTimestamp = actualTransaction.getTimestamp();

        // Assert that nothing has changed
        assertEquals("Type", actualTransaction.getType());
        assertEquals(1L, actualId.longValue());
        assertEquals(new BigDecimal("2.3"), actualAmount);
        assertSame(account2, actualAccount);
        assertSame(amount2, actualAmount);
        assertSame(timestamp2, actualTimestamp);
    }
}
