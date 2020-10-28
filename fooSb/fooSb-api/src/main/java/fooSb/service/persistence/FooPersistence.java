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

package fooSb.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import fooSb.exception.NoSuchFooException;

import fooSb.model.Foo;

/**
 * The persistence interface for the foo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see fooSb.service.persistence.impl.FooPersistenceImpl
 * @see FooUtil
 * @generated
 */
@ProviderType
public interface FooPersistence extends BasePersistence<Foo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FooUtil} to access the foo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the foos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching foos
	*/
	public java.util.List<Foo> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the foos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public java.util.List<Foo> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the foos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns an ordered range of all the foos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where uuid = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByUuid_PrevAndNext(long fooId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of foos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching foos
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFooException;

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the foo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the foo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the foo that was removed
	*/
	public Foo removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFooException;

	/**
	* Returns the number of foos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching foos
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the foos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching foos
	*/
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the foos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the foos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns an ordered range of all the foos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByUuid_C_PrevAndNext(long fooId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of foos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching foos
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the foos where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @return the matching foos
	*/
	public java.util.List<Foo> findByfirstandLastName(
		java.lang.String firstandLastName);

	/**
	* Returns a range of all the foos where firstandLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstandLastName the firstand last name
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public java.util.List<Foo> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end);

	/**
	* Returns an ordered range of all the foos where firstandLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstandLastName the firstand last name
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns an ordered range of all the foos where firstandLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstandLastName the firstand last name
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByfirstandLastName_First(java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByfirstandLastName_First(
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByfirstandLastName_Last(java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByfirstandLastName_Last(java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where firstandLastName = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByfirstandLastName_PrevAndNext(long fooId,
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where firstandLastName = &#63; from the database.
	*
	* @param firstandLastName the firstand last name
	*/
	public void removeByfirstandLastName(java.lang.String firstandLastName);

	/**
	* Returns the number of foos where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @return the number of matching foos
	*/
	public int countByfirstandLastName(java.lang.String firstandLastName);

	/**
	* Returns all the foos where town = &#63;.
	*
	* @param town the town
	* @return the matching foos
	*/
	public java.util.List<Foo> findBytown(java.lang.String town);

	/**
	* Returns a range of all the foos where town = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param town the town
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public java.util.List<Foo> findBytown(java.lang.String town, int start,
		int end);

	/**
	* Returns an ordered range of all the foos where town = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param town the town
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findBytown(java.lang.String town, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns an ordered range of all the foos where town = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param town the town
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findBytown(java.lang.String town, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findBytown_First(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchBytown_First(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findBytown_Last(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchBytown_Last(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where town = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findBytown_PrevAndNext(long fooId, java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where town = &#63; from the database.
	*
	* @param town the town
	*/
	public void removeBytown(java.lang.String town);

	/**
	* Returns the number of foos where town = &#63;.
	*
	* @param town the town
	* @return the number of matching foos
	*/
	public int countBytown(java.lang.String town);

	/**
	* Returns all the foos where age = &#63;.
	*
	* @param age the age
	* @return the matching foos
	*/
	public java.util.List<Foo> findByage(int age);

	/**
	* Returns a range of all the foos where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of matching foos
	*/
	public java.util.List<Foo> findByage(int age, int start, int end);

	/**
	* Returns an ordered range of all the foos where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByage(int age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns an ordered range of all the foos where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching foos
	*/
	public java.util.List<Foo> findByage(int age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first foo in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByage_First(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the first foo in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByage_First(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the last foo in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo
	* @throws NoSuchFooException if a matching foo could not be found
	*/
	public Foo findByage_Last(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Returns the last foo in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching foo, or <code>null</code> if a matching foo could not be found
	*/
	public Foo fetchByage_Last(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns the foos before and after the current foo in the ordered set where age = &#63;.
	*
	* @param fooId the primary key of the current foo
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo[] findByage_PrevAndNext(long fooId, int age,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator)
		throws NoSuchFooException;

	/**
	* Removes all the foos where age = &#63; from the database.
	*
	* @param age the age
	*/
	public void removeByage(int age);

	/**
	* Returns the number of foos where age = &#63;.
	*
	* @param age the age
	* @return the number of matching foos
	*/
	public int countByage(int age);

	/**
	* Caches the foo in the entity cache if it is enabled.
	*
	* @param foo the foo
	*/
	public void cacheResult(Foo foo);

	/**
	* Caches the foos in the entity cache if it is enabled.
	*
	* @param foos the foos
	*/
	public void cacheResult(java.util.List<Foo> foos);

	/**
	* Creates a new foo with the primary key. Does not add the foo to the database.
	*
	* @param fooId the primary key for the new foo
	* @return the new foo
	*/
	public Foo create(long fooId);

	/**
	* Removes the foo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fooId the primary key of the foo
	* @return the foo that was removed
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo remove(long fooId) throws NoSuchFooException;

	public Foo updateImpl(Foo foo);

	/**
	* Returns the foo with the primary key or throws a {@link NoSuchFooException} if it could not be found.
	*
	* @param fooId the primary key of the foo
	* @return the foo
	* @throws NoSuchFooException if a foo with the primary key could not be found
	*/
	public Foo findByPrimaryKey(long fooId) throws NoSuchFooException;

	/**
	* Returns the foo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fooId the primary key of the foo
	* @return the foo, or <code>null</code> if a foo with the primary key could not be found
	*/
	public Foo fetchByPrimaryKey(long fooId);

	@Override
	public java.util.Map<java.io.Serializable, Foo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the foos.
	*
	* @return the foos
	*/
	public java.util.List<Foo> findAll();

	/**
	* Returns a range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @return the range of foos
	*/
	public java.util.List<Foo> findAll(int start, int end);

	/**
	* Returns an ordered range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of foos
	*/
	public java.util.List<Foo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator);

	/**
	* Returns an ordered range of all the foos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FooModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of foos
	* @param end the upper bound of the range of foos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of foos
	*/
	public java.util.List<Foo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Foo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the foos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of foos.
	*
	* @return the number of foos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}