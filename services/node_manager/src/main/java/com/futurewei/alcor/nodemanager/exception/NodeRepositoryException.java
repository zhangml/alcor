/*Copyright 2019 The Alcor Authors.

Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package com.futurewei.alcor.nodemanager.exception;

import com.futurewei.alcor.common.db.CacheException;

public class NodeRepositoryException extends CacheException {
    public NodeRepositoryException() {
    }
    public NodeRepositoryException(String message) {
        super(message);
    }

    public NodeRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public NodeRepositoryException(Throwable cause) {
        super(cause);
    }
}
