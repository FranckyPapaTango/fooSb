/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package fooSb.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fooSb.service.http.ProjetServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see fooSb.service.http.ProjetServiceSoap
 * @generated
 */
@ProviderType
public class ProjetSoap implements Serializable {
	public static ProjetSoap toSoapModel(Projet model) {
		ProjetSoap soapModel = new ProjetSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProjetId(model.getProjetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTown(model.getTown());
		soapModel.setIsSingle(model.getIsSingle());
		soapModel.setAge(model.getAge());
		soapModel.setBirthDay(model.getBirthDay());
		soapModel.setFirstandLastName(model.getFirstandLastName());

		return soapModel;
	}

	public static ProjetSoap[] toSoapModels(Projet[] models) {
		ProjetSoap[] soapModels = new ProjetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProjetSoap[][] toSoapModels(Projet[][] models) {
		ProjetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProjetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProjetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProjetSoap[] toSoapModels(List<Projet> models) {
		List<ProjetSoap> soapModels = new ArrayList<ProjetSoap>(models.size());

		for (Projet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProjetSoap[soapModels.size()]);
	}

	public ProjetSoap() {
	}

	public long getPrimaryKey() {
		return _projetId;
	}

	public void setPrimaryKey(long pk) {
		setProjetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProjetId() {
		return _projetId;
	}

	public void setProjetId(long projetId) {
		_projetId = projetId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTown() {
		return _town;
	}

	public void setTown(String town) {
		_town = town;
	}

	public boolean getIsSingle() {
		return _isSingle;
	}

	public boolean isIsSingle() {
		return _isSingle;
	}

	public void setIsSingle(boolean isSingle) {
		_isSingle = isSingle;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public Date getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	public String getFirstandLastName() {
		return _firstandLastName;
	}

	public void setFirstandLastName(String firstandLastName) {
		_firstandLastName = firstandLastName;
	}

	private String _uuid;
	private long _projetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _town;
	private boolean _isSingle;
	private int _age;
	private Date _birthDay;
	private String _firstandLastName;
}