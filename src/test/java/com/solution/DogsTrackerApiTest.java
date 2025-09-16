package com.solution;

import io.micronaut.core.util.SupplierUtil;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

import java.net.http.HttpClient;
import java.util.function.Supplier;

@MicronautTest
class DogsTrackerApiTest {

    @Inject
    EmbeddedApplication<?> application;


    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());

    }

    @Test
    void testGetAllDogs(){

    }

}
