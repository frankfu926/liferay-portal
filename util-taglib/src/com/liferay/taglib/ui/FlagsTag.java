/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.taglib.ui;

import com.liferay.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;

/**
 * <a href="FlagsTag.java.html"><b><i>View Source</i></b></a>
 *
 * @author Julio Camarero
 *
 */
public class FlagsTag extends IncludeTag {

	public int doStartTag() {
		HttpServletRequest request =
			(HttpServletRequest)pageContext.getRequest();

		request.setAttribute("liferay-ui:flags:className", _className);
		request.setAttribute(
			"liferay-ui:flags:classPK", String.valueOf(_classPK));
		request.setAttribute(
			"liferay-ui:flags:userId", String.valueOf(_userId));
		request.setAttribute("liferay-ui:flags:title", _title);
		request.setAttribute("liferay-ui:flags:message", _message);
		request.setAttribute("liferay-ui:flags:label", String.valueOf(_label));

		return EVAL_BODY_BUFFERED;
	}

	public void setClassName(String className) {
		_className = className;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public void setLabel(boolean label) {
		_label = label;
	}

	protected String getDefaultPage() {
		return _PAGE;
	}

	private static final String _PAGE = "/html/taglib/ui/flags/page.jsp";

	private String _className;
	private long _classPK;
	private long _userId;
	private String _title;
	private String _message;
	private boolean _label = true;

}