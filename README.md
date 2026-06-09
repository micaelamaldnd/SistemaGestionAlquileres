# Sistema de Gestión de Alquileres

Proyecto desarrollado en Java aplicando conceptos de Programación Orientada a Objetos (POO), lectura de archivos, herencia, polimorfismo, interfaces, Streams y HashMap.

## Objetivo

El sistema permite gestionar distintos tipos de alquileres, procesar información desde archivos de texto y generar reportes utilizando Streams y estructuras de datos de Java.

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Interfaces
- Lectura de archivos TXT
- Collections (List, HashMap)
- Streams API

## Estructura del Proyecto

```text
src

inicio
 └─ Main

model
 ├─ Alquiler
 ├─ AlquilerComun
 └─ AlquilerPremium

repo
 └─ LecturaArchivo

repoimp
 └─ LecturaArchivoImp

service
 └─ AlquileresService

serviceimp
 └─ AlquileresServiceImp
```

## Funcionalidades

### Gestión de Alquileres

- Listar todos los alquileres.
- Mostrar clientes.
- Buscar alquileres según condiciones.
- Obtener alquiler más caro y más barato.
- Calcular facturación total.
- Calcular costo promedio.
- Ordenar alquileres por costo final.

### Streams utilizados

- `forEach()`
- `filter()`
- `map()`
- `count()`
- `findFirst()`
- `anyMatch()`
- `max()`
- `min()`
- `mapToDouble()`
- `sum()`
- `average()`
- `sorted()`

### HashMap

Se implementó un HashMap para:

- Contar alquileres por cliente.
- Determinar qué cliente realizó más alquileres.

Ejemplo:

```java
HashMap<String,Integer> mapa = new HashMap<>();
```

Resultado:

```text
Juan = 3
María = 2
Pedro = 1
```

## Tipos de Alquiler

### Alquiler Común

Costo final calculado según tarifa base.

### Alquiler Premium

Costo final calculado aplicando un recargo adicional.

Se utiliza herencia y polimorfismo para resolver el cálculo del costo final.

## Reporte Final

El sistema genera un reporte con:

- Cantidad total de alquileres.
- Facturación total.
- Costo promedio.
- Alquiler más caro.
- Alquiler más barato.
- Cantidad de alquileres Premium.
- Cantidad de alquileres Exclusivos.
- Cliente con más alquileres.

## Conceptos aplicados

- Encapsulamiento
- Herencia
- Polimorfismo
- Interfaces
- Lectura de archivos
- Streams
- HashMap
- Lógica de negocio
- Collections

## Autor

Proyecto realizado como práctica de Programación Orientada a Objetos en Java.
