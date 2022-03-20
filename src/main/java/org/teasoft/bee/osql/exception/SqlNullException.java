/*
 * Copyright 2016-2020 the original author.All rights reserved.
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

package org.teasoft.bee.osql.exception;

import org.teasoft.bee.osql.BeeException;

/**
 * Sql语句是null的异常.Exception of sql statement string is null.
 * @author Kingstar
 * @since  1.6
 */
public class SqlNullException extends BeeException {
	
	static final long serialVersionUID = -875516993124221124L;


	public SqlNullException() {
		super();
	}

	public SqlNullException(String message) {
		super(message);
	}

	public SqlNullException(String message, Throwable cause) {
		super(message, cause);
	}

	public SqlNullException(Throwable cause) {
		super(cause);
	}
}

