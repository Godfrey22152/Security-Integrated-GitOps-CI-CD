package com.example.bankapp.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.bankapp.service.AccountService;

import java.math.BigDecimal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {BankController.class, AccountService.class})
@ExtendWith(SpringExtension.class)
class BankControllerDiffblueTest {
    @Autowired
    private BankController bankController;

    /**
     * Test {@link BankController#showRegistrationForm()}.
     * <p>
     * Method under test: {@link BankController#showRegistrationForm()}
     */
    @Test
    @DisplayName("Test showRegistrationForm()")
    void testShowRegistrationForm() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("register", (new BankController()).showRegistrationForm());
    }

    /**
     * Test {@link BankController#showRegistrationForm()}.
     * <p>
     * Method under test: {@link BankController#showRegistrationForm()}
     */
    @Test
    @DisplayName("Test showRegistrationForm()")
    @Disabled("TODO: Complete this test")
    void testShowRegistrationForm2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@4c3bcbaf testClass = com.example.bankapp.controller.DiffblueFakeClass142, locations = [], classes = [com.example.bankapp.controller.BankController, com.example.bankapp.service.AccountService], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@28f90b46, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3d29e103, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@5d4fac8d, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6a38f256], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/register");

        // Act
        MockMvcBuilders.standaloneSetup(bankController).build().perform(requestBuilder);
    }

    /**
     * Test {@link BankController#registerAccount(String, String, Model)}.
     * <p>
     * Method under test:
     * {@link BankController#registerAccount(String, String, Model)}
     */
    @Test
    @DisplayName("Test registerAccount(String, String, Model)")
    void testRegisterAccount() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange
        BankController bankController = new BankController();
        ConcurrentModel model = new ConcurrentModel();

        // Act
        String actualRegisterAccountResult = bankController.registerAccount("janedoe", "iloveyou", model);

        // Assert
        assertEquals(1, model.size());
        assertEquals("Cannot invoke \"com.example.bankapp.service.AccountService.registerAccount(String, String)\" because"
                + " \"this.accountService\" is null", model.get("error"));
        assertEquals("register", actualRegisterAccountResult);
    }

    /**
     * Test {@link BankController#registerAccount(String, String, Model)}.
     * <p>
     * Method under test:
     * {@link BankController#registerAccount(String, String, Model)}
     */
    @Test
    @DisplayName("Test registerAccount(String, String, Model)")
    @Disabled("TODO: Complete this test")
    void testRegisterAccount2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@38761e00 testClass = com.example.bankapp.controller.DiffblueFakeClass139, locations = [], classes = [com.example.bankapp.controller.BankController, com.example.bankapp.service.AccountService], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@28f90b46, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3d29e103, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@5d4fac8d, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6a38f256], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/register")
                .param("password", "foo")
                .param("username", "foo");

        // Act
        MockMvcBuilders.standaloneSetup(bankController).build().perform(requestBuilder);
    }

    /**
     * Test {@link BankController#login()}.
     * <p>
     * Method under test: {@link BankController#login()}
     */
    @Test
    @DisplayName("Test login()")
    void testLogin() {
        //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

        // Arrange, Act and Assert
        assertEquals("login", (new BankController()).login());
    }

    /**
     * Test {@link BankController#login()}.
     * <p>
     * Method under test: {@link BankController#login()}
     */
    @Test
    @DisplayName("Test login()")
    @Disabled("TODO: Complete this test")
    void testLogin2() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@42ad3b0a testClass = com.example.bankapp.controller.DiffblueFakeClass136, locations = [], classes = [com.example.bankapp.controller.BankController, com.example.bankapp.service.AccountService], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@28f90b46, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3d29e103, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@5d4fac8d, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6a38f256], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/login");

        // Act
        MockMvcBuilders.standaloneSetup(bankController).build().perform(requestBuilder);
    }

    /**
     * Test {@link BankController#dashboard(Model)}.
     * <p>
     * Method under test: {@link BankController#dashboard(Model)}
     */
    @Test
    @DisplayName("Test dashboard(Model)")
    @Disabled("TODO: Complete this test")
    void testDashboard() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   jakarta.servlet.ServletException: Request processing failed: java.lang.NullPointerException: Cannot invoke "org.springframework.security.core.Authentication.getName()" because the return value of "org.springframework.security.core.context.SecurityContext.getAuthentication()" is null
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.security.core.Authentication.getName()" because the return value of "org.springframework.security.core.context.SecurityContext.getAuthentication()" is null
        //       at com.example.bankapp.controller.BankController.dashboard(BankController.java:23)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:564)
        //       at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/dashboard");

        // Act
        MockMvcBuilders.standaloneSetup(bankController).build().perform(requestBuilder);
    }

    /**
     * Test {@link BankController#deposit(BigDecimal)}.
     * <p>
     * Method under test: {@link BankController#deposit(BigDecimal)}
     */
    @Test
    @DisplayName("Test deposit(BigDecimal)")
    @Disabled("TODO: Complete this test")
    void testDeposit() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Class not accessible.
        //   Diffblue Cover was unable to construct an instance of java.math.BigDecimal
        //   because the class is not accessible from com.example.bankapp.controller.
        //   Make BigDecimal accessible from com.example.bankapp.controller,
        //   for example by making it public.

        // Arrange
        // TODO: Populate arranged inputs
        BankController bankController = null;
        BigDecimal amount = null;

        // Act
        String actualDepositResult = bankController.deposit(amount);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Test {@link BankController#withdraw(BigDecimal, Model)}.
     * <p>
     * Method under test: {@link BankController#withdraw(BigDecimal, Model)}
     */
    @Test
    @DisplayName("Test withdraw(BigDecimal, Model)")
    @Disabled("TODO: Complete this test")
    void testWithdraw() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Class not accessible.
        //   Diffblue Cover was unable to construct an instance of java.math.BigDecimal
        //   because the class is not accessible from com.example.bankapp.controller.
        //   Make BigDecimal accessible from com.example.bankapp.controller,
        //   for example by making it public.

        // Arrange
        // TODO: Populate arranged inputs
        BankController bankController = null;
        BigDecimal amount = null;
        Model model = null;

        // Act
        String actualWithdrawResult = bankController.withdraw(amount, model);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Test {@link BankController#transferAmount(String, BigDecimal, Model)}.
     * <p>
     * Method under test:
     * {@link BankController#transferAmount(String, BigDecimal, Model)}
     */
    @Test
    @DisplayName("Test transferAmount(String, BigDecimal, Model)")
    @Disabled("TODO: Complete this test")
    void testTransferAmount() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Class not accessible.
        //   Diffblue Cover was unable to construct an instance of java.math.BigDecimal
        //   because the class is not accessible from com.example.bankapp.controller.
        //   Make BigDecimal accessible from com.example.bankapp.controller,
        //   for example by making it public.

        // Arrange
        // TODO: Populate arranged inputs
        BankController bankController = null;
        String toUsername = "";
        BigDecimal amount = null;
        Model model = null;

        // Act
        String actualTransferAmountResult = bankController.transferAmount(toUsername, amount, model);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Test {@link BankController#transactionHistory(Model)}.
     * <p>
     * Method under test: {@link BankController#transactionHistory(Model)}
     */
    @Test
    @DisplayName("Test transactionHistory(Model)")
    @Disabled("TODO: Complete this test")
    void testTransactionHistory() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@73c18341 testClass = com.example.bankapp.controller.DiffblueFakeClass145, locations = [], classes = [com.example.bankapp.controller.BankController, com.example.bankapp.service.AccountService], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@28f90b46, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@3d29e103, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@5d4fac8d, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@6a38f256], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/transactions");

        // Act
        MockMvcBuilders.standaloneSetup(bankController).build().perform(requestBuilder);
    }
}
