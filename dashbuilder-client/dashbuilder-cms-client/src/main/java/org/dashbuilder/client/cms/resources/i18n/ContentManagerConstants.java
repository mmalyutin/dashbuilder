/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.client.cms.resources.i18n;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface ContentManagerConstants extends Messages {

    ContentManagerConstants INSTANCE = GWT.create(ContentManagerConstants.class);

    String contentExplorerNew();

    String contentExplorerMenus();

    String contentManagerHome();

    String contentManagerHomeTitle();

    String contentManagerHomeWelcome();

    String contentManagerHomeCreate();

    String contentManagerNavigationChanged();

    String contentManagerHomeNewPerspective(String resourceType);

    String contentExplorer();

    String perspective();

    String perspectives();

    String noPerspectives();

    String perspectiveDragComponent();

    String perspectiveDragComponentHeader();

    String perspectiveDragComponentHelp();

    String perspectiveDragSelectorHint();

    String perspectiveDragSelectorLabel();

    String perspectiveDragNotFoundError();

    String perspectiveDragDeadlockError();
}
