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

package fooSb.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import fooSb.exception.NoSuchProjetException;

import fooSb.model.Projet;

import fooSb.model.impl.ProjetImpl;
import fooSb.model.impl.ProjetModelImpl;

import fooSb.service.persistence.ProjetPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the projet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjetPersistence
 * @see fooSb.service.persistence.ProjetUtil
 * @generated
 */
@ProviderType
public class ProjetPersistenceImpl extends BasePersistenceImpl<Projet>
	implements ProjetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProjetUtil} to access the projet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProjetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ProjetModelImpl.UUID_COLUMN_BITMASK |
			ProjetModelImpl.FIRSTANDLASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the projets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching projets
	 */
	@Override
	public List<Projet> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Projet> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Projet> findByUuid(String uuid, int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Projet> findByUuid(String uuid, int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Projet> list = null;

		if (retrieveFromCache) {
			list = (List<Projet>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Projet projet : list) {
					if (!Objects.equals(uuid, projet.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROJET_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first projet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByUuid_First(String uuid,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByUuid_First(uuid, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the first projet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByUuid_First(String uuid,
		OrderByComparator<Projet> orderByComparator) {
		List<Projet> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last projet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByUuid_Last(String uuid,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByUuid_Last(uuid, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the last projet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByUuid_Last(String uuid,
		OrderByComparator<Projet> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Projet> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Projet[] findByUuid_PrevAndNext(long projetId, String uuid,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = findByPrimaryKey(projetId);

		Session session = null;

		try {
			session = openSession();

			Projet[] array = new ProjetImpl[3];

			array[0] = getByUuid_PrevAndNext(session, projet, uuid,
					orderByComparator, true);

			array[1] = projet;

			array[2] = getByUuid_PrevAndNext(session, projet, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Projet getByUuid_PrevAndNext(Session session, Projet projet,
		String uuid, OrderByComparator<Projet> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROJET_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(projet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Projet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Projet projet : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(projet);
		}
	}

	/**
	 * Returns the number of projets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching projets
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROJET_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "projet.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "projet.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(projet.uuid IS NULL OR projet.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			ProjetModelImpl.UUID_COLUMN_BITMASK |
			ProjetModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the projet where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchProjetException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByUUID_G(String uuid, long groupId)
		throws NoSuchProjetException {
		Projet projet = fetchByUUID_G(uuid, groupId);

		if (projet == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchProjetException(msg.toString());
		}

		return projet;
	}

	/**
	 * Returns the projet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the projet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Projet) {
			Projet projet = (Projet)result;

			if (!Objects.equals(uuid, projet.getUuid()) ||
					(groupId != projet.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PROJET_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Projet> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Projet projet = list.get(0);

					result = projet;

					cacheResult(projet);

					if ((projet.getUuid() == null) ||
							!projet.getUuid().equals(uuid) ||
							(projet.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, projet);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Projet)result;
		}
	}

	/**
	 * Removes the projet where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the projet that was removed
	 */
	@Override
	public Projet removeByUUID_G(String uuid, long groupId)
		throws NoSuchProjetException {
		Projet projet = findByUUID_G(uuid, groupId);

		return remove(projet);
	}

	/**
	 * Returns the number of projets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching projets
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROJET_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "projet.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "projet.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(projet.uuid IS NULL OR projet.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "projet.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			ProjetModelImpl.UUID_COLUMN_BITMASK |
			ProjetModelImpl.COMPANYID_COLUMN_BITMASK |
			ProjetModelImpl.FIRSTANDLASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the projets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching projets
	 */
	@Override
	public List<Projet> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Projet> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Projet> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Projet> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Projet> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Projet> list = null;

		if (retrieveFromCache) {
			list = (List<Projet>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Projet projet : list) {
					if (!Objects.equals(uuid, projet.getUuid()) ||
							(companyId != projet.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PROJET_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Projet findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the first projet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Projet> orderByComparator) {
		List<Projet> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Projet findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the last projet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Projet> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Projet> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Projet[] findByUuid_C_PrevAndNext(long projetId, String uuid,
		long companyId, OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = findByPrimaryKey(projetId);

		Session session = null;

		try {
			session = openSession();

			Projet[] array = new ProjetImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, projet, uuid,
					companyId, orderByComparator, true);

			array[1] = projet;

			array[2] = getByUuid_C_PrevAndNext(session, projet, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Projet getByUuid_C_PrevAndNext(Session session, Projet projet,
		String uuid, long companyId,
		OrderByComparator<Projet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PROJET_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(projet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Projet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Projet projet : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(projet);
		}
	}

	/**
	 * Returns the number of projets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching projets
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROJET_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "projet.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "projet.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(projet.uuid IS NULL OR projet.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "projet.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FIRSTANDLASTNAME =
		new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfirstandLastName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIRSTANDLASTNAME =
		new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByfirstandLastName", new String[] { String.class.getName() },
			ProjetModelImpl.FIRSTANDLASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FIRSTANDLASTNAME = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfirstandLastName", new String[] { String.class.getName() });

	/**
	 * Returns all the projets where firstandLastName = &#63;.
	 *
	 * @param firstandLastName the firstand last name
	 * @return the matching projets
	 */
	@Override
	public List<Projet> findByfirstandLastName(String firstandLastName) {
		return findByfirstandLastName(firstandLastName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Projet> findByfirstandLastName(String firstandLastName,
		int start, int end) {
		return findByfirstandLastName(firstandLastName, start, end, null);
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
	@Override
	public List<Projet> findByfirstandLastName(String firstandLastName,
		int start, int end, OrderByComparator<Projet> orderByComparator) {
		return findByfirstandLastName(firstandLastName, start, end,
			orderByComparator, true);
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
	@Override
	public List<Projet> findByfirstandLastName(String firstandLastName,
		int start, int end, OrderByComparator<Projet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIRSTANDLASTNAME;
			finderArgs = new Object[] { firstandLastName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FIRSTANDLASTNAME;
			finderArgs = new Object[] {
					firstandLastName,
					
					start, end, orderByComparator
				};
		}

		List<Projet> list = null;

		if (retrieveFromCache) {
			list = (List<Projet>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Projet projet : list) {
					if (!Objects.equals(firstandLastName,
								projet.getFirstandLastName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROJET_WHERE);

			boolean bindFirstandLastName = false;

			if (firstandLastName == null) {
				query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_1);
			}
			else if (firstandLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_3);
			}
			else {
				bindFirstandLastName = true;

				query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFirstandLastName) {
					qPos.add(firstandLastName);
				}

				if (!pagination) {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first projet in the ordered set where firstandLastName = &#63;.
	 *
	 * @param firstandLastName the firstand last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByfirstandLastName_First(String firstandLastName,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByfirstandLastName_First(firstandLastName,
				orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("firstandLastName=");
		msg.append(firstandLastName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the first projet in the ordered set where firstandLastName = &#63;.
	 *
	 * @param firstandLastName the firstand last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByfirstandLastName_First(String firstandLastName,
		OrderByComparator<Projet> orderByComparator) {
		List<Projet> list = findByfirstandLastName(firstandLastName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last projet in the ordered set where firstandLastName = &#63;.
	 *
	 * @param firstandLastName the firstand last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByfirstandLastName_Last(String firstandLastName,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByfirstandLastName_Last(firstandLastName,
				orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("firstandLastName=");
		msg.append(firstandLastName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the last projet in the ordered set where firstandLastName = &#63;.
	 *
	 * @param firstandLastName the firstand last name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByfirstandLastName_Last(String firstandLastName,
		OrderByComparator<Projet> orderByComparator) {
		int count = countByfirstandLastName(firstandLastName);

		if (count == 0) {
			return null;
		}

		List<Projet> list = findByfirstandLastName(firstandLastName, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Projet[] findByfirstandLastName_PrevAndNext(long projetId,
		String firstandLastName, OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = findByPrimaryKey(projetId);

		Session session = null;

		try {
			session = openSession();

			Projet[] array = new ProjetImpl[3];

			array[0] = getByfirstandLastName_PrevAndNext(session, projet,
					firstandLastName, orderByComparator, true);

			array[1] = projet;

			array[2] = getByfirstandLastName_PrevAndNext(session, projet,
					firstandLastName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Projet getByfirstandLastName_PrevAndNext(Session session,
		Projet projet, String firstandLastName,
		OrderByComparator<Projet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROJET_WHERE);

		boolean bindFirstandLastName = false;

		if (firstandLastName == null) {
			query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_1);
		}
		else if (firstandLastName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_3);
		}
		else {
			bindFirstandLastName = true;

			query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFirstandLastName) {
			qPos.add(firstandLastName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(projet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Projet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projets where firstandLastName = &#63; from the database.
	 *
	 * @param firstandLastName the firstand last name
	 */
	@Override
	public void removeByfirstandLastName(String firstandLastName) {
		for (Projet projet : findByfirstandLastName(firstandLastName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(projet);
		}
	}

	/**
	 * Returns the number of projets where firstandLastName = &#63;.
	 *
	 * @param firstandLastName the firstand last name
	 * @return the number of matching projets
	 */
	@Override
	public int countByfirstandLastName(String firstandLastName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FIRSTANDLASTNAME;

		Object[] finderArgs = new Object[] { firstandLastName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROJET_WHERE);

			boolean bindFirstandLastName = false;

			if (firstandLastName == null) {
				query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_1);
			}
			else if (firstandLastName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_3);
			}
			else {
				bindFirstandLastName = true;

				query.append(_FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFirstandLastName) {
					qPos.add(firstandLastName);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_1 =
		"projet.firstandLastName IS NULL";
	private static final String _FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_2 =
		"projet.firstandLastName = ?";
	private static final String _FINDER_COLUMN_FIRSTANDLASTNAME_FIRSTANDLASTNAME_3 =
		"(projet.firstandLastName IS NULL OR projet.firstandLastName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOWN = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytown",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOWN = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytown",
			new String[] { String.class.getName() },
			ProjetModelImpl.TOWN_COLUMN_BITMASK |
			ProjetModelImpl.FIRSTANDLASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOWN = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytown",
			new String[] { String.class.getName() });

	/**
	 * Returns all the projets where town = &#63;.
	 *
	 * @param town the town
	 * @return the matching projets
	 */
	@Override
	public List<Projet> findBytown(String town) {
		return findBytown(town, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Projet> findBytown(String town, int start, int end) {
		return findBytown(town, start, end, null);
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
	@Override
	public List<Projet> findBytown(String town, int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return findBytown(town, start, end, orderByComparator, true);
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
	@Override
	public List<Projet> findBytown(String town, int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOWN;
			finderArgs = new Object[] { town };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOWN;
			finderArgs = new Object[] { town, start, end, orderByComparator };
		}

		List<Projet> list = null;

		if (retrieveFromCache) {
			list = (List<Projet>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Projet projet : list) {
					if (!Objects.equals(town, projet.getTown())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROJET_WHERE);

			boolean bindTown = false;

			if (town == null) {
				query.append(_FINDER_COLUMN_TOWN_TOWN_1);
			}
			else if (town.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOWN_TOWN_3);
			}
			else {
				bindTown = true;

				query.append(_FINDER_COLUMN_TOWN_TOWN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTown) {
					qPos.add(town);
				}

				if (!pagination) {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first projet in the ordered set where town = &#63;.
	 *
	 * @param town the town
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findBytown_First(String town,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchBytown_First(town, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("town=");
		msg.append(town);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the first projet in the ordered set where town = &#63;.
	 *
	 * @param town the town
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchBytown_First(String town,
		OrderByComparator<Projet> orderByComparator) {
		List<Projet> list = findBytown(town, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last projet in the ordered set where town = &#63;.
	 *
	 * @param town the town
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findBytown_Last(String town,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchBytown_Last(town, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("town=");
		msg.append(town);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the last projet in the ordered set where town = &#63;.
	 *
	 * @param town the town
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchBytown_Last(String town,
		OrderByComparator<Projet> orderByComparator) {
		int count = countBytown(town);

		if (count == 0) {
			return null;
		}

		List<Projet> list = findBytown(town, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Projet[] findBytown_PrevAndNext(long projetId, String town,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = findByPrimaryKey(projetId);

		Session session = null;

		try {
			session = openSession();

			Projet[] array = new ProjetImpl[3];

			array[0] = getBytown_PrevAndNext(session, projet, town,
					orderByComparator, true);

			array[1] = projet;

			array[2] = getBytown_PrevAndNext(session, projet, town,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Projet getBytown_PrevAndNext(Session session, Projet projet,
		String town, OrderByComparator<Projet> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROJET_WHERE);

		boolean bindTown = false;

		if (town == null) {
			query.append(_FINDER_COLUMN_TOWN_TOWN_1);
		}
		else if (town.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TOWN_TOWN_3);
		}
		else {
			bindTown = true;

			query.append(_FINDER_COLUMN_TOWN_TOWN_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTown) {
			qPos.add(town);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(projet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Projet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projets where town = &#63; from the database.
	 *
	 * @param town the town
	 */
	@Override
	public void removeBytown(String town) {
		for (Projet projet : findBytown(town, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(projet);
		}
	}

	/**
	 * Returns the number of projets where town = &#63;.
	 *
	 * @param town the town
	 * @return the number of matching projets
	 */
	@Override
	public int countBytown(String town) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOWN;

		Object[] finderArgs = new Object[] { town };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROJET_WHERE);

			boolean bindTown = false;

			if (town == null) {
				query.append(_FINDER_COLUMN_TOWN_TOWN_1);
			}
			else if (town.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOWN_TOWN_3);
			}
			else {
				bindTown = true;

				query.append(_FINDER_COLUMN_TOWN_TOWN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTown) {
					qPos.add(town);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TOWN_TOWN_1 = "projet.town IS NULL";
	private static final String _FINDER_COLUMN_TOWN_TOWN_2 = "projet.town = ?";
	private static final String _FINDER_COLUMN_TOWN_TOWN_3 = "(projet.town IS NULL OR projet.town = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AGE = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByage",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AGE = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, ProjetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByage",
			new String[] { Integer.class.getName() },
			ProjetModelImpl.AGE_COLUMN_BITMASK |
			ProjetModelImpl.FIRSTANDLASTNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AGE = new FinderPath(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByage",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the projets where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching projets
	 */
	@Override
	public List<Projet> findByage(int age) {
		return findByage(age, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Projet> findByage(int age, int start, int end) {
		return findByage(age, start, end, null);
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
	@Override
	public List<Projet> findByage(int age, int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return findByage(age, start, end, orderByComparator, true);
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
	@Override
	public List<Projet> findByage(int age, int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AGE;
			finderArgs = new Object[] { age };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AGE;
			finderArgs = new Object[] { age, start, end, orderByComparator };
		}

		List<Projet> list = null;

		if (retrieveFromCache) {
			list = (List<Projet>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Projet projet : list) {
					if ((age != projet.getAge())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROJET_WHERE);

			query.append(_FINDER_COLUMN_AGE_AGE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ProjetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(age);

				if (!pagination) {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first projet in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByage_First(int age,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByage_First(age, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("age=");
		msg.append(age);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the first projet in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByage_First(int age,
		OrderByComparator<Projet> orderByComparator) {
		List<Projet> list = findByage(age, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last projet in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet
	 * @throws NoSuchProjetException if a matching projet could not be found
	 */
	@Override
	public Projet findByage_Last(int age,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = fetchByage_Last(age, orderByComparator);

		if (projet != null) {
			return projet;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("age=");
		msg.append(age);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchProjetException(msg.toString());
	}

	/**
	 * Returns the last projet in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching projet, or <code>null</code> if a matching projet could not be found
	 */
	@Override
	public Projet fetchByage_Last(int age,
		OrderByComparator<Projet> orderByComparator) {
		int count = countByage(age);

		if (count == 0) {
			return null;
		}

		List<Projet> list = findByage(age, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Projet[] findByage_PrevAndNext(long projetId, int age,
		OrderByComparator<Projet> orderByComparator)
		throws NoSuchProjetException {
		Projet projet = findByPrimaryKey(projetId);

		Session session = null;

		try {
			session = openSession();

			Projet[] array = new ProjetImpl[3];

			array[0] = getByage_PrevAndNext(session, projet, age,
					orderByComparator, true);

			array[1] = projet;

			array[2] = getByage_PrevAndNext(session, projet, age,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Projet getByage_PrevAndNext(Session session, Projet projet,
		int age, OrderByComparator<Projet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROJET_WHERE);

		query.append(_FINDER_COLUMN_AGE_AGE_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ProjetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(age);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(projet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Projet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the projets where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	@Override
	public void removeByage(int age) {
		for (Projet projet : findByage(age, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(projet);
		}
	}

	/**
	 * Returns the number of projets where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching projets
	 */
	@Override
	public int countByage(int age) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AGE;

		Object[] finderArgs = new Object[] { age };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROJET_WHERE);

			query.append(_FINDER_COLUMN_AGE_AGE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(age);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_AGE_AGE_2 = "projet.age = ?";

	public ProjetPersistenceImpl() {
		setModelClass(Projet.class);
	}

	/**
	 * Caches the projet in the entity cache if it is enabled.
	 *
	 * @param projet the projet
	 */
	@Override
	public void cacheResult(Projet projet) {
		entityCache.putResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetImpl.class, projet.getPrimaryKey(), projet);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { projet.getUuid(), projet.getGroupId() }, projet);

		projet.resetOriginalValues();
	}

	/**
	 * Caches the projets in the entity cache if it is enabled.
	 *
	 * @param projets the projets
	 */
	@Override
	public void cacheResult(List<Projet> projets) {
		for (Projet projet : projets) {
			if (entityCache.getResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
						ProjetImpl.class, projet.getPrimaryKey()) == null) {
				cacheResult(projet);
			}
			else {
				projet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all projets.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProjetImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the projet.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Projet projet) {
		entityCache.removeResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetImpl.class, projet.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ProjetModelImpl)projet, true);
	}

	@Override
	public void clearCache(List<Projet> projets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Projet projet : projets) {
			entityCache.removeResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
				ProjetImpl.class, projet.getPrimaryKey());

			clearUniqueFindersCache((ProjetModelImpl)projet, true);
		}
	}

	protected void cacheUniqueFindersCache(ProjetModelImpl projetModelImpl) {
		Object[] args = new Object[] {
				projetModelImpl.getUuid(), projetModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			projetModelImpl, false);
	}

	protected void clearUniqueFindersCache(ProjetModelImpl projetModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					projetModelImpl.getUuid(), projetModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((projetModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					projetModelImpl.getOriginalUuid(),
					projetModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new projet with the primary key. Does not add the projet to the database.
	 *
	 * @param projetId the primary key for the new projet
	 * @return the new projet
	 */
	@Override
	public Projet create(long projetId) {
		Projet projet = new ProjetImpl();

		projet.setNew(true);
		projet.setPrimaryKey(projetId);

		String uuid = PortalUUIDUtil.generate();

		projet.setUuid(uuid);

		projet.setCompanyId(companyProvider.getCompanyId());

		return projet;
	}

	/**
	 * Removes the projet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param projetId the primary key of the projet
	 * @return the projet that was removed
	 * @throws NoSuchProjetException if a projet with the primary key could not be found
	 */
	@Override
	public Projet remove(long projetId) throws NoSuchProjetException {
		return remove((Serializable)projetId);
	}

	/**
	 * Removes the projet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the projet
	 * @return the projet that was removed
	 * @throws NoSuchProjetException if a projet with the primary key could not be found
	 */
	@Override
	public Projet remove(Serializable primaryKey) throws NoSuchProjetException {
		Session session = null;

		try {
			session = openSession();

			Projet projet = (Projet)session.get(ProjetImpl.class, primaryKey);

			if (projet == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProjetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(projet);
		}
		catch (NoSuchProjetException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Projet removeImpl(Projet projet) {
		projet = toUnwrappedModel(projet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(projet)) {
				projet = (Projet)session.get(ProjetImpl.class,
						projet.getPrimaryKeyObj());
			}

			if (projet != null) {
				session.delete(projet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (projet != null) {
			clearCache(projet);
		}

		return projet;
	}

	@Override
	public Projet updateImpl(Projet projet) {
		projet = toUnwrappedModel(projet);

		boolean isNew = projet.isNew();

		ProjetModelImpl projetModelImpl = (ProjetModelImpl)projet;

		if (Validator.isNull(projet.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			projet.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (projet.getCreateDate() == null)) {
			if (serviceContext == null) {
				projet.setCreateDate(now);
			}
			else {
				projet.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!projetModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				projet.setModifiedDate(now);
			}
			else {
				projet.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (projet.isNew()) {
				session.save(projet);

				projet.setNew(false);
			}
			else {
				projet = (Projet)session.merge(projet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ProjetModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((projetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { projetModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { projetModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((projetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						projetModelImpl.getOriginalUuid(),
						projetModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						projetModelImpl.getUuid(),
						projetModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((projetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIRSTANDLASTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						projetModelImpl.getOriginalFirstandLastName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIRSTANDLASTNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIRSTANDLASTNAME,
					args);

				args = new Object[] { projetModelImpl.getFirstandLastName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FIRSTANDLASTNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FIRSTANDLASTNAME,
					args);
			}

			if ((projetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOWN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { projetModelImpl.getOriginalTown() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOWN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOWN,
					args);

				args = new Object[] { projetModelImpl.getTown() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOWN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOWN,
					args);
			}

			if ((projetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AGE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { projetModelImpl.getOriginalAge() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_AGE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AGE,
					args);

				args = new Object[] { projetModelImpl.getAge() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_AGE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AGE,
					args);
			}
		}

		entityCache.putResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
			ProjetImpl.class, projet.getPrimaryKey(), projet, false);

		clearUniqueFindersCache(projetModelImpl, false);
		cacheUniqueFindersCache(projetModelImpl);

		projet.resetOriginalValues();

		return projet;
	}

	protected Projet toUnwrappedModel(Projet projet) {
		if (projet instanceof ProjetImpl) {
			return projet;
		}

		ProjetImpl projetImpl = new ProjetImpl();

		projetImpl.setNew(projet.isNew());
		projetImpl.setPrimaryKey(projet.getPrimaryKey());

		projetImpl.setUuid(projet.getUuid());
		projetImpl.setProjetId(projet.getProjetId());
		projetImpl.setGroupId(projet.getGroupId());
		projetImpl.setCompanyId(projet.getCompanyId());
		projetImpl.setUserId(projet.getUserId());
		projetImpl.setUserName(projet.getUserName());
		projetImpl.setCreateDate(projet.getCreateDate());
		projetImpl.setModifiedDate(projet.getModifiedDate());
		projetImpl.setTown(projet.getTown());
		projetImpl.setIsSingle(projet.isIsSingle());
		projetImpl.setAge(projet.getAge());
		projetImpl.setBirthDay(projet.getBirthDay());
		projetImpl.setFirstandLastName(projet.getFirstandLastName());

		return projetImpl;
	}

	/**
	 * Returns the projet with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the projet
	 * @return the projet
	 * @throws NoSuchProjetException if a projet with the primary key could not be found
	 */
	@Override
	public Projet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProjetException {
		Projet projet = fetchByPrimaryKey(primaryKey);

		if (projet == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProjetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return projet;
	}

	/**
	 * Returns the projet with the primary key or throws a {@link NoSuchProjetException} if it could not be found.
	 *
	 * @param projetId the primary key of the projet
	 * @return the projet
	 * @throws NoSuchProjetException if a projet with the primary key could not be found
	 */
	@Override
	public Projet findByPrimaryKey(long projetId) throws NoSuchProjetException {
		return findByPrimaryKey((Serializable)projetId);
	}

	/**
	 * Returns the projet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the projet
	 * @return the projet, or <code>null</code> if a projet with the primary key could not be found
	 */
	@Override
	public Projet fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
				ProjetImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Projet projet = (Projet)serializable;

		if (projet == null) {
			Session session = null;

			try {
				session = openSession();

				projet = (Projet)session.get(ProjetImpl.class, primaryKey);

				if (projet != null) {
					cacheResult(projet);
				}
				else {
					entityCache.putResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
						ProjetImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
					ProjetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return projet;
	}

	/**
	 * Returns the projet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param projetId the primary key of the projet
	 * @return the projet, or <code>null</code> if a projet with the primary key could not be found
	 */
	@Override
	public Projet fetchByPrimaryKey(long projetId) {
		return fetchByPrimaryKey((Serializable)projetId);
	}

	@Override
	public Map<Serializable, Projet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Projet> map = new HashMap<Serializable, Projet>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Projet projet = fetchByPrimaryKey(primaryKey);

			if (projet != null) {
				map.put(primaryKey, projet);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
					ProjetImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Projet)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROJET_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Projet projet : (List<Projet>)q.list()) {
				map.put(projet.getPrimaryKeyObj(), projet);

				cacheResult(projet);

				uncachedPrimaryKeys.remove(projet.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ProjetModelImpl.ENTITY_CACHE_ENABLED,
					ProjetImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the projets.
	 *
	 * @return the projets
	 */
	@Override
	public List<Projet> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Projet> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Projet> findAll(int start, int end,
		OrderByComparator<Projet> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Projet> findAll(int start, int end,
		OrderByComparator<Projet> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Projet> list = null;

		if (retrieveFromCache) {
			list = (List<Projet>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROJET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROJET;

				if (pagination) {
					sql = sql.concat(ProjetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Projet>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the projets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Projet projet : findAll()) {
			remove(projet);
		}
	}

	/**
	 * Returns the number of projets.
	 *
	 * @return the number of projets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROJET);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProjetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the projet persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ProjetImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROJET = "SELECT projet FROM Projet projet";
	private static final String _SQL_SELECT_PROJET_WHERE_PKS_IN = "SELECT projet FROM Projet projet WHERE projetId IN (";
	private static final String _SQL_SELECT_PROJET_WHERE = "SELECT projet FROM Projet projet WHERE ";
	private static final String _SQL_COUNT_PROJET = "SELECT COUNT(projet) FROM Projet projet";
	private static final String _SQL_COUNT_PROJET_WHERE = "SELECT COUNT(projet) FROM Projet projet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "projet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Projet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Projet exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ProjetPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}