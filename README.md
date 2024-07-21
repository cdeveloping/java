# Java
En este repositorio se encuentran los archivos del curso de Java desde cero, intentaré ir explicando todos a medida que los vaya colgando para que sea más fácil su interpretación.

<hr><br>

## Puntos a tener en cuenta

<ul>
    <li>Todos los programas en Java tienen que estar dentro de al menos una clase.</li>
    <li>Java es un lenguaje fuertemente tipado</li>
</ul>
<hr>

## Tipos Primitivos en Java
<p>Los tipos primitivos que podemos encontrar en Java son: </p>

<ul>
    <li>Enteros.</li>
        <ul>
            <li>int: 4 bytes de almacenamiento. Desde -2.147.483.648 hasta 2.147.483.648</li>
            <li>short: 2 bytes de almacenamiento. Desde -32.767 hasta 32.767.</li>
            <li>long: 8 bytes de almacenamiento. Números muy grandes. Hay que añadir el sufijo "l"</li>
            <li>byte: 1 byte de almacenamiento. Desde -128 hasta 127.</li> 
        </ul>
    <li>Coma Flotante (decimales)</li>
        <ul>
            <li>Float: 4 bytes de espacio para el almacenamiento. De 6 a 7 cifras decimales. Sufijo F.</li>
            <li>Double: 8 Bytes de espacio para el almacenamiento. Hasta 15 cifras decimales.</li>
        </ul>
    <li>Char (Representan caracteres)</li>
    <li>Boolean (Dos valores True o False)</li>
</ul>


<hr>

## Variables en Java

<h3>¿Qué es una variable en Java?</h3>
<p>Una variable en Java es un espacio que reservamos en la memoria para almacenar un valor, que podrá cambiar y ser modificado durante la ejecución del programa.</p>

<h3>¿Cómo se crea una variable en Java?</h3>
<p>Para crear una variable en java deberemos especificar el tipo de dato que vamos a almacenar seguido del nombre de la variable. Ejemplo: string nombre;</p>

<h3>¿Qué es iniciar una variable?</h3>
<p>Iniciar una variable es asignarle un valor a la misma, por ejemplo string nombre = "Carlos";</p>

## Constantes en Java

<h3>¿Qué es una constante?</h3>
<p>Al igual que en las variables, una constante es un espacio en memoria que vamos a reservar para almacenar de manera temporal un valor determinado.</p>
<p>La diferencia con las variables es que este valor será fijo, y no se podrá modificar durante el tiempo de ejecución.</p>

<h3>¿Cómo se declara una constante en Java</h3>
<p>Para declarar una constante en Java, deberemos utilizar la palabra reservada "FINAL".</p>
<p>La estructura básica de una constante sería la siguiente: final + tipo de datos + nombre de la constante.</p>
<p>final string nombre = "Carlos"; </p>


## Comentarios en Java
<p>Los comentarios en Java son pequeñas ayudas que podemos dejar dentro de nuestro código y que nos permiten en caso de trabajar en equipo, que otros programadores puedan entender ciertas partes de nuestro código de una manera más fácil.</p>
<p>Podemos dejar diferentes tipos de código y se introducen de diferentes maneras.</p>
<ul>
    <li>Una sola linea.</li>
    <p> Para introducir un comentario de una solo linea usaremos dos barras // todo lo que pongamos detrás de estas barras y siempre dentro de esa misma lina de código, el compilador no lo tendrá en cuenta y nos producirar un error.</p>
    <li>Múltiples Lineas</li>
    <p>En el caso de los comentarios de más de una linea tenemos dos opciones, una sería usando barra invertida y asterisco tanto al principio, como al final del comentario /* comentario */.</p>
    <p>También tenemos otro tipo de comentario multilinea que se muestra de una manera parecida /** Comentario **/, cualquiera de estos dos formatos es igual de valido.</p>


## Operadores en Java
<p>Los operadores en Java nos ayudan a realizar diferentes operaciones, los podemos dividir en varios grupos:</p>
<ul>
    <li>Aritméticos:</li>
        <ul>
            <li>Suma: +</li>
            <li>Resta: - </li>
            <li>Multiplicación: *</li>
            <li>División: /</li>
        </ul>
    <li>Lógicos, relacionales y Booleanos</li>
        <ul>
            <li>Mayor que: >. </li>
            <li>Menor que: <. </li>
            <li>Mayor o menor que: "<.> </li>
            <li>Distinto que: !=. </li>
            <li>Igual que: ==. </li>
            <li>Y lógico: &&.</li>
            <li>O lógico: ||.</li>
        </ul>
    <li>Incremento y Decremento:</li>
        <ul>
            <li>Incremento: ++.</li>
            <li>Decremento: --.</li>
            <li>Incremento: += nº.</li>
            <li>Decremento: -= nº.</li>
        </ul>
    <li>Concatenación:</li>
        <ul>
            <li>Une o concatena: +.</li>
        </ul>
</ul>







