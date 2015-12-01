package org.openiot.ui.xgsnWebInterface.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Copyright (c) 2011-2014, OpenIoT
 * <p/>
 * This file is part of OpenIoT.
 * <p/>
 * OpenIoT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 * <p/>
 * OpenIoT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
 * <p/>
 * Contact: OpenIoT mailto: info@openiot.eu
 * @author Luke Herron
 */

@ManagedBean
@ViewScoped
public class PageController {

    private String page;

    @PostConstruct
    public void init() {
        // Set the default page
        page = "createSensor";
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}