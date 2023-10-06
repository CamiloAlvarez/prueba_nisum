# prueba nisum

    Requests de prueba con postman:

    Primero se debe autenticar obteniendo un token desde la siguiente url:

    url: [serever]:8080/authenticate

    response: {"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE2OTY1ODYzNzcsImlhdCI6MTY5NjU2ODM3N30.hgKWocd6bgk7SW4YQb2wgg-IDr3uVmZ3_0N0aaNHuXeavlWpud54NadUtsUnwu3CjxD2wy_lGsXdxNbWN8-uNw"}

    Para hacer peticiones a las urls que siguen, se debe agregar en la peticion el header "authorization" con el valor "Bearer [Token obtenido en el paso anterior]"

    Lista Usuarios:

    url: [server]:8080/usuarios

    response: [ { "id": 2, "name": "Juan Rodriguez", "email": "juan@rodriguez.org", "pass": "hunter2", "created": "09-03-2023 21:58:41", "modified": "09-03-2023 21:58:41", "isActive": 1 }, "id": 3, "name": "Juan Rodriguez 2", "email": "juan2@rodriguez.org", "pass": "hunter", "created": "09-03-2023 21:58:41", "modified": "09-03-2023 21:58:41", "isActive": 1 ]

    Crear Usuario:

    url: [server]:8080/crearUsuario

    request:

    { "name": "Juan Rodriguez", "email": "juan@rodriguez.orgo", "pass": "hunter", "phones": [ { "number": "1234567", "citycode": "1", "countrycode": "57" } ] }

    response:

    { "id": 2, "name": "Juan Rodriguez", "email": "juan@rodriguez.orgo", "pass": "hunter", "created": "09-03-2023 21:58:41", "modified": "09-03-2023 21:58:41", "isActive": 1, }

    Editar Usuario:

    url: [server]:8080/editarUsuario

    request:

    { "name": "Juan Rodriguez", "email": "juan@rodriguez.orgo", "pass": "hunter", "phones": [ { "number": "1234567", "citycode": "1", "countrycode": "57" } ] }

    response:

    { "id": 2, "name": "Juan Rodriguez", "email": "juan@rodriguez.orgo", "pass": "hunter", "created": "09-03-2023 21:58:41", "modified": "09-03-2023 21:58:41", "isActive": 1, }

    Eliminar Usuario:

    url: [server]:8080/eliminarUsuario/1
