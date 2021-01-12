Tabla de Contenidos - Índice.
___
- [Python.](#python)
  - [***Características.***](#características)
  - [***Estructura de un programa.***](#estructura-de-un-programa)
  - [***Literales Variables y Expresiones.***](#literales-variables-y-expresiones)
  - [***Operadores y su procedencia.***](#operadores-y-su-procedencia)
  - [***Tipos de datos.***](#tipos-de-datos)
    - [Tipos numéricos.](#tipos-numéricos)
      - [Numéricos Enteros (int):](#numéricos-enteros-int)
      - [Numéricos Reales (float):](#numéricos-reales-float)
      - [Conversión tipos de datos.](#conversión-tipos-de-datos)
    - [Tipos booleanos (bool).](#tipos-booleanos-bool)
    - [Tipo de datos secuencia - (En Construcción).](#tipo-de-datos-secuencia---en-construcción)
    - [Tipo de datos cadenas de caracteres (En Construcción).](#tipo-de-datos-cadenas-de-caracteres-en-construcción)
      - [Operaciones básicas con cadenas de caracteres.](#operaciones-básicas-con-cadenas-de-caracteres)
      - [Concatenación.](#concatenación)
      - [Repetición.](#repetición)
      - [Indexación.](#indexación)
      - [Longitud.](#longitud)
      - [Comparación.](#comparación)
    - [Tipo de datos mapas o diccionario (dict) (En Construcción).](#tipo-de-datos-mapas-o-diccionario-dict-en-construcción)
  - [***Funciones. (En Construcción).***](#funciones-en-construcción)
    - [abs(x)](#absx)
    - [divmod(x,y)](#divmodxy)
    - [hex(x)](#hexx)
    - [bin(x)](#binx)
    - [pow(x,y)](#powxy)
    - [round(x,[y])](#roundxy)
    - [input()](#input)
    - [print()](#print)
___
# Python.
## ***Características.***
  + Es un lenguaje de programación interpretado.
  + De alto nivel.
  + Multi paradigma soportando orientación programada a objetos, imperativa y funcional.
  + Es libre
  + Multiplataforma.
___
## ***Estructura de un programa.***
  - No es necesario reservar ninguna palabra ni función.
  - No es necesario terminar las instrucciones con punto y coma (;) al final de cada línea.
  - Es un lenguaje de programación que respeta la tabulación.
  - La identación se puede hacer con la tecla de espaciado o tab.
  - No es necesario la declaración de variables.
  - El carácter (#) es usado como un comodín para hacer comentarios en el código, este no hace parte del código.
___
## ***Literales Variables y Expresiones.***
  - Literales: <p>Los literales son notaciones que permiten representar valores fijos con el código de python que cuenta con varios literales como ejemplo están los Numéricos (123) o las cadenas ("soy un literal"). <a href=https://stackoverrun.com/es/q/9423556>Fuente</a> </p>.
    - Enteros: Se representan con cifras enteras ejemplo `(3)(12)(-23)`
    - Reales: Se representan con un punto para separar la parte entera de la decimal. ejemplo `(3.1)(12.10)`.
    - Cadenas: Se representan con el carácter `'` o doble `""`.
  
  - Variables: Una variable es un identificador que hace referencia a un valor, para que tome este valor se implementa el operador `=` y puede cambiar su valor en cualquier momento.
      ```py
        >>> var = 5
        >>> type(var)
        <class 'int'>
        >>> var = "hola"
        >>> type(var)
        <class 'str'>
    ```
  
  - Expresiones: Es una combinación de variables, literales, operadores, funciones que retornan un valor determinado acorde con la programación generada. 
___  
## ***Operadores y su procedencia.***
  - Los operadores se clasifican según el tipo de datos con los que se programen, estos son unos ejemplos.
    - Operadores aritméticos: `+, -, *, /, //, %, **`.
    - Operadores de cadenas: `+, *`.
    - Operadores de asignación: `=`.
    - Operadores de comparación:
      - `==`: Igual que.
      - `!=`: Distinto que.
      - `>`: Mayor que.
      - `<`: Menor que.
      - `<=`: Menor o igual.
      - `>=`: Mayor o igual.
    - Operadores lógicos: `and, or, not`.
    - Operadores de pertenencia: `in, not in`.
  - La procedencia de los operadores es la siguiente:
    - Los paréntesis rompen la precedencia.
    - Potencia `(**)`.
    - Unarios `(+ -)`.
    - Multiplicar, dividir, módulo y división entera `(* % // )`.
    - Suma y resta `(+ -)`.
    - Binario `AND (&)` OR y XOR `(^ |)`.
    - Comparación `(<= < > >=)`.
    - Igualdad `(<> == !=)`.
    - Asignación `(=)`.
    - Pertenencia `(in, in not)`.
    - Lógicos `(not, or, and)`.
___  
## ***Tipos de datos.***
  <p>Estos son unos de los muchos tipos de datos que existen en python.</p>

### Tipos numéricos.
#### Numéricos Enteros (int): 
Son todos los enteros (Positivos, Negativos y 0) sin incluir parte decimal.
  - Ejemplo: 
      ```py
        >>> entero = 7
        >>> type(entero)
      ```
#### Numéricos Reales (float): 
Tienen una parte entera y otra decimal, normalmente se usan de tipo double.
  - Ejemplo: 
      ```py 
        >>> real = 7.2
        >>> type (real)
     ```
#### Conversión tipos de datos.
  - `int(x)`: Convierte el valor a entero.
  - `float(x)`: Convierte el valor a float.
     ```py
        >>> a=int(7.2)
        >>> a
        7
        >>> type(a)
        >>> a=int("345")
        >>> a
        345
        >>> type(a)
        >>> b=float(1)
        >>> b
        1.0
        >>> type(b)
        >>> b=float("1.234")
        >>> b
        1.234
     ```
### Tipos booleanos (bool).
Es parte de la familia de los enteros y se representa con 2 valores Verdadero `True` o Falso `False`.
  - Valores que se interpretan como falso.
    - False.
    - Cualquier numero 0 `(0,0.0)`.
    - Cualquier secuencia vacía `([], (), ‘’)`.
    - Cualquier diccionario vacío `({})`.
  
### Tipo de datos secuencia - (En Construcción).
  - Tipo lista (list).
  - Tipo tuplas (tuple).
### Tipo de datos cadenas de caracteres (En Construcción).
Las cadenas de caracteres son secuencias que pueden ser almacenadas en variables estas se pueden definir de múltiples formas, las más usuales son con comillas dobles `cad1 = "Hola"`, comillas sencillas `cad2 = 'Hola'` y en bloque con la triple comilla `cad3 = '''Hola, Buen día'''`.
#### Operaciones básicas con cadenas de caracteres.
#### Concatenación.
Con el operador ` + ` se pueden unir cadenas de caracteres.
  ```py
    >>> "hola " + "hoy es lunes"
    'hola hoy es lunes'
  ```
#### Repetición.
Con el operador ` * ` se pueden repetir un dato.
  ```py
      >>> "hola " * 3 
      'holaholahola'
  ```
#### Indexación.
Se puede obtener el dato de una secuencia indicando la posición entre los ` [] `.
  ```py
      >>> cadena = "oscar" 
      >>> cadena[1]
      's'
  ```
#### Longitud.
Se puede obtener la longitud de la cadena con la función `len()`.
  ```py
      >>> len(cadena)
      5
  ``` 
#### Comparación.
Se puede comparar carácter a carácter con los operadores de comparación, cuando el proceso de comparación no son iguales se usa el formato `unicoide` para validar el peso binario de la letra.
  ```py
       >>> "a">"A"
      True
      >>> "informatica">"informacion"
      True
      >>> "abcde">"abcdef"
      False
  ``` 
### Tipo de datos mapas o diccionario (dict) (En Construcción).
___
## ***Funciones. (En Construcción).***
### abs(x)
Devuelve al valor absoluto de un número.
  ```py
    >>> abs(-2)
    2
  ``` 
### divmod(x,y)
Toma como parámetro dos números, y devuelve una tabla con dos valores, la división entera, y el módulo o resto de la división.
  ```py
    >>> divmod(9,2)
    (4, 1)
  ```
### hex(x)
Devuelve una cadena con la representación hexadecimal del número que recibe como parámetro.
  ```py
  >>> hex(250)
  (0xfa)
  ```
### bin(x)
Devuelve una cadena con la representación binaria del número que recibe como parámetro.
  ```py
  >>> bin(16)
  (0b10000)
  ```
### pow(x,y)
Devuelve la potencia de la base x elevado al exponente y. Es similar al operador**`.
  ```py
  >>> pow(2,2)
  (4)
  ```
### round(x,[y])
Devuelve un número real (float) que es el redondeo del número recibido como parámetro, podemos indicar un parámetro opcional que indica el número de decimales en el redondeo.
  ```py
    >>> round(2.546,1)
    (2.5)
  ```
### input()
Permite obtener por teclado la información que se ingresa.
  ```py
    >>> nombre = input("Ingrese su nombre: ") 
    Ingrese su nombre: oscar
    >>> nombre
    'oscar'
  ```
### print()
Función que permite imprimir por pantalla el dato que se asigna como argumento en los paréntesis (argumento).
  ```py
    >>> print(nombre)
    oscar
  ```
- Con la función print también se puede dar formato a los datos que se imprimen por pantalla.
  ```py
    >>> print("%d %f %s" % (2.5,2.5,2.5))
    2 2.500000 2.5
  ```

___
  Author - Oscar G Bocanegra.<br>
  https://www.linkedin.com/in/oscarbocanegra/
  <br>
  Fuentes de información.
  * Cursos de [OpenWebinars](https://openwebinars.net/).
  * Cursos de Platzi [Platzi](http://platzi.com/)
___
