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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Projet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Projet
 * @generated
 */
@ProviderType
public class ProjetWrapper implements Projet, ModelWrapper<Projet> {
	public ProjetWrapper(Projet projet) {
		_projet = projet;
	}

	@Override
	public Class<?> getModelClass() {
		return Projet.class;
	}

	@Override
	public String getModelClassName() {
		return Projet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("projetId", getProjetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("town", getTown());
		attributes.put("isSingle", getIsSingle());
		attributes.put("age", getAge());
		attributes.put("birthDay", getBirthDay());
		attributes.put("firstandLastName", getFirstandLastName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long projetId = (Long)attributes.get("projetId");

		if (projetId != null) {
			setProjetId(projetId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String town = (String)attributes.get("town");

		if (town != null) {
			setTown(town);
		}

		Boolean isSingle = (Boolean)attributes.get("isSingle");

		if (isSingle != null) {
			setIsSingle(isSingle);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		Date birthDay = (Date)attributes.get("birthDay");

		if (birthDay != null) {
			setBirthDay(birthDay);
		}

		String firstandLastName = (String)attributes.get("firstandLastName");

		if (firstandLastName != null) {
			setFirstandLastName(firstandLastName);
		}
	}

	/**
	* Returns the is single of this projet.
	*
	* @return the is single of this projet
	*/
	@Override
	public boolean getIsSingle() {
		return _projet.getIsSingle();
	}

	@Override
	public boolean isCachedModel() {
		return _projet.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _projet.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this projet is is single.
	*
	* @return <code>true</code> if this projet is is single; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsSingle() {
		return _projet.isIsSingle();
	}

	@Override
	public boolean isNew() {
		return _projet.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _projet.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<fooSb.model.Projet> toCacheModel() {
		return _projet.toCacheModel();
	}

	@Override
	public fooSb.model.Projet toEscapedModel() {
		return new ProjetWrapper(_projet.toEscapedModel());
	}

	@Override
	public fooSb.model.Projet toUnescapedModel() {
		return new ProjetWrapper(_projet.toUnescapedModel());
	}

	@Override
	public int compareTo(fooSb.model.Projet projet) {
		return _projet.compareTo(projet);
	}

	/**
	* Returns the age of this projet.
	*
	* @return the age of this projet
	*/
	@Override
	public int getAge() {
		return _projet.getAge();
	}

	@Override
	public int hashCode() {
		return _projet.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _projet.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ProjetWrapper((Projet)_projet.clone());
	}

	/**
	* Returns the firstand last name of this projet.
	*
	* @return the firstand last name of this projet
	*/
	@Override
	public java.lang.String getFirstandLastName() {
		return _projet.getFirstandLastName();
	}

	/**
	* Returns the town of this projet.
	*
	* @return the town of this projet
	*/
	@Override
	public java.lang.String getTown() {
		return _projet.getTown();
	}

	/**
	* Returns the user name of this projet.
	*
	* @return the user name of this projet
	*/
	@Override
	public java.lang.String getUserName() {
		return _projet.getUserName();
	}

	/**
	* Returns the user uuid of this projet.
	*
	* @return the user uuid of this projet
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _projet.getUserUuid();
	}

	/**
	* Returns the uuid of this projet.
	*
	* @return the uuid of this projet
	*/
	@Override
	public java.lang.String getUuid() {
		return _projet.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _projet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _projet.toXmlString();
	}

	/**
	* Returns the birth day of this projet.
	*
	* @return the birth day of this projet
	*/
	@Override
	public Date getBirthDay() {
		return _projet.getBirthDay();
	}

	/**
	* Returns the create date of this projet.
	*
	* @return the create date of this projet
	*/
	@Override
	public Date getCreateDate() {
		return _projet.getCreateDate();
	}

	/**
	* Returns the modified date of this projet.
	*
	* @return the modified date of this projet
	*/
	@Override
	public Date getModifiedDate() {
		return _projet.getModifiedDate();
	}

	/**
	* Returns the company ID of this projet.
	*
	* @return the company ID of this projet
	*/
	@Override
	public long getCompanyId() {
		return _projet.getCompanyId();
	}

	/**
	* Returns the group ID of this projet.
	*
	* @return the group ID of this projet
	*/
	@Override
	public long getGroupId() {
		return _projet.getGroupId();
	}

	/**
	* Returns the primary key of this projet.
	*
	* @return the primary key of this projet
	*/
	@Override
	public long getPrimaryKey() {
		return _projet.getPrimaryKey();
	}

	/**
	* Returns the projet ID of this projet.
	*
	* @return the projet ID of this projet
	*/
	@Override
	public long getProjetId() {
		return _projet.getProjetId();
	}

	/**
	* Returns the user ID of this projet.
	*
	* @return the user ID of this projet
	*/
	@Override
	public long getUserId() {
		return _projet.getUserId();
	}

	@Override
	public void persist() {
		_projet.persist();
	}

	/**
	* Sets the age of this projet.
	*
	* @param age the age of this projet
	*/
	@Override
	public void setAge(int age) {
		_projet.setAge(age);
	}

	/**
	* Sets the birth day of this projet.
	*
	* @param birthDay the birth day of this projet
	*/
	@Override
	public void setBirthDay(Date birthDay) {
		_projet.setBirthDay(birthDay);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_projet.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this projet.
	*
	* @param companyId the company ID of this projet
	*/
	@Override
	public void setCompanyId(long companyId) {
		_projet.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this projet.
	*
	* @param createDate the create date of this projet
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_projet.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_projet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_projet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_projet.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the firstand last name of this projet.
	*
	* @param firstandLastName the firstand last name of this projet
	*/
	@Override
	public void setFirstandLastName(java.lang.String firstandLastName) {
		_projet.setFirstandLastName(firstandLastName);
	}

	/**
	* Sets the group ID of this projet.
	*
	* @param groupId the group ID of this projet
	*/
	@Override
	public void setGroupId(long groupId) {
		_projet.setGroupId(groupId);
	}

	/**
	* Sets whether this projet is is single.
	*
	* @param isSingle the is single of this projet
	*/
	@Override
	public void setIsSingle(boolean isSingle) {
		_projet.setIsSingle(isSingle);
	}

	/**
	* Sets the modified date of this projet.
	*
	* @param modifiedDate the modified date of this projet
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_projet.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_projet.setNew(n);
	}

	/**
	* Sets the primary key of this projet.
	*
	* @param primaryKey the primary key of this projet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_projet.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_projet.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the projet ID of this projet.
	*
	* @param projetId the projet ID of this projet
	*/
	@Override
	public void setProjetId(long projetId) {
		_projet.setProjetId(projetId);
	}

	/**
	* Sets the town of this projet.
	*
	* @param town the town of this projet
	*/
	@Override
	public void setTown(java.lang.String town) {
		_projet.setTown(town);
	}

	/**
	* Sets the user ID of this projet.
	*
	* @param userId the user ID of this projet
	*/
	@Override
	public void setUserId(long userId) {
		_projet.setUserId(userId);
	}

	/**
	* Sets the user name of this projet.
	*
	* @param userName the user name of this projet
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_projet.setUserName(userName);
	}

	/**
	* Sets the user uuid of this projet.
	*
	* @param userUuid the user uuid of this projet
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_projet.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this projet.
	*
	* @param uuid the uuid of this projet
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_projet.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProjetWrapper)) {
			return false;
		}

		ProjetWrapper projetWrapper = (ProjetWrapper)obj;

		if (Objects.equals(_projet, projetWrapper._projet)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _projet.getStagedModelType();
	}

	@Override
	public Projet getWrappedModel() {
		return _projet;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _projet.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _projet.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_projet.resetOriginalValues();
	}

	private final Projet _projet;
}