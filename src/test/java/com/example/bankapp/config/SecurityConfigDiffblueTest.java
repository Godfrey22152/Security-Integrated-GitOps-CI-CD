package com.example.bankapp.config;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.bankapp.service.AccountService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DisabledInAotMode
@ContextConfiguration(classes = {SecurityConfig.class})
@ExtendWith(SpringExtension.class)
class SecurityConfigDiffblueTest {
    @MockBean
    private AccountService accountService;

    @Autowired
    private SecurityConfig securityConfig;

    /**
     * Test {@link SecurityConfig#passwordEncoder()}.
     * <p>
     * Method under test: {@link SecurityConfig#passwordEncoder()}
     */
    @Test
    @DisplayName("Test passwordEncoder()")
    void testPasswordEncoder() {
        // Arrange, Act and Assert
        assertTrue(SecurityConfig.passwordEncoder() instanceof BCryptPasswordEncoder);
    }

    /**
     * Test {@link SecurityConfig#securityFilterChain(HttpSecurity)}.
     * <p>
     * Method under test: {@link SecurityConfig#securityFilterChain(HttpSecurity)}
     */
    @Test
    @DisplayName("Test securityFilterChain(HttpSecurity)")
    @Disabled("TODO: Complete this test")
    void testSecurityFilterChain() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: objectPostProcessor cannot be null
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        HttpSecurity http = null;

        // Act
        SecurityFilterChain actualSecurityFilterChainResult = this.securityConfig.securityFilterChain(http);

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Test {@link SecurityConfig#configureGlobal(AuthenticationManagerBuilder)}.
     * <p>
     * Method under test:
     * {@link SecurityConfig#configureGlobal(AuthenticationManagerBuilder)}
     */
    @Test
    @DisplayName("Test configureGlobal(AuthenticationManagerBuilder)")
    @Disabled("TODO: Complete this test")
    void testConfigureGlobal() throws Exception {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Cannot apply org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer@7dc17249 to already built object
        //       at com.example.bankapp.config.SecurityConfig.configureGlobal(SecurityConfig.java:58)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        AuthenticationManagerBuilder auth = null;

        // Act
        this.securityConfig.configureGlobal(auth);

        // Assert
        // TODO: Add assertions on result
    }
}
