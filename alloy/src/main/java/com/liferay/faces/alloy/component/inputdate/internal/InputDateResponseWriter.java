/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.inputdate.internal;

import java.io.IOException;

import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.inputdatetime.internal.InputDateTimeResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author  Kyle Stiemann
 */
public class InputDateResponseWriter extends InputDateTimeResponseWriter {

	public InputDateResponseWriter(ResponseWriter responseWriter, String idElement, String idValue, boolean mobile,
		boolean responsive) {
		super(responseWriter, idElement, idValue, mobile, responsive);
	}

	@Override
	public void writeAttribute(String name, Object value, String property) throws IOException {

		if (StringPool.TYPE.equals(name) && isMobile() && isResponsive()) {
			super.writeAttribute(name, "date", property);
		}
		else {
			super.writeAttribute(name, value, property);
		}
	}
}
