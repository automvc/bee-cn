/*
 * Copyright 2020-2022 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teasoft.bee.osql.type;

/**
 * 实体字段类型查询结果处理器.
 * 根据实体的字段类型,选用处理器处理查询返回结果.
 * 若要使用,需要开启openFieldTypeHandler配置.
 * The TypeHandler work for handle ResultSet by select.
 * @author Kingstar
 * @since  1.11
 */
public interface TypeHandler<T> {

	/**
	 * 使用自定义字段类型处理器处理查询返回结果.
	 * @param fieldType Javabean field type.
	 * @param result get from ResultSet.
	 * @return processed result.
	 */
	public T process(final Class<T> fieldType, final Object result);


}
