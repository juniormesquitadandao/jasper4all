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
package net.sf.jasperreports.export;

import net.sf.jasperreports.engine.JRPropertiesUtil;
import net.sf.jasperreports.engine.export.JRCsvMetadataExporter;
import net.sf.jasperreports.export.annotations.ExporterParameter;
import net.sf.jasperreports.export.annotations.ExporterProperty;


/**
 * Interface containing settings used by the metadata based CSV exporter.
 *
 * @see JRCsvMetadataExporter
 * 
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: CsvMetadataReportConfiguration.java 7199 2014-08-27 13:58:10Z teodord $
 */
public interface CsvMetadataReportConfiguration extends CsvReportConfiguration
{
	/**
	 * Property whose value is used as default for the {@link #isWriteHeader()} export configuration setting.
	 * <p>
	 * The property itself defaults to <code>false</code>.
	 * </p>
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_WRITE_HEADER = JRPropertiesUtil.PROPERTY_PREFIX + "export.csv.write.header";

	/**
	 * Properties having this prefix contain comma-separated column names and are used as default 
	 * for the {@link #getColumnNames()} export configuration setting.
	 * 
	 * @see JRPropertiesUtil
	 */
	public static final String PROPERTY_COLUMN_NAMES_PREFIX = JRPropertiesUtil.PROPERTY_PREFIX + "export.csv.column.names";

	/**
	 * Returns a boolean that specifies whether the export header (the column names) should be written or not.
	 * @see #PROPERTY_WRITE_HEADER
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		type=net.sf.jasperreports.engine.export.JRCsvMetadataExporterParameter.class, 
		name="WRITE_HEADER"
		) 
	@ExporterProperty(
		value=PROPERTY_WRITE_HEADER, 
		booleanDefault=false
		)
	public Boolean isWriteHeader();

	/**
	 * Returns an array of strings representing the comma-separated names of the columns that should be exported.
	 * <p>
	 * NOTE: The order of the columns is important and, for accurate results, they should be in the same order as the original columns.
	 * </p>
	 * @see #PROPERTY_COLUMN_NAMES_PREFIX
	 */
	@SuppressWarnings("deprecation")
	@ExporterParameter(
		type=net.sf.jasperreports.engine.export.JRCsvMetadataExporterParameter.class, 
		name="COLUMN_NAMES"
		)
	@ExporterProperty(PROPERTY_COLUMN_NAMES_PREFIX)
	public String[] getColumnNames();
}