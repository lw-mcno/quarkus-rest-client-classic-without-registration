package org.acme;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@QuarkusMain
public class ExampleApplication implements QuarkusApplication {

    @Inject
    @RestClient
    ExampleRestService client;

    @Override
    public int run(String... args) {
        System.out.println(client.getTodo(1));
        return 0;
    }
}
