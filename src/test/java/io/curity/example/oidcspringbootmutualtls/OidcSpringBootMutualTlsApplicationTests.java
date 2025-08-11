package io.curity.example.oidcspringbootmutualtls;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OidcSpringBootMutualTlsApplicationTests {

    @Autowired
    private SecurityWebFilterChain securityWebFilterChain;

    @Autowired
    private TrustStoreConfig trustStoreConfig;

    @Test
    void contextLoads() {
        assertNotNull(securityWebFilterChain);
        assertNotNull(trustStoreConfig);
    }
}
