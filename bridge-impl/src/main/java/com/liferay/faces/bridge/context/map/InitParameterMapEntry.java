/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.bridge.context.map;

import javax.portlet.PortletContext;

import com.liferay.faces.util.map.AbstractPropertyMapEntry;


/**
 * @author  Neil Griffin
 */
public class InitParameterMapEntry extends AbstractPropertyMapEntry<String> {

	private PortletContext portletContext;

	public InitParameterMapEntry(PortletContext portletContext, String key) {
		super(key);
		this.portletContext = portletContext;
	}

	public String getValue() {
		return portletContext.getInitParameter(getKey());
	}

	public String setValue(String value) {
		throw new UnsupportedOperationException();
	}
}
