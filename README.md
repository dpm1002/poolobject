poolobject
==========

## INTRODUCCIÓN Y OBJETIVOS DE LA PRÁCTICA
Esta es la primera práctica de desarrollo avanzado de sistemas software. En esta simularemos un pequeño desarrollo de un producto software y crearemos un repositorio github con el que podremos caracterizarlo y evaluarlo.

[![Java CI](https://github.com/dpm1002/poolobject/actions/workflows/ci_jdk11_build.yml/badge.svg)](https://github.com/dpm1002/poolobject/actions/workflows/ci_jdk11_build.yml) 	
[![Java CI](https://github.com/dpm1002/poolobject/actions/workflows/ci_jdk1.8_build_test.yml/badge.svg)](https://github.com/dpm1002/poolobject/actions/workflows/ci_jdk1.8_build_test.yml) 	
[![codecov](https://codecov.io/gh/dpm1002/poolobject/graph/badge.svg?token=U3Y5OVYT9P)](https://codecov.io/gh/dpm1002/poolobject)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=dpm1002_poolobject&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=dpm1002_poolobject)
[![Maintainability](https://api.codeclimate.com/v1/badges/040e5436165531d93e91/maintainability)](https://codeclimate.com/github/dpm1002/poolobject/maintainability)

Java code example of creational design pattern pool object

Workshop to use good practices in software development: testing, ci and measurement.

Authors:

- David Pérez Moreno
- Miguel Alonso Alonso

## PREGUNTAS SOBRE EL TRABAJO REALIZADO SOBRE LA PRÁCTICA

### ¿Se ha realizado trabajo en equipo?
Sí, el trabajo se ha ido realizando en conjunto ya que ambos miembros del grupo han ido realizando diferentes commits a lo largo de la práctica donde se puede observar la aportación de cada uno de ellos.

![Imágen 1 con los commits](image1.jpg)  

![Imágen 2 con los commits](image2.jpg)

### ¿Tiene calidad el conjunto de pruebas disponibles?
Sí, debido que tanto el conjunto de pruebas, como la cobertura de código han sido realizadas de una manera en la que se ha podido tener en cuenta todas las partes del código. En cuanto a calidad, estamos probando todas las caracteristicas que se nos piden.

![Imágen 3 con los tests](image3.jpg)

![Imágen 4 con el coverage](image4.jpg)

### ¿Cuál es el esfuerzo invertido en realizar la actividad?
Se ha invertido tanto el tiempo disponible en los horarios de clases prácticas, como otras tantas horas en nuestras casas para poder realizar la práctica de la manera más completa y exhaustiva posible. Ya que se necesita tiempo no solo para implementar la funcionalidad en eclipse, como también para entender el funcionamiento de la herramienta de github.

### ¿Cuál es el número de fallos encontrados en el código original?
En el código original en la parte de ReusablePoolTest nos encontramos con fragmentos del código, los cuales no estan implementados y son fallos debido a que a la hora de la ejecución, debido al método fail(), estan dando error.
Nos encontramos con 3 líneas de código de error.

![Imágen 5 con los errores dados por fail()](image5.jpg)

### ¿El proceso de integración continua realizado ha sido de calidad?
Sí, hemos realizado la integración continua de una manera correcta, pudiendose comprobar desde la pestaña de actions en github que se esta realizando de una manera automatica.

![Imágen 6 con las actions](image6.jpg)
