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

import fooSb.model.Projet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Projet in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Projet
 * @generated
 */
@ProviderType
public class ProjetCacheModel implements CacheModel<Projet>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProjetCacheModel)) {
			return false;
		}

		ProjetCacheModel projetCacheModel = (ProjetCacheModel)obj;

		if (projetId == projetCacheModel.projetId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, projetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", projetId=");
		sb.append(projetId);
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
	public Projet toEntityModel() {
		ProjetImpl projetImpl = new ProjetImpl();

		if (uuid == null) {
			projetImpl.setUuid(StringPool.BLANK);
		}
		else {
			projetImpl.setUuid(uuid);
		}

		projetImpl.setProjetId(projetId);
		projetImpl.setGroupId(groupId);
		projetImpl.setCompanyId(companyId);
		projetImpl.setUserId(userId);

		if (userName == null) {
			projetImpl.setUserName(StringPool.BLANK);
		}
		else {
			projetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			projetImpl.setCreateDate(null);
		}
		else {
			projetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			projetImpl.setModifiedDate(null);
		}
		else {
			projetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (town == null) {
			projetImpl.setTown(StringPool.BLANK);
		}
		else {
			projetImpl.setTown(town);
		}

		projetImpl.setIsSingle(isSingle);
		projetImpl.setAge(age);

		if (birthDay == Long.MIN_VALUE) {
			projetImpl.setBirthDay(null);
		}
		else {
			projetImpl.setBirthDay(new Date(birthDay));
		}

		if (firstandLastName == null) {
			projetImpl.setFirstandLastName(StringPool.BLANK);
		}
		else {
			projetImpl.setFirstandLastName(firstandLastName);
		}

		projetImpl.resetOriginalValues();

		return projetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		projetId = objectInput.readLong();

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

		objectOutput.writeLong(projetId);

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
	public long projetId;
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