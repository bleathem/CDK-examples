/**
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 **/
package ca.bleathem.richfaces.jquery.renderkit;

/**
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */

import org.richfaces.renderkit.InputRendererBase;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

@ResourceDependencies({
        @ResourceDependency(library = "javax.faces", name = "jsf.js"),
        @ResourceDependency(name = "jquery.js"),
        @ResourceDependency(library = "com.jqueryui/css/ui-lightness", name = "jquery-ui-1.8.16.custom.css"),
        @ResourceDependency(library = "com.jqueryui/development-bundle/ui", name = "jquery.ui.core.js"),
        @ResourceDependency(library = "com.jqueryui/development-bundle/ui", name = "jquery.ui.widget.js"),
        @ResourceDependency(library = "com.jqueryui/development-bundle/ui", name = "jquery.ui.datepicker.js"),
        @ResourceDependency(library = "ca.bleathem", name = "calendar.js")
})
public class CalenderRendererBase extends InputRendererBase {
}
