/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.trustedanalytics.servicecatalog.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class ServiceInstanceMetadata {

    @JsonProperty("creator_guid")
    private String creatorUUID;

    @JsonProperty("creator_name")
    private String creatorName;

    public ServiceInstanceMetadata() {
    }

    public ServiceInstanceMetadata(UUID creatorUUID, String creatorName) {
        this.creatorUUID = creatorUUID.toString();
        this.creatorName = creatorName;
    }
}
