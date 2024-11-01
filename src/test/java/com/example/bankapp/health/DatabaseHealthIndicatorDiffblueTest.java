package com.example.bankapp.health;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariPoolMXBean;

import java.sql.SQLException;
import java.util.Map;
import javax.sql.DataSource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {DatabaseHealthIndicator.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class DatabaseHealthIndicatorDiffblueTest {
    @Autowired
    private DatabaseHealthIndicator databaseHealthIndicator;

    @MockBean
    private JdbcTemplate jdbcTemplate;

    /**
     * Test {@link DatabaseHealthIndicator#health()}.
     * <ul>
     *   <li>Then return Details size is two.</li>
     * </ul>
     * <p>
     * Method under test: {@link DatabaseHealthIndicator#health()}
     */
    @Test
    @DisplayName("Test health(); then return Details size is two")
    void testHealth_thenReturnDetailsSizeIsTwo() throws SQLException, DataAccessException {
        // Arrange
        HikariDataSource hikariDataSource = mock(HikariDataSource.class);
        when(hikariDataSource.getHikariPoolMXBean()).thenReturn(null);
        DataSource dataSource = mock(DataSource.class);
        when(dataSource.unwrap(Mockito.<Class<HikariDataSource>>any())).thenReturn(hikariDataSource);
        when(jdbcTemplate.queryForObject(Mockito.<String>any(), Mockito.<Class<Object>>any()))
                .thenReturn("Query For Object");
        when(jdbcTemplate.queryForObject(Mockito.<String>any(), Mockito.<Class<Integer>>any())).thenReturn(1);
        when(jdbcTemplate.getDataSource()).thenReturn(dataSource);

        // Act
        Health actualHealthResult = databaseHealthIndicator.health();

        // Assert
        verify(hikariDataSource).getHikariPoolMXBean();
        verify(dataSource).unwrap(isA(Class.class));
        verify(jdbcTemplate, atLeast(1)).queryForObject(eq("SELECT 1"), isA(Class.class));
        verify(jdbcTemplate).getDataSource();
        Map<String, Object> details = actualHealthResult.getDetails();
        assertEquals(2, details.size());
        assertEquals(
                "Cannot invoke \"com.zaxxer.hikari.HikariPoolMXBean.getActiveConnections()\" because the return value of"
                        + " \"com.zaxxer.hikari.HikariDataSource.getHikariPoolMXBean()\" is null",
                details.get("error"));
        Status status = actualHealthResult.getStatus();
        assertEquals("DOWN", status.getCode());
        assertEquals("DOWN", status.toString());
        assertTrue(details.containsKey("database"));
    }

    /**
     * Test {@link DatabaseHealthIndicator#health()}.
     * <ul>
     *   <li>Then return Status Description is empty string.</li>
     * </ul>
     * <p>
     * Method under test: {@link DatabaseHealthIndicator#health()}
     */
    @Test
    @DisplayName("Test health(); then return Status Description is empty string")
    void testHealth_thenReturnStatusDescriptionIsEmptyString() throws SQLException, DataAccessException {
        // Arrange
        HikariPoolMXBean hikariPoolMXBean = mock(HikariPoolMXBean.class);
        when(hikariPoolMXBean.getActiveConnections()).thenReturn(1);
        when(hikariPoolMXBean.getIdleConnections()).thenReturn(1);
        HikariDataSource hikariDataSource = mock(HikariDataSource.class);
        when(hikariDataSource.getHikariPoolMXBean()).thenReturn(hikariPoolMXBean);
        DataSource dataSource = mock(DataSource.class);
        when(dataSource.unwrap(Mockito.<Class<HikariDataSource>>any())).thenReturn(hikariDataSource);
        when(jdbcTemplate.queryForObject(Mockito.<String>any(), Mockito.<Class<Object>>any()))
                .thenReturn("Query For Object");
        when(jdbcTemplate.queryForObject(Mockito.<String>any(), Mockito.<Class<Integer>>any())).thenReturn(1);
        when(jdbcTemplate.getDataSource()).thenReturn(dataSource);

        // Act
        Health actualHealthResult = databaseHealthIndicator.health();

        // Assert
        verify(hikariDataSource, atLeast(1)).getHikariPoolMXBean();
        verify(hikariPoolMXBean).getActiveConnections();
        verify(hikariPoolMXBean).getIdleConnections();
        verify(dataSource, atLeast(1)).unwrap(isA(Class.class));
        verify(jdbcTemplate, atLeast(1)).queryForObject(eq("SELECT 1"), isA(Class.class));
        verify(jdbcTemplate, atLeast(1)).getDataSource();
        Status status = actualHealthResult.getStatus();
        assertEquals("", status.getDescription());
        Map<String, Object> details = actualHealthResult.getDetails();
        assertEquals(3, details.size());
        assertEquals("MySQL", details.get("database"));
        assertEquals("UP", status.getCode());
        assertEquals("UP", status.toString());
        assertTrue(details.containsKey("active_connections"));
        assertTrue(details.containsKey("idle_connections"));
    }
}
