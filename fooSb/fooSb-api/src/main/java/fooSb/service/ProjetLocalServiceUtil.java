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

package fooSb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Projet. This utility wraps
 * {@link fooSb.service.impl.ProjetLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProjetLocalService
 * @see fooSb.service.base.ProjetLocalServiceBaseImpl
 * @see fooSb.service.impl.ProjetLocalServiceImpl
 * @generated
 */
@ProviderType
public class ProjetLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link fooSb.service.impl.ProjetLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the projet to the database. Also notifies the appropriate model listeners.
	*
	* @param projet the projet
	* @return the projet that was added
	*/
	public static fooSb.model.Projet addProjet(fooSb.model.Projet projet) {
		return getService().addProjet(projet);
	}

	/**
	* Creates a new projet with the primary key. Does not add the projet to the database.
	*
	* @param projetId the primary key for the new projet
	* @return the new projet
	*/
	public static fooSb.model.Projet createProjet(long projetId) {
		return getService().createProjet(projetId);
	}

	/**
	* Deletes the projet from the database. Also notifies the appropriate model listeners.
	*
	* @param projet the projet
	* @return the projet that was removed
	*/
	public static fooSb.model.Projet deleteProjet(fooSb.model.Projet projet) {
		return getService().deleteProjet(projet);
	}

	/**
	* Deletes the projet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param projetId the primary key of the projet
	* @return the projet that was removed
	* @throws PortalException if a projet with the primary key could not be found
	*/
	public static fooSb.model.Projet deleteProjet(long projetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteProjet(projetId);
	}

	public static fooSb.model.Projet fetchProjet(long projetId) {
		return getService().fetchProjet(projetId);
	}

	/**
	* Returns the projet matching the UUID and group.
	*
	* @param uuid the projet's UUID
	* @param groupId the primary key of the group
	* @return the matching projet, or <code>null</code> if a matching projet could not be found
	*/
	public static fooSb.model.Projet fetchProjetByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchProjetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the projet with the primary key.
	*
	* @param projetId the primary key of the projet
	* @return the projet
	* @throws PortalException if a projet with the primary key could not be found
	*/
	public static fooSb.model.Projet getProjet(long projetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProjet(projetId);
	}

	/**
	* Returns the projet matching the UUID and group.
	*
	* @param uuid the projet's UUID
	* @param groupId the primary key of the group
	* @return the matching projet
	* @throws PortalException if a matching projet could not be found
	*/
	public static fooSb.model.Projet getProjetByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProjetByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the projet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param projet the projet
	* @return the projet that was updated
	*/
	public static fooSb.model.Projet updateProjet(fooSb.model.Projet projet) {
		return getService().updateProjet(projet);
	}

	/**
	* Returns the number of projets.
	*
	* @return the number of projets
	*/
	public static int getProjetsCount() {
		return getService().getProjetsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fooSb.model.impl.ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fooSb.model.impl.ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the projets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fooSb.model.impl.ProjetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @return the range of projets
	*/
	public static java.util.List<fooSb.model.Projet> getProjets(int start,
		int end) {
		return getService().getProjets(start, end);
	}

	/**
	* Returns all the projets matching the UUID and company.
	*
	* @param uuid the UUID of the projets
	* @param companyId the primary key of the company
	* @return the matching projets, or an empty list if no matches were found
	*/
	public static java.util.List<fooSb.model.Projet> getProjetsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getProjetsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of projets matching the UUID and company.
	*
	* @param uuid the UUID of the projets
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of projets
	* @param end the upper bound of the range of projets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching projets, or an empty list if no matches were found
	*/
	public static java.util.List<fooSb.model.Projet> getProjetsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<fooSb.model.Projet> orderByComparator) {
		return getService()
				   .getProjetsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ProjetLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProjetLocalService, ProjetLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ProjetLocalService.class);
}