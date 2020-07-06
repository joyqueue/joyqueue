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
package org.joyqueue.nsr.support;

import org.joyqueue.domain.Namespace;
import org.joyqueue.nsr.service.NamespaceService;
import org.joyqueue.nsr.service.internal.NamespaceInternalService;

import java.util.List;

/**
 * DefaultNamespaceService
 * author: gaohaoxiang
 * date: 2019/8/27
 */
public class DefaultNamespaceService implements NamespaceService {

    private NamespaceInternalService namespaceInternalService;

    public DefaultNamespaceService(NamespaceInternalService namespaceInternalService) {
        this.namespaceInternalService = namespaceInternalService;
    }

    @Override
    public List<Namespace> getAll() {
        return namespaceInternalService.getAll();
    }

    @Override
    public Namespace getByCode(String code) {
        return namespaceInternalService.getByCode(code);
    }

    @Override
    public Namespace getById(String id) {
        return namespaceInternalService.getById(id);
    }

    @Override
    public Namespace add(Namespace namespace) {
        return namespaceInternalService.add(namespace);
    }

    @Override
    public Namespace update(Namespace namespace) {
        return namespaceInternalService.update(namespace);
    }

    @Override
    public void delete(String id) {
        namespaceInternalService.delete(id);
    }
}