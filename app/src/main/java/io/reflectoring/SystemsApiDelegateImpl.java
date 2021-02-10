package io.reflectoring;

import io.reflectoring.api.SystemsApiDelegate;
import io.reflectoring.model.System;
import org.springframework.http.ResponseEntity;
import io.reflectoring.model.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SystemsApiDelegateImpl implements SystemsApiDelegate {


    /**
     * POST /systems : Create a System
     * Creates a new instance of a &#x60;System&#x60;.
     *
     * @param system A new &#x60;System&#x60; to be created. (required)
     * @return Successful response. (status code 201)
     * @see SystemsApi#createSystem
     */
    @Override
    public ResponseEntity<Void> createSystem(System system) {

        System system1 = new System();

        return ResponseEntity.ok().build();
    }

    /**
     * GET /systems : List All Systems
     * Gets a list of all &#x60;System&#x60; entities.
     *
     * @return Successful response - returns an array of &#x60;System&#x60; entities. (status code 200)
     * @see SystemsApi#getSystems
     */
    @Override
    public ResponseEntity<List<System>> getSystems() {
        System system1 = new System();
        Component component1 = new Component();
        ArrayList<System> systems = new ArrayList<>();
        system1.setName("namn");
        system1.setId("1");
        system1.setDescription("descrition");
        system1.setComponents(new ArrayList<Component>(){{add(component1);}});
        systems.add(system1);

        return ResponseEntity.ok(systems);

    }



}
