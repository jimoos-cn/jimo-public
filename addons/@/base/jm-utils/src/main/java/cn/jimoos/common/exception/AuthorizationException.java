/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package cn.jimoos.common.exception;

/**
 * Exception thrown if there is a problem during authorization (access control check).
 *
 * @author chenqisheng
 * @since 0.1
 */
public class AuthorizationException extends Exception {

    /**
     * Creates a new AuthorizationException.
     */
    public AuthorizationException() {
        super();
    }

    /**
     * Constructs a new AuthorizationException.
     *
     * @param message the reason for the exception
     */
    public AuthorizationException(String message) {
        super(message);
    }
}
