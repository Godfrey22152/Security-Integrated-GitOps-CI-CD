package com.example.bankapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.bankapp.model.Account;
import com.example.bankapp.repository.AccountRepository;
import com.example.bankapp.repository.TransactionRepository;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AccountService.class, PasswordEncoder.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class AccountServiceDiffblueTest {
    @MockBean
    private AccountRepository accountRepository;

    @Autowired
    private AccountService accountService;

    @MockBean
    private PasswordEncoder passwordEncoder;

    @MockBean
    private TransactionRepository transactionRepository;

    /**
     * Test {@link AccountService#findAccountByUsername(String)}.
     * <p>
     * Method under test: {@link AccountService#findAccountByUsername(String)}
     */
    @Test
    @DisplayName("Test findAccountByUsername(String)")
    @Disabled("TODO: Complete this test")
    void testFindAccountByUsername() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@20df109f testClass = com.example.bankapp.service.DiffblueFakeClass14, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        accountService.findAccountByUsername("janedoe");
    }

    /**
     * Test {@link AccountService#registerAccount(String, String)}.
     * <p>
     * Method under test: {@link AccountService#registerAccount(String, String)}
     */
    @Test
    @DisplayName("Test registerAccount(String, String)")
    @Disabled("TODO: Complete this test")
    void testRegisterAccount() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@3360634c testClass = com.example.bankapp.service.DiffblueFakeClass17, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        accountService.registerAccount("janedoe", "iloveyou");
    }

    /**
     * Test {@link AccountService#deposit(Account, BigDecimal)}.
     * <p>
     * Method under test: {@link AccountService#deposit(Account, BigDecimal)}
     */
    @Test
    @DisplayName("Test deposit(Account, BigDecimal)")
    @Disabled("TODO: Complete this test")
    void testDeposit() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@45e4c42e testClass = com.example.bankapp.service.DiffblueFakeClass13, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Account account = new Account();
        account.setBalance(new BigDecimal("2.3"));
        account.setId(1L);
        account.setPassword("iloveyou");
        account.setUsername("janedoe");

        // Act
        accountService.deposit(account, new BigDecimal("2.3"));
    }

    /**
     * Test {@link AccountService#withdraw(Account, BigDecimal)}.
     * <p>
     * Method under test: {@link AccountService#withdraw(Account, BigDecimal)}
     */
    @Test
    @DisplayName("Test withdraw(Account, BigDecimal)")
    @Disabled("TODO: Complete this test")
    void testWithdraw() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@79988fbb testClass = com.example.bankapp.service.DiffblueFakeClass19, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Account account = new Account();
        account.setBalance(new BigDecimal("2.3"));
        account.setId(1L);
        account.setPassword("iloveyou");
        account.setUsername("janedoe");

        // Act
        accountService.withdraw(account, new BigDecimal("2.3"));
    }

    /**
     * Test {@link AccountService#withdraw(Account, BigDecimal)}.
     * <ul>
     *   <li>Given valueOf one.</li>
     *   <li>Then throw {@link RuntimeException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AccountService#withdraw(Account, BigDecimal)}
     */
    @Test
    @DisplayName("Test withdraw(Account, BigDecimal); given valueOf one; then throw RuntimeException")
    void testWithdraw_givenValueOfOne_thenThrowRuntimeException() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        AccountService accountService = new AccountService();
        Account account = mock(Account.class);
        when(account.getBalance()).thenReturn(BigDecimal.valueOf(1L));
        doNothing().when(account).setBalance(Mockito.<BigDecimal>any());
        doNothing().when(account).setId(Mockito.<Long>any());
        doNothing().when(account).setPassword(Mockito.<String>any());
        doNothing().when(account).setUsername(Mockito.<String>any());
        account.setBalance(new BigDecimal("2.3"));
        account.setId(1L);
        account.setPassword("iloveyou");
        account.setUsername("janedoe");

        // Act and Assert
        assertThrows(RuntimeException.class, () -> accountService.withdraw(account, new BigDecimal("2.3")));
        verify(account).getBalance();
        verify(account).setBalance(isA(BigDecimal.class));
        verify(account).setId(eq(1L));
        verify(account).setPassword(eq("iloveyou"));
        verify(account).setUsername(eq("janedoe"));
    }

    /**
     * Test {@link AccountService#getTransactionHistory(Account)}.
     * <p>
     * Method under test: {@link AccountService#getTransactionHistory(Account)}
     */
    @Test
    @DisplayName("Test getTransactionHistory(Account)")
    @Disabled("TODO: Complete this test")
    void testGetTransactionHistory() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@34c32a0e testClass = com.example.bankapp.service.DiffblueFakeClass15, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Account account = new Account();
        account.setBalance(new BigDecimal("2.3"));
        account.setId(1L);
        account.setPassword("iloveyou");
        account.setUsername("janedoe");

        // Act
        accountService.getTransactionHistory(account);
    }

    /**
     * Test {@link AccountService#loadUserByUsername(String)}.
     * <p>
     * Method under test: {@link AccountService#loadUserByUsername(String)}
     */
    @Test
    @DisplayName("Test loadUserByUsername(String)")
    @Disabled("TODO: Complete this test")
    void testLoadUserByUsername() throws UsernameNotFoundException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@e4a2e3 testClass = com.example.bankapp.service.DiffblueFakeClass16, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        accountService.loadUserByUsername("janedoe");
    }

    /**
     * Test {@link AccountService#authorities()}.
     * <p>
     * Method under test: {@link AccountService#authorities()}
     */
    @Test
    @DisplayName("Test authorities()")
    void testAuthorities() {
        // Arrange and Act
        Collection<? extends GrantedAuthority> actualAuthoritiesResult = accountService.authorities();

        // Assert
        assertTrue(actualAuthoritiesResult instanceof List);
        assertEquals(1, actualAuthoritiesResult.size());
        GrantedAuthority getResult = ((List<? extends GrantedAuthority>) actualAuthoritiesResult).get(0);
        assertTrue(getResult instanceof SimpleGrantedAuthority);
        assertEquals("USER", getResult.toString());
        assertEquals("USER", getResult.getAuthority());
    }

    /**
     * Test {@link AccountService#transferAmount(Account, String, BigDecimal)}.
     * <p>
     * Method under test:
     * {@link AccountService#transferAmount(Account, String, BigDecimal)}
     */
    @Test
    @DisplayName("Test transferAmount(Account, String, BigDecimal)")
    @Disabled("TODO: Complete this test")
    void testTransferAmount() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@6a28f7a2 testClass = com.example.bankapp.service.DiffblueFakeClass18, locations = [], classes = [com.example.bankapp.service.AccountService, org.springframework.security.crypto.password.PasswordEncoder], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@620c34bb, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@2b3e866d, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@d1960ec8, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@53e1726f, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@541a58d1], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:215)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:570)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:727)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Account fromAccount = new Account();
        fromAccount.setBalance(new BigDecimal("2.3"));
        fromAccount.setId(1L);
        fromAccount.setPassword("iloveyou");
        fromAccount.setUsername("janedoe");

        // Act
        accountService.transferAmount(fromAccount, "janedoe", new BigDecimal("2.3"));
    }

    /**
     * Test {@link AccountService#transferAmount(Account, String, BigDecimal)}.
     * <ul>
     *   <li>Given valueOf one.</li>
     *   <li>Then throw {@link RuntimeException}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link AccountService#transferAmount(Account, String, BigDecimal)}
     */
    @Test
    @DisplayName("Test transferAmount(Account, String, BigDecimal); given valueOf one; then throw RuntimeException")
    void testTransferAmount_givenValueOfOne_thenThrowRuntimeException() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        AccountService accountService = new AccountService();
        Account fromAccount = mock(Account.class);
        when(fromAccount.getBalance()).thenReturn(BigDecimal.valueOf(1L));
        doNothing().when(fromAccount).setBalance(Mockito.<BigDecimal>any());
        doNothing().when(fromAccount).setId(Mockito.<Long>any());
        doNothing().when(fromAccount).setPassword(Mockito.<String>any());
        doNothing().when(fromAccount).setUsername(Mockito.<String>any());
        fromAccount.setBalance(new BigDecimal("2.3"));
        fromAccount.setId(1L);
        fromAccount.setPassword("iloveyou");
        fromAccount.setUsername("janedoe");

        // Act and Assert
        assertThrows(RuntimeException.class,
                () -> accountService.transferAmount(fromAccount, "janedoe", new BigDecimal("2.3")));
        verify(fromAccount).getBalance();
        verify(fromAccount).setBalance(isA(BigDecimal.class));
        verify(fromAccount).setId(eq(1L));
        verify(fromAccount).setPassword(eq("iloveyou"));
        verify(fromAccount).setUsername(eq("janedoe"));
    }
}
