/*
 * MapOfListsDataSource.java
 *
 * Created: 2006-04-25
 *
 * Java Data Mining Framework (http://jdmf.sourceforge.net)
 * Copyright (C) 2006  Janusz Marchewa
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 *
 * $Author: quorthon $
 * $LastChangedRevision: 4 $
 * $LastChangedDate: 2006-07-03 20:10:28 +0200 (pon, 03 lip 2006) $
 */
package net.sf.jdmf.data.sources.beans;

import java.util.List;
import java.util.Map;

import net.sf.jdmf.data.sources.DataSource;


/**
 * The simplest data source. A specific map has to be prepared (keys are
 * attribute names, values are lists of attribute values).
 * 
 * @author quorthon
 */
public class MapOfListsDataSource implements DataSource {
    private Map<String, List<Comparable>> attributes;

    /**
     * @see net.sf.jdmf.data.sources.DataSource#getAttributes()
     */
    public Map<String, List<Comparable>> getAttributes() {
        return attributes;
    }

    public void setAttributes( Map<String, List<Comparable>> attributes ) {
        this.attributes = attributes;
    }
}
