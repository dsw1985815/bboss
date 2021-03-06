package com.frameworkset.orm.annotation;/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于批量更新
 * Updateedit
 * When using update action retry_on_conflict can be used as field in the action itself (not in the extra payload line),
 * to specify how many times an update should be retried in the case of a version conflict.
 *
 * The update action payload, supports the following options: doc (partial document), upsert, doc_as_upsert, script, params (for script),
 * lang (for script) and _source. See update documentation for details on the options. Example with update actions:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ESDocAsUpsert {
	/**
	 * 标识是否保存注解对应的字段的值
	 * @return
	 */
	boolean persistent() default false;
}
