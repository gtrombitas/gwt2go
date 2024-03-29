/*
 * Copyright 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.gwt2go.dev.client.ui.widget.celltree;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.shared.SafeHtmlRenderer;

public class CellTreeNodeSafeHtmlRenderer implements
		SafeHtmlRenderer<GotoPlacesModel> {

	private static CellTreeNodeSafeHtmlRenderer instance;

	public static CellTreeNodeSafeHtmlRenderer getInstance() {
		if (instance == null) {
			instance = new CellTreeNodeSafeHtmlRenderer();
		}
		return instance;
	}

	private CellTreeNodeSafeHtmlRenderer() {
	}

	@Override
	public SafeHtml render(GotoPlacesModel object) {
		return (object == null) ? SafeHtmlUtils.EMPTY_SAFE_HTML : SafeHtmlUtils
				.fromString(object.getName());
	}

	@Override
	public void render(GotoPlacesModel object, SafeHtmlBuilder builder) {
		builder.append(SafeHtmlUtils.fromString(object.getName()));
	}

}
