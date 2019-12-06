/**
 * Copyright 2019 The JoyQueue Authors.
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
package io.chubao.joyqueue.config;

import io.chubao.joyqueue.toolkit.config.PropertyDef;

/**
 * BrokerConfigKeys
 * author: gaohaoxiang
 * date: 2019/12/6
 */
public enum BrokerConfigKeys implements PropertyDef {

    FRONTEND_SERVER_PORT("broker.frontend-server.transport.server.port", 50088, Type.INT),

    ;

    private String name;
    private Object value;
    private PropertyDef.Type type;

    BrokerConfigKeys(String name, Object value, PropertyDef.Type type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Type getType() {
        return type;
    }
}