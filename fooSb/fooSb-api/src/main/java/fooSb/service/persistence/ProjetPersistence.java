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

import fooSb.exception.NoSuchProjetException;

import fooSb.model.Projet;

/**
 * The persistence interface for the projet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see fooSb.service.persistence.impl.ProjetPersistenceImpl
 * @see ProjetUtil
 * @generated
 */
@ProviderType
public interface ProjetPersistence extends BasePersistence<Projet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProjetUtil} to access the projet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the projets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching projets
	*/
	public java.util.List<Projet> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the projets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of matching projets
	*/
	public java.util.List<Projet> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the projets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns an ordered range of all the projets where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the first projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the last projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the last projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the projets before and after the current projet in the ordered set where uuid = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet[] findByUuid_PrevAndNext(long projetId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Removes all the projets where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of projets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching projets
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the projet where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchProjetException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchProjetException;

	/**
	* Returns the projet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the projet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the projet where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the projet that was removed
	*/
	public Projet removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchProjetException;

	/**
	* Returns the number of projets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching projets
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the projets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching projets
	*/
	public java.util.List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the projets where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of matching projets
	*/
	public java.util.List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the projets where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns an ordered range of all the projets where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the first projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the last projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the last projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the projets before and after the current projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet[] findByUuid_C_PrevAndNext(long projetId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Removes all the projets where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of projets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching projets
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the projets where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @return the matching projets
	*/
	public java.util.List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName);

	/**
	* Returns a range of all the projets where firstandLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstandLastName the firstand last name
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of matching projets
	*/
	public java.util.List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end);

	/**
	* Returns an ordered range of all the projets where firstandLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstandLastName the firstand last name
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns an ordered range of all the projets where firstandLastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param firstandLastName the firstand last name
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByfirstandLastName_First(
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the first projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByfirstandLastName_First(
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the last projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByfirstandLastName_Last(
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the last projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByfirstandLastName_Last(
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the projets before and after the current projet in the ordered set where firstandLastName = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet[] findByfirstandLastName_PrevAndNext(long projetId,
		java.lang.String firstandLastName,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Removes all the projets where firstandLastName = &#63; from the database.
	*
	* @param firstandLastName the firstand last name
	*/
	public void removeByfirstandLastName(java.lang.String firstandLastName);

	/**
	* Returns the number of projets where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @return the number of matching projets
	*/
	public int countByfirstandLastName(java.lang.String firstandLastName);

	/**
	* Returns all the projets where town = &#63;.
	*
	* @param town the town
	* @return the matching projets
	*/
	public java.util.List<Projet> findBytown(java.lang.String town);

	/**
	* Returns a range of all the projets where town = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param town the town
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of matching projets
	*/
	public java.util.List<Projet> findBytown(java.lang.String town, int start,
		int end);

	/**
	* Returns an ordered range of all the projets where town = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param town the town
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findBytown(java.lang.String town, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns an ordered range of all the projets where town = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param town the town
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findBytown(java.lang.String town, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findBytown_First(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the first projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchBytown_First(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the last projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findBytown_Last(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the last projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchBytown_Last(java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the projets before and after the current projet in the ordered set where town = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet[] findBytown_PrevAndNext(long projetId,
		java.lang.String town,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Removes all the projets where town = &#63; from the database.
	*
	* @param town the town
	*/
	public void removeBytown(java.lang.String town);

	/**
	* Returns the number of projets where town = &#63;.
	*
	* @param town the town
	* @return the number of matching projets
	*/
	public int countBytown(java.lang.String town);

	/**
	* Returns all the projets where age = &#63;.
	*
	* @param age the age
	* @return the matching projets
	*/
	public java.util.List<Projet> findByage(int age);

	/**
	* Returns a range of all the projets where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of matching projets
	*/
	public java.util.List<Projet> findByage(int age, int start, int end);

	/**
	* Returns an ordered range of all the projets where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByage(int age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns an ordered range of all the projets where age = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param age the age
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching projets
	*/
	public java.util.List<Projet> findByage(int age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByage_First(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the first projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByage_First(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the last projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public Projet findByage_Last(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Returns the last projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public Projet fetchByage_Last(int age,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns the projets before and after the current projet in the ordered set where age = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet[] findByage_PrevAndNext(long projetId, int age,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException;

	/**
	* Removes all the projets where age = &#63; from the database.
	*
	* @param age the age
	*/
	public void removeByage(int age);

	/**
	* Returns the number of projets where age = &#63;.
	*
	* @param age the age
	* @return the number of matching projets
	*/
	public int countByage(int age);

	/**
	* Caches the projet in the entity cache if it is enabled.
	*
	* @param projet the projet
	*/
	public void cacheResult(Projet projet);

	/**
	* Caches the projets in the entity cache if it is enabled.
	*
	* @param projets the projets
	*/
	public void cacheResult(java.util.List<Projet> projets);

	/**
	* Creates a new projet with the primary key. Does not add the projet to the database.
	*
	* @param projetId the primary key for the new projet
	* @return the new projet
	*/
	public Projet create(long projetId);

	/**
	* Removes the projet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projetId the primary key of the projet
	* @return the projet that was removed
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet remove(long projetId) throws NoSuchProjetException;

	public Projet updateImpl(Projet projet);

	/**
	* Returns the projet with the primary key or throws a {@link NoSuchProjetException} if it could not be found.
	*
	* @param projetId the primary key of the projet
	* @return the projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public Projet findByPrimaryKey(long projetId) throws NoSuchProjetException;

	/**
	* Returns the projet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projetId the primary key of the projet
	* @return the projet, or <code>null</code> if a projet with the primary key could not be found
	*/
	public Projet fetchByPrimaryKey(long projetId);

	@Override
	public java.util.Map<java.io.Serializable, Projet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the projets.
	*
	* @return the projets
	*/
	public java.util.List<Projet> findAll();

	/**
	* Returns a range of all the projets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of projets
	*/
	public java.util.List<Projet> findAll(int start, int end);

	/**
	* Returns an ordered range of all the projets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of projets
	*/
	public java.util.List<Projet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator);

	/**
	* Returns an ordered range of all the projets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of projets
	*/
	public java.util.List<Projet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the projets from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of projets.
	*
	* @return the number of projets
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}