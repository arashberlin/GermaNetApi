/*
 * Copyright (C) 2009 Verena Henrich, Department of General and Computational
 * Linguistics, University of Tuebingen
 *
 * This file is part of the Java API to GermaNet.
 *
 * The Java API to GermaNet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Java API to GermaNet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this API; if not, see <http://www.gnu.org/licenses/>.
 */
package germanet;

/**
 * A class to store <code>Frame</code> data.
 * 
 * @author Verena Henrich (verena.henrich at uni-tuebingen.de)
 * @version 2.0
 */
public class Frame {
    private String data;

    /**
     * Constructs a new <code>Frame</code> containing the specified data.
     * @param data the data for this <code>Frame</code>
     */
    protected Frame(String data) {
        this.data = data;
    }

    /**
     * Returns this <code>Frame</code>'s data.
     * @return this <code>Frame</code>'s data.
     */
    public String getData() {
        return data;
    }

    /**
     * Return a <code>String</code> representation of this <code>Frame</code>.
     * @return a <code>String</code> representation of this <code>Frame</code>.
     */
    @Override
    public String toString() {
        return data;
    }
}
