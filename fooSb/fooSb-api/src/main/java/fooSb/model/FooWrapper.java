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
 * This class is a wrapper for {@link Foo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
@ProviderType
public class FooWrapper implements Foo, ModelWrapper<Foo> {
	public FooWrapper(Foo foo) {
		_foo = foo;
	}

	@Override
	public Class<?> getModelClass() {
		return Foo.class;
	}

	@Override
	public String getModelClassName() {
		return Foo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fooId", getFooId());
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

		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
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
	* Returns the is single of this foo.
	*
	* @return the is single of this foo
	*/
	@Override
	public boolean getIsSingle() {
		return _foo.getIsSingle();
	}

	@Override
	public boolean isCachedModel() {
		return _foo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _foo.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this foo is is single.
	*
	* @return <code>true</code> if this foo is is single; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsSingle() {
		return _foo.isIsSingle();
	}

	@Override
	public boolean isNew() {
		return _foo.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _foo.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<fooSb.model.Foo> toCacheModel() {
		return _foo.toCacheModel();
	}

	@Override
	public fooSb.model.Foo toEscapedModel() {
		return new FooWrapper(_foo.toEscapedModel());
	}

	@Override
	public fooSb.model.Foo toUnescapedModel() {
		return new FooWrapper(_foo.toUnescapedModel());
	}

	@Override
	public int compareTo(fooSb.model.Foo foo) {
		return _foo.compareTo(foo);
	}

	/**
	* Returns the age of this foo.
	*
	* @return the age of this foo
	*/
	@Override
	public int getAge() {
		return _foo.getAge();
	}

	@Override
	public int hashCode() {
		return _foo.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _foo.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FooWrapper((Foo)_foo.clone());
	}

	/**
	* Returns the firstand last name of this foo.
	*
	* @return the firstand last name of this foo
	*/
	@Override
	public java.lang.String getFirstandLastName() {
		return _foo.getFirstandLastName();
	}

	/**
	* Returns the town of this foo.
	*
	* @return the town of this foo
	*/
	@Override
	public java.lang.String getTown() {
		return _foo.getTown();
	}

	/**
	* Returns the user name of this foo.
	*
	* @return the user name of this foo
	*/
	@Override
	public java.lang.String getUserName() {
		return _foo.getUserName();
	}

	/**
	* Returns the user uuid of this foo.
	*
	* @return the user uuid of this foo
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _foo.getUserUuid();
	}

	/**
	* Returns the uuid of this foo.
	*
	* @return the uuid of this foo
	*/
	@Override
	public java.lang.String getUuid() {
		return _foo.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _foo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _foo.toXmlString();
	}

	/**
	* Returns the birth day of this foo.
	*
	* @return the birth day of this foo
	*/
	@Override
	public Date getBirthDay() {
		return _foo.getBirthDay();
	}

	/**
	* Returns the create date of this foo.
	*
	* @return the create date of this foo
	*/
	@Override
	public Date getCreateDate() {
		return _foo.getCreateDate();
	}

	/**
	* Returns the modified date of this foo.
	*
	* @return the modified date of this foo
	*/
	@Override
	public Date getModifiedDate() {
		return _foo.getModifiedDate();
	}

	/**
	* Returns the company ID of this foo.
	*
	* @return the company ID of this foo
	*/
	@Override
	public long getCompanyId() {
		return _foo.getCompanyId();
	}

	/**
	* Returns the foo ID of this foo.
	*
	* @return the foo ID of this foo
	*/
	@Override
	public long getFooId() {
		return _foo.getFooId();
	}

	/**
	* Returns the group ID of this foo.
	*
	* @return the group ID of this foo
	*/
	@Override
	public long getGroupId() {
		return _foo.getGroupId();
	}

	/**
	* Returns the primary key of this foo.
	*
	* @return the primary key of this foo
	*/
	@Override
	public long getPrimaryKey() {
		return _foo.getPrimaryKey();
	}

	/**
	* Returns the user ID of this foo.
	*
	* @return the user ID of this foo
	*/
	@Override
	public long getUserId() {
		return _foo.getUserId();
	}

	@Override
	public void persist() {
		_foo.persist();
	}

	/**
	* Sets the age of this foo.
	*
	* @param age the age of this foo
	*/
	@Override
	public void setAge(int age) {
		_foo.setAge(age);
	}

	/**
	* Sets the birth day of this foo.
	*
	* @param birthDay the birth day of this foo
	*/
	@Override
	public void setBirthDay(Date birthDay) {
		_foo.setBirthDay(birthDay);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_foo.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this foo.
	*
	* @param companyId the company ID of this foo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_foo.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this foo.
	*
	* @param createDate the create date of this foo
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_foo.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_foo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_foo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_foo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the firstand last name of this foo.
	*
	* @param firstandLastName the firstand last name of this foo
	*/
	@Override
	public void setFirstandLastName(java.lang.String firstandLastName) {
		_foo.setFirstandLastName(firstandLastName);
	}

	/**
	* Sets the foo ID of this foo.
	*
	* @param fooId the foo ID of this foo
	*/
	@Override
	public void setFooId(long fooId) {
		_foo.setFooId(fooId);
	}

	/**
	* Sets the group ID of this foo.
	*
	* @param groupId the group ID of this foo
	*/
	@Override
	public void setGroupId(long groupId) {
		_foo.setGroupId(groupId);
	}

	/**
	* Sets whether this foo is is single.
	*
	* @param isSingle the is single of this foo
	*/
	@Override
	public void setIsSingle(boolean isSingle) {
		_foo.setIsSingle(isSingle);
	}

	/**
	* Sets the modified date of this foo.
	*
	* @param modifiedDate the modified date of this foo
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_foo.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_foo.setNew(n);
	}

	/**
	* Sets the primary key of this foo.
	*
	* @param primaryKey the primary key of this foo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_foo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_foo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the town of this foo.
	*
	* @param town the town of this foo
	*/
	@Override
	public void setTown(java.lang.String town) {
		_foo.setTown(town);
	}

	/**
	* Sets the user ID of this foo.
	*
	* @param userId the user ID of this foo
	*/
	@Override
	public void setUserId(long userId) {
		_foo.setUserId(userId);
	}

	/**
	* Sets the user name of this foo.
	*
	* @param userName the user name of this foo
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_foo.setUserName(userName);
	}

	/**
	* Sets the user uuid of this foo.
	*
	* @param userUuid the user uuid of this foo
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_foo.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this foo.
	*
	* @param uuid the uuid of this foo
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_foo.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FooWrapper)) {
			return false;
		}

		FooWrapper fooWrapper = (FooWrapper)obj;

		if (Objects.equals(_foo, fooWrapper._foo)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _foo.getStagedModelType();
	}

	@Override
	public Foo getWrappedModel() {
		return _foo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _foo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _foo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_foo.resetOriginalValues();
	}

	private final Foo _foo;
}