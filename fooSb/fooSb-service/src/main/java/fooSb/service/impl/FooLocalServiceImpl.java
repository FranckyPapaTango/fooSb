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

package fooSb.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;

import aQute.bnd.annotation.ProviderType;
import fooSb.model.Foo;
import fooSb.model.impl.FooImpl;
import fooSb.service.base.FooLocalServiceBaseImpl;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fooSb.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceBaseImpl
 * @see fooSb.service.FooLocalServiceUtil
 */
@ProviderType
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link fooSb.service.FooLocalServiceUtil} to access the foo local service.
	 */
	public void saveFoo(Boolean isSingle,String town,int age,Date birthDay, String firstandLastName){
		Foo foo=new FooImpl();
		foo.setFooId(counterLocalService.increment());
		
		foo.setIsSingle(isSingle);
		foo.setTown(town);
		foo.setAge(age);
		foo.setBirthDay(birthDay);	
		foo.setFirstandLastName(firstandLastName);
		
		try {
			resourceLocalService.addResources(foo.getCompanyId(), foo.getGroupId(), foo.getUserId(),
					Foo.class.getName(), foo.getFooId(), false, true, true);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}