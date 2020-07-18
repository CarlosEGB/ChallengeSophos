# Proyecto de selección Sophos automatización Web y Api
El proyecto es un reto de Sofhos, donde se realizó dos automatizaciones que son las siguientes:
 
- Automatización de una `RestApi`, donde se realiza una petición `Post`, ubicado en el GrupoId `com.challenge.api`.
- Automatización de una funcionalidad de la página web `www.wong.pe`, donde se realiza adición de un producto al carro en Chrome, en el GrupoId `com.challenge.web`.

## Tecnologías Implementadas
- Lenguaje : Java 8_251
- IDE      : Intellij IDE 2020.1
- Management Tool : Maven
- Framework Test : SerenityBDD 2.0.91
- Framework Test : Serenity-Rest 2.0.91
- Framework Test : Serenity-Cucumber 1.9.39
- Test-Driven : Junit 4.12

## Mitología POM en automatización
Estas automatizaciones se realizaron bajo la metodología de desarrollo `Page Object Model`, la cual se diseñó bajo las siguientes estructuras:
- La automatización Post al Api User:
```
+ test.java
        --.com.challenge
                        --.rest
                            --.definitions
                            --.models
                            --.runners
                            --.steps
                            --.utils
+ test.resources
        --.com.challenge
                        --.rest
                            --.data
                            --.features
```
- La automatización Web:
```
+ test.java
        --.com.challenge                        --.web
                            --.definitions
                            --.page_objects
                            --.runners
                            --.steps
+ test.resources
        --.com.challenge
                        --.web
                            --.drivers
                            --.features
```

## Automatización página Web 
Se realiza una prueba automatiza de la funcionalidad, agregar producto al carrito en la página `https://www.wong.pe/especiales/cyberwong`.

### Precondiciones:
- Tener el `Código del Producto`, la cual se seleccionar para agregar al carro, en este ejercicio se usó el `12463`.

### Instrucciones
- PASO 1: Se tiene que identificar la clase runner, la cual está ubicada `src\test\java\com\challenge\web\runners\BuyProductWebRunner.java`.
- PASO 2: Tienes que ejecutar la clase con `Junit`.
- PASO 3: Cuanto termine la ejecución, y quieres obtener el informe,  ejecuta el comando en terminal `mvn serenity:aggregate`, ubicado en la carpeta principal del proyecto.

## Automatización Post a una RestApi
Se realiza una prueba automatiza RestApi, con la petición `POST` al Api User de gorest  `https://gorest.co.in/public-api/users`, donde se inserta un nuevo usuario con sus respectivos datos.

### Precondiciones
- Tener en cuenta que el `access-token`, vence cada cierto lazo de tiempo.
- Para obtener uno nuevo tienes que ir a la página https://gorest.co.in/, y en la sección de `Resources` das clic al  link: `https://gorest.co.in/public-api/users.`
- Después vas a ver que al final de link, nos han dado el `access-token`.
- Recuerde que la data es única en su `email`, si el correo es igual a uno existente dará una respuesta `400`.
 
### Instrucciones 
- PASO 1: Primer paso es cambiar el Token, ya que el actual se ha vencido.
- PASO 2: El archivo properties donde se cambia token, está en la ruta `src\test\resources\com\challenge\rest\data\data.properties`.
- PASO 3: Después de obtener el token en la página lo copiamos, y remplazando el valué de la key `AccessToken`, de `data.properties`.
- PASO 4: Ya configurado el token, se cambia la data, principal mente el correo en él `.feature`, ubicado en la ruta `src\test\resources\com\challenge\rest\features\api_gorest.feature`
- PASO 5: Se tiene que identificar la clase runner, la cual está ubicada  en `src\test\java\com\challenge\rest\runners\RestApiPostUserRunner.java`.
- PASO 6: Tienes que ejecutar la clase con `Junit`.
- PASO 7: Cuanto termine la ejecución, y quieres obtener el informe,  ejecuta el comando en terminal `mvn serenity:aggregate`, ubicado en la carpeta principal del proyecto.
- PASO 8: Para ver el informe web, se ingresa la siguiente ruta `target\site\serenity\index.html`.

## Informe Serenity
Serenity nos proporciona un informe, este nos permite revisa de forma gráfica y detalla las evidencias de las ejecuciones de las pruebas realizadas.

### Precondiciones
- Lo principal es haber realizado una prueba como mínimo.

### Instrucciones 
- PASO 1: Ubicado dentro de la carpeta principal del proyecto `ChallengeSophos`, abrimos la terminal en esa ruta.
- PASO 2: Cuanto finalice la prueba, ejecuta el comando en la terminal `mvn serenity:aggregate`.
- PASO 3: Para ver el informe web, se ingresa la siguiente ruta `target\site\serenity\index.html`, y lo abres con un navegador.

## Ejecucion por Terminal o Consola
La ejecucion por consola trae ventajas al momento de probar.
- Nos permite ejecutar las pruebas sin necesidad de un IDE.
- Tambien el tema de integracion continua se hace mas facil su configuracion.
- Entre muchas otras.

### Instrucciones 
- PASO 1: Ubicado dentro de la carpeta principal del proyecto `ChallengeSophos`, abrimos la terminal en esta ubicacion.
- PASO 2: Escribimos el siguiente comando `mvn clean verify`, luego ejecutamos.
- PASO 3: Esperamos que las pruebas se completen.
- PASO 4: En la consola nos mostrala el link del informe `target\site\serenity\index.html`, y lo abrimos con un navegador.

