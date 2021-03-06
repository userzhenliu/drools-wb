/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.scenariosimulation.backend.server.runner.model;

import org.drools.workbench.screens.scenariosimulation.model.FactIdentifier;

public class ScenarioGiven {

    private final FactIdentifier factIdentifier;
    private final Object value;

    public ScenarioGiven(FactIdentifier factIdentifier, Object value) {
        this.factIdentifier = factIdentifier;
        this.value = value;
    }

    public FactIdentifier getFactIdentifier() {
        return factIdentifier;
    }

    public Object getValue() {
        return value;
    }
}
