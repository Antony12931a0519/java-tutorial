# java-tutorial
jdbc
----

database

5 steps

registeringing the driver(mysql driver/oracle/h2(in menory) h2 driver)

create the connect(username/password/url)
jdbc:localhost(ip adress):port number(3306/1521)

create the statment(queries )

perepared statements(which include where clauses)

executing the query(resultset)


------------------------------
https://app.gotomeeting.com/?meetingId=141030301

four types of methods
--------------------
CRUD(create/read/update/delete)
GET(R)--reading/pulling  from db
POST(C)---insertion
PUT(U)---updation
DELETE(D)----deletion

application servers(Tomcat/weblogic/jboss/glassfish)
http://localhost:portnumber(any application server port number)/<mention any valid meaninfull address>

https://facebook.com
http://localhost:8080/welcome/messge(service/restfull service/endoint/api)

Consumes(inputs to the service)

Student:
----------

retrieval od data end points (GET)

no need to pass input(Consumes)--(xml/html/text/json )
JSON

class Student{

int rollNo= 12;
String name = "abc";
String adress = "def";

}


{

"rollNo":"12",
"name":"abc",
"adress":"qjnfn	jw"


}


List<Student> list
[
{

"rollNo":"12",
"name":"abc",
"adress":"qjnfn	jw"


},
{

"rollNo":"122",
"name":"abc2",
"adress":"qjnfn	jw"


}
]


----------------------------
@Consumes(Application/html)
@Consumes(Application/xml)

-----------------------------
@Produces(Application/json)

information given by the service(Produces)

col1 col2 col3 col4(select * from Student)
--------------------------------------
path("mention the name of the url")
---------------------------------------

https://app.gotomeeting.com/?meetingId=141030301


----------------------------------------------------

Ssntax for the get service or methods
---------------------------------------


//@Consumes()
@Produces(Application/Json)
@Path("welcome/message")
public String getWelcomeMessage(){

return "Hello";

}

//@Consumes()
@Produces(Application/Json)
@Path("todays/date")
public String getTodaysDte(){

return new Date().toString();

}



http://localhost:8080/welcome/message


-------------------------------------------


maven(build tool)
pom.xml(heart f you project)(xml tags)
for creating the directory of project


----------------------------------------------

creating some sample project

different layers we use in prject
layer--package
controller layers(all the endpoints)
model layers--pojo classes
service layers/manager layers(you try the write the business logic)
dao layers(data access object)
util layers- where 

pogo class
------------

Student{

private int age;
private String name;

getters(accessing the props)
setters(setting the values for pros)

}

------------------------


postman(tool)

--------------
tomcat

-------------------

tomcat/postman/maven













