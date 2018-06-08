package com.example.integration.config;

import com.example.integration.webservices.CatMoviesWsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CatMoviesWsConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.integration.po.catpo");
        return marshaller;
    }

    @Bean
    public CatMoviesWsClient wsClient(Jaxb2Marshaller marshaller) {
        CatMoviesWsClient client = new CatMoviesWsClient();
        client.setDefaultUri("http://localhost:8080/ws/countries.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
