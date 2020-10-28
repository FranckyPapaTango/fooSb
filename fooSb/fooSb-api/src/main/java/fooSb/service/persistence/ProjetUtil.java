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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import fooSb.model.Projet;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the projet service. This utility wraps {@link fooSb.service.persistence.impl.ProjetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjetPersistence
 * @see fooSb.service.persistence.impl.ProjetPersistenceImpl
 * @generated
 */
@ProviderType
public class ProjetUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Projet projet) {
		getPersistence().clearCache(projet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Projet> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Projet> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Projet> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Projet update(Projet projet) {
		return getPersistence().update(projet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Projet update(Projet projet, ServiceContext serviceContext) {
		return getPersistence().update(projet, serviceContext);
	}

	/**
	* Returns all the projets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching projets
	*/
	public static List<Projet> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Projet> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Projet> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Projet> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Projet> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByUuid_First(java.lang.String uuid,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the projets before and after the current projet in the ordered set where uuid = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public static Projet[] findByUuid_PrevAndNext(long projetId,
		java.lang.String uuid, OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByUuid_PrevAndNext(projetId, uuid, orderByComparator);
	}

	/**
	* Removes all the projets where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of projets where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching projets
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the projet where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchProjetException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByUUID_G(java.lang.String uuid, long groupId)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the projet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the projet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the projet where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the projet that was removed
	*/
	public static Projet removeByUUID_G(java.lang.String uuid, long groupId)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of projets where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching projets
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the projets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching projets
	*/
	public static List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Projet> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Projet[] findByUuid_C_PrevAndNext(long projetId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(projetId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the projets where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of projets where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching projets
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the projets where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @return the matching projets
	*/
	public static List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName) {
		return getPersistence().findByfirstandLastName(firstandLastName);
	}

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
	public static List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end) {
		return getPersistence()
				   .findByfirstandLastName(firstandLastName, start, end);
	}

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
	public static List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .findByfirstandLastName(firstandLastName, start, end,
			orderByComparator);
	}

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
	public static List<Projet> findByfirstandLastName(
		java.lang.String firstandLastName, int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByfirstandLastName(firstandLastName, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByfirstandLastName_First(
		java.lang.String firstandLastName,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByfirstandLastName_First(firstandLastName,
			orderByComparator);
	}

	/**
	* Returns the first projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByfirstandLastName_First(
		java.lang.String firstandLastName,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .fetchByfirstandLastName_First(firstandLastName,
			orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByfirstandLastName_Last(
		java.lang.String firstandLastName,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByfirstandLastName_Last(firstandLastName,
			orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByfirstandLastName_Last(
		java.lang.String firstandLastName,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence()
				   .fetchByfirstandLastName_Last(firstandLastName,
			orderByComparator);
	}

	/**
	* Returns the projets before and after the current projet in the ordered set where firstandLastName = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param firstandLastName the firstand last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public static Projet[] findByfirstandLastName_PrevAndNext(long projetId,
		java.lang.String firstandLastName,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByfirstandLastName_PrevAndNext(projetId,
			firstandLastName, orderByComparator);
	}

	/**
	* Removes all the projets where firstandLastName = &#63; from the database.
	*
	* @param firstandLastName the firstand last name
	*/
	public static void removeByfirstandLastName(
		java.lang.String firstandLastName) {
		getPersistence().removeByfirstandLastName(firstandLastName);
	}

	/**
	* Returns the number of projets where firstandLastName = &#63;.
	*
	* @param firstandLastName the firstand last name
	* @return the number of matching projets
	*/
	public static int countByfirstandLastName(java.lang.String firstandLastName) {
		return getPersistence().countByfirstandLastName(firstandLastName);
	}

	/**
	* Returns all the projets where town = &#63;.
	*
	* @param town the town
	* @return the matching projets
	*/
	public static List<Projet> findBytown(java.lang.String town) {
		return getPersistence().findBytown(town);
	}

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
	public static List<Projet> findBytown(java.lang.String town, int start,
		int end) {
		return getPersistence().findBytown(town, start, end);
	}

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
	public static List<Projet> findBytown(java.lang.String town, int start,
		int end, OrderByComparator<Projet> orderByComparator) {
		return getPersistence().findBytown(town, start, end, orderByComparator);
	}

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
	public static List<Projet> findBytown(java.lang.String town, int start,
		int end, OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBytown(town, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findBytown_First(java.lang.String town,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findBytown_First(town, orderByComparator);
	}

	/**
	* Returns the first projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchBytown_First(java.lang.String town,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().fetchBytown_First(town, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findBytown_Last(java.lang.String town,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findBytown_Last(town, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where town = &#63;.
	*
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchBytown_Last(java.lang.String town,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().fetchBytown_Last(town, orderByComparator);
	}

	/**
	* Returns the projets before and after the current projet in the ordered set where town = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param town the town
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public static Projet[] findBytown_PrevAndNext(long projetId,
		java.lang.String town, OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findBytown_PrevAndNext(projetId, town, orderByComparator);
	}

	/**
	* Removes all the projets where town = &#63; from the database.
	*
	* @param town the town
	*/
	public static void removeBytown(java.lang.String town) {
		getPersistence().removeBytown(town);
	}

	/**
	* Returns the number of projets where town = &#63;.
	*
	* @param town the town
	* @return the number of matching projets
	*/
	public static int countBytown(java.lang.String town) {
		return getPersistence().countBytown(town);
	}

	/**
	* Returns all the projets where age = &#63;.
	*
	* @param age the age
	* @return the matching projets
	*/
	public static List<Projet> findByage(int age) {
		return getPersistence().findByage(age);
	}

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
	public static List<Projet> findByage(int age, int start, int end) {
		return getPersistence().findByage(age, start, end);
	}

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
	public static List<Projet> findByage(int age, int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().findByage(age, start, end, orderByComparator);
	}

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
	public static List<Projet> findByage(int age, int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByage(age, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByage_First(int age,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findByage_First(age, orderByComparator);
	}

	/**
	* Returns the first projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByage_First(int age,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().fetchByage_First(age, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet
	* @throws NoSuchProjetException if a matching projet could not be found
	*/
	public static Projet findByage_Last(int age,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findByage_Last(age, orderByComparator);
	}

	/**
	* Returns the last projet in the ordered set where age = &#63;.
	*
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static Projet fetchByage_Last(int age,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().fetchByage_Last(age, orderByComparator);
	}

	/**
	* Returns the projets before and after the current projet in the ordered set where age = &#63;.
	*
	* @param projetId the primary key of the current projet
	* @param age the age
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public static Projet[] findByage_PrevAndNext(long projetId, int age,
		OrderByComparator<Projet> orderByComparator)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence()
				   .findByage_PrevAndNext(projetId, age, orderByComparator);
	}

	/**
	* Removes all the projets where age = &#63; from the database.
	*
	* @param age the age
	*/
	public static void removeByage(int age) {
		getPersistence().removeByage(age);
	}

	/**
	* Returns the number of projets where age = &#63;.
	*
	* @param age the age
	* @return the number of matching projets
	*/
	public static int countByage(int age) {
		return getPersistence().countByage(age);
	}

	/**
	* Caches the projet in the entity cache if it is enabled.
	*
	* @param projet the projet
	*/
	public static void cacheResult(Projet projet) {
		getPersistence().cacheResult(projet);
	}

	/**
	* Caches the projets in the entity cache if it is enabled.
	*
	* @param projets the projets
	*/
	public static void cacheResult(List<Projet> projets) {
		getPersistence().cacheResult(projets);
	}

	/**
	* Creates a new projet with the primary key. Does not add the projet to the database.
	*
	* @param projetId the primary key for the new projet
	* @return the new projet
	*/
	public static Projet create(long projetId) {
		return getPersistence().create(projetId);
	}

	/**
	* Removes the projet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projetId the primary key of the projet
	* @return the projet that was removed
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public static Projet remove(long projetId)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().remove(projetId);
	}

	public static Projet updateImpl(Projet projet) {
		return getPersistence().updateImpl(projet);
	}

	/**
	* Returns the projet with the primary key or throws a {@link NoSuchProjetException} if it could not be found.
	*
	* @param projetId the primary key of the projet
	* @return the projet
	* @throws NoSuchProjetException if a projet with the primary key could not be found
	*/
	public static Projet findByPrimaryKey(long projetId)
		throws fooSb.exception.NoSuchProjetException {
		return getPersistence().findByPrimaryKey(projetId);
	}

	/**
	* Returns the projet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param projetId the primary key of the projet
	* @return the projet, or <code>null</code> if a projet with the primary key could not be found
	*/
	public static Projet fetchByPrimaryKey(long projetId) {
		return getPersistence().fetchByPrimaryKey(projetId);
	}

	public static java.util.Map<java.io.Serializable, Projet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the projets.
	*
	* @return the projets
	*/
	public static List<Projet> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Projet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Projet> findAll(int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Projet> findAll(int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the projets from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of projets.
	*
	* @return the number of projets
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ProjetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjetPersistence, ProjetPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ProjetPersistence.class);
}