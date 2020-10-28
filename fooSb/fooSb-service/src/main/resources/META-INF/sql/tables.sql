create table FOO_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	town VARCHAR(75) null,
	single_ BOOLEAN,
	age INTEGER,
	birthDay DATE null,
	firstandLastName VARCHAR(75) null
);