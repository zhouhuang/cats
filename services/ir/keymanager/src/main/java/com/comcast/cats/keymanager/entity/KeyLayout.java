/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * This file is part of CATS.
 *
 * CATS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CATS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CATS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comcast.cats.keymanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * KeyLayout generated by hbm2java. Added Named queries, additional
 * constructors, getters and setters.
 * 
 * @author thusai000
 * 
 */

@Entity
@Table(name = "key_layout", catalog = "keymanager")
@NamedQueries( { @NamedQuery(name = "KeyLayout.FindByTypeFormat", query = "SELECT kl FROM KeyLayout kl "
	+ "WHERE kl.remoteType.remoteTypeName =:remoteType"
	+ " AND kl.keyCodeFormat.keyCodeFormatName =:formatName"),
	@NamedQuery(name = "KeyLayout.FindByTypeFormatName", query = "SELECT kl FROM KeyLayout kl "
		+ "WHERE kl.keyCodeFormat.keyCodeFormatName =:formatName"
		+ " AND kl.remoteType.remoteTypeName =:remoteType"
		+ " AND kl.keyName =:keyName") })
public class KeyLayout implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6190815180849530205L;
	private Integer keyLayoutId;
	private RemoteType remoteType;
	private KeyCodeFormat keyCodeFormat;
	private String keyName;
	private Integer panel;
	private Integer row;
	private Integer column;
	private String foreColor;
	private String backColor;

	/**
	 * Default Constructor.
	 */
	public KeyLayout() {
	}

	/**
	 * @param keyLayoutId
	 * @param remoteType
	 * @param keyCodeFormat
	 * @param keyName
	 * @param panel
	 * @param row
	 * @param column
	 */
	public KeyLayout(Integer keyLayoutId, RemoteType remoteType,
			KeyCodeFormat keyCodeFormat, String keyName, Integer panel, Integer row,
			Integer column) {
		this.keyLayoutId = keyLayoutId;
		this.remoteType = remoteType;
		this.keyCodeFormat = keyCodeFormat;
		this.keyName = keyName;
		this.panel = panel;
		this.row = row;
		this.column = column;
	}

	/**
	 * @param keyLayoutId
	 * @param remoteType
	 * @param keyCodeFormat
	 * @param keyName
	 * @param panel
	 * @param row
	 * @param column
	 * @param foreColor
	 * @param backColor
	 */
	public KeyLayout(Integer keyLayoutId, RemoteType remoteType,
			KeyCodeFormat keyCodeFormat, String keyName, Integer panel, Integer row,
			Integer column, String foreColor, String backColor) {
		this.keyLayoutId = keyLayoutId;
		this.remoteType = remoteType;
		this.keyCodeFormat = keyCodeFormat;
		this.keyName = keyName;
		this.panel = panel;
		this.row = row;
		this.column = column;
		this.foreColor = foreColor;
		this.backColor = backColor;
	}

	public KeyLayout(RemoteType remoteType, KeyCodeFormat keyCodeFormat,
			String keyName, Integer panel, Integer row, Integer column, String foreColor,
			String backColor) {
		this.keyLayoutId = keyLayoutId;
		this.remoteType = remoteType;
		this.keyCodeFormat = keyCodeFormat;
		this.keyName = keyName;
		this.panel = panel;
		this.row = row;
		this.column = column;
		this.foreColor = foreColor;
		this.backColor = backColor;
	}

	public KeyLayout(RemoteType remoteType, KeyCodeFormat keyCodeFormat,
			String keyName, Integer panel, Integer row, Integer column) {
		this.remoteType = remoteType;
		this.keyCodeFormat = keyCodeFormat;
		this.keyName = keyName;
		this.panel = panel;
		this.row = row;
		this.column = column;
	}

	/**
	 * @return
	 */
	@Id
	@Column(name = "key_layout_id", unique = true, nullable = false)
	public Integer getKeyLayoutId() {
		return this.keyLayoutId;
	}

	/**
	 * @param keyLayoutId
	 */
	public void setKeyLayoutId(Integer keyLayoutId) {
		this.keyLayoutId = keyLayoutId;
	}

	/**
	 * @return
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_remote_type_id", nullable = false)
	public RemoteType getRemoteType() {
		return this.remoteType;
	}

	/**
	 * @param remoteType
	 */
	public void setRemoteType(RemoteType remoteType) {
		this.remoteType = remoteType;
	}

	/**
	 * @return
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_key_code_format_id", nullable = false)
	public KeyCodeFormat getKeyCodeFormat() {
		return this.keyCodeFormat;
	}

	/**
	 * @param keyCodeFormat
	 */
	public void setKeyCodeFormat(KeyCodeFormat keyCodeFormat) {
		this.keyCodeFormat = keyCodeFormat;
	}

	/**
	 * @return
	 */
	@Column(name = "key_name", nullable = false, length = 45)
	public String getKeyName() {
		return this.keyName;
	}

	/**
	 * @param keyName
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 * @return
	 */
	@Column(name = "panel", nullable = false)
	public Integer getPanel() {
		return this.panel;
	}

	/**
	 * @param panel
	 */
	public void setPanel(Integer panel) {
		this.panel = panel;
	}

	/**
	 * @return
	 */
	@Column(name = "row_num", nullable = false)
	public Integer getRow() {
		return this.row;
	}

	/**
	 * @param row
	 */
	public void setRow(Integer row) {
		this.row = row;
	}

	/**
	 * @return
	 */
	@Column(name = "column_num", nullable = false)
	public Integer getColumn() {
		return this.column;
	}

	/**
	 * @param column
	 */
	public void setColumn(Integer column) {
		this.column = column;
	}

	/**
	 * @return
	 */
	@Column(name = "fore_color", length = 45)
	public String getForeColor() {
		return this.foreColor;
	}

	/**
	 * @param foreColor
	 */
	public void setForeColor(String foreColor) {
		this.foreColor = foreColor;
	}

	/**
	 * @return
	 */
	@Column(name = "back_color", length = 45)
	public String getBackColor() {
		return this.backColor;
	}

	/**
	 * @param backColor
	 */
	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}

	@Override
	public String toString() {
		return ("\n" + this.keyLayoutId + ": " + this.keyName + ", panel:"
				+ panel + ", row:" + row + ", column:" + column);
	}
}