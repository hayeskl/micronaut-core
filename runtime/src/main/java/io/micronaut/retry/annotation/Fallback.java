/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.retry.annotation;

import io.micronaut.context.annotation.Executable;
import io.micronaut.context.annotation.Secondary;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A {@link Secondary} {@link javax.inject.Scope} for types that should be used as a fallback.
 *
 * @author graemerocher
 * @since 1.0
 */
@Secondary
@Documented
@Retention(RUNTIME)
@Executable
public @interface Fallback {

    /**
     * @return The exception types to include (defaults to all)
     */
    Class<? extends Throwable>[] includes() default {};

    /**
     * @return The exception types to exclude (defaults to none)
     */
    Class<? extends Throwable>[] excludes() default {};
}
