

## testing v2

#### TDD

<i>Utilización de librerías para TDD</i>
1. <b>Initial_Test.</b> Ordenación y parametrización de tests
2. <b>Date_Test.</b> Uso de JUnit con parametros
3. <b>Fixtures.</b> Uso de jerarquía de JUnit y annotations pre/post test
4. <b>Testng.</b> Demo uso de TestNg (ojo véase bug abajo)
5. <b>TDD_Init.</b> Parametrización de tests
6. <b>AssertJ_Hamcrest.</b> Demo uso de AssertJ y Hamcrest
7. <b>Kata TDD: Calculadora.</b> Implementación del modelo TDD

<i>Agile + TDD</i>
7. <b>Kata Agile.</b> Definición y planificación de etapas Scrum para el proyecto Cocktails&Drinks

#### Microservices

- CocktailsAndDrinks_Mocks. Mocks para tests unitarios. 
    - Endpoints disponibles:
        - http://localhost:8081/test
        - http://localhost:8081/drink/all
- CocktailsAndDrinks_JBehave. Adaptación de tests JBehave (tomado de https://www.baeldung.com/jbehave-rest-testing)

#####Bugs

- Error <i>"TestNG by default disables loading DTD from unsecured Urls".</i>
    - Es necesario añadir un JVM argument en la ejecución: -Dtestng.dtd.http=true
    - En IntelliJ: Run > Edit Configurations > add JVM argument
    - Véase https://github.com/cbeust/testng/issues/2022

