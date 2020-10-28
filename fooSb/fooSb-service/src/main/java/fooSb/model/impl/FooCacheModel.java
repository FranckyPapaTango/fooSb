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

package fooSb.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import fooSb.model.Foo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
@ProviderType
public class FooCacheModel implements CacheModel<Foo>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FooCacheModel)) {
			return false;
		}

		FooCacheModel fooCacheModel = (FooCacheModel)obj;

		if (fooId == fooCacheModel.fooId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fooId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fooId=");
		sb.append(fooId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", town=");
		sb.append(town);
		sb.append(", isSingle=");
		sb.append(isSingle);
		sb.append(", age=");
		sb.append(age);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", firstandLastName=");
		sb.append(firstandLastName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Foo toEntityModel() {
		FooImpl fooImpl = new FooImpl();

		if (uuid == null) {
			fooImpl.setUuid(StringPool.BLANK);
		}
		else {
			fooImpl.setUuid(uuid);
		}

		fooImpl.setFooId(fooId);
		fooImpl.setGroupId(groupId);
		fooImpl.setCompanyId(companyId);
		fooImpl.setUserId(userId);

		if (userName == null) {
			fooImpl.setUserName(StringPool.BLANK);
		}
		else {
			fooImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fooImpl.setCreateDate(null);
		}
		else {
			fooImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fooImpl.setModifiedDate(null);
		}
		else {
			fooImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (town == null) {
			fooImpl.setTown(StringPool.BLANK);
		}
		else {
			fooImpl.setTown(town);
		}

		fooImpl.setIsSingle(isSingle);
		fooImpl.setAge(age);

		if (birthDay == Long.MIN_VALUE) {
			fooImpl.setBirthDay(null);
		}
		else {
			fooImpl.setBirthDay(new Date(birthDay));
		}

		if (firstandLastName == null) {
			fooImpl.setFirstandLastName(StringPool.BLANK);
		}
		else {
			fooImpl.setFirstandLastName(firstandLastName);
		}

		fooImpl.resetOriginalValues();

		return fooImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fooId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		town = objectInput.readUTF();

		isSingle = objectInput.readBoolean();

		age = objectInput.readInt();
		birthDay = objectInput.readLong();
		firstandLastName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fooId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (town == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(town);
		}

		objectOutput.writeBoolean(isSingle);

		objectOutput.writeInt(age);
		objectOutput.writeLong(birthDay);

		if (firstandLastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstandLastName);
		}
	}

	public String uuid;
	public long fooId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String town;
	public boolean isSingle;
	public int age;
	public long birthDay;
	public String firstandLastName;
}