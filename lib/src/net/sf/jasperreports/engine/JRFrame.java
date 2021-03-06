/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine;



/**
 * An abstract representation of a report elements container.
 * <p>
 * A frame is a report element that contains sub elements.
 * It has a backgroud, a border and it stretches to accommodate its content.
 * It is usually helpful when a common background and/or common border must 
 * be put around a group of elements.
 * <p>
 * For the Graphics2D and PDF exporters, a frame is equivalent to a rectangle
 * placed behind a group of elements.  The HTML exporter creates sub-tables for frames
 * and the XLS exporter includes the frame sub elements into the grid.
 * <p>
 * For elements inside a frame, the coordinates, <code>positionType</code> and 
 * <code>stretchType</code> properties are relative to the frame instead of the band. 
 * <p/>
 * Frames can be nested into one another to any depth.
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id: JRFrame.java 7199 2014-08-27 13:58:10Z teodord $
 */
public interface JRFrame extends JRElement, JRElementGroup, JRBoxContainer
{
}
