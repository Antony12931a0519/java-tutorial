# restful-services-11-30

[

{
},{}


]

Sample json format
[
    {
        "email": "aa@gmail.com",
        "fname": "aa",
        "mobile": "9988776655"
    },
    {
        "email": "swamy@gmail.com",
        "fname": "swamy",
        "mobile": "9988776655"
    },
    {
        "email": "ali@gmail.com",
        "fname": "ali ahmad",
        "mobile": "9553885912"
    },
    {
        "email": "ram@gmail.com",
        "fname": "ram",
        "mobile": "8765431256"
    },
    {
        "email": "sajid@gmail.com",
        "fname": "sajid",
        "mobile": "8121559966"
    }
]


flow of code..

controller----> service---->dao---->db
controller<---- service<----dao<----db





Pathparam
---------------
localhost:9090/details/nita@gmail.com


@PathParam(Datatype nameofvalue)


localhost:9090/details/{email}

@PathParam(String email)



https://www.shawacademy.com/learning?userid=
https://www.shawacademy.com/learning/101




@QueryParam(datatype name)

