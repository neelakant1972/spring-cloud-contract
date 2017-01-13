/*
 *  Copyright 2013-2016 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.contract.spec.internal

import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

/**
 * Represents a url path. Syntactic sugar when working with
 * {@link QueryParameters}. It's logically equal to {@link Url}
 *
 * @since 1.0.0
 */
@ToString(includePackage = false, includeFields = true, includeNames = true, includeSuper = true)
@EqualsAndHashCode(includeFields = true, callSuper = true)
@CompileStatic
class UrlPath extends Url {

	UrlPath(String path) {
		super(path)
	}

	UrlPath(DslProperty path) {
		super(path)
	}

}