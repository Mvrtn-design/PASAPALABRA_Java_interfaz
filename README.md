<div id="header" align="center">
  <img src="https://github.com/Mvrtn-design/PASAPALABRA_java_interfaz/blob/main/MenuAdministrador.jpg"/>
  <h1 align=center" >Pasapalabra con interfaz en JAVA</h1>
</div>
<div id= "desc" align= "justify">
Se realiza un juego similar a “Pasapalabra”. Cada partida, que se juega en una fecha determinada, tiene dos jugadores, identificados por su nombre, que es único. Los jugadores accederán al sistema con su nombre y una contraseña. Cada jugador empieza con 100 puntos. Al jugar una partida, gasta 5 puntos. Los “roscos” están formados por un número de letras del abecedario, excluyendo la K y la W. El número de letras del rosco se especifica al empezar la partida (por ejemplo, si el rosco es de 4 letras, se empieza por la A y se termina en la D). Cada una de las letras del rosco pertenece a una palabra y ésta puede tener una o varias definiciones. Las palabras del rosco pueden estar en uno de estos estados: acertada, fallada o no contestada.
Cada uno de los jugadores puede dar dos vueltas al rosco para resolver todas las letras.

Los jugadores disponen de un turno, que mantendrán mientras acierten. Si fallan, o “pasan palabra”, el turno pasa al otro jugador. Sin embargo, en la segunda vuelta no podrán “pasar palabra”, tendrán que contestar o acumularán un error. En la segunda vuelta, además, no se cede el turno.
                                
En cada una de las partidas, podrá ocurrir una de las siguientes situaciones:
-  Un jugador acierta todas las palabras del rosco. En ese caso, gana la partida y acumulará 100 puntos.
- Los dos jugadores completan las dos vueltas sin acertar todas las palabras. En ese caso, gana el jugador que tenga más aciertos; en caso de empate, ganará el jugador que tenga menos fallos. El ganador de la partida acumulará 10 puntos.
- Si también hay empate en el número de fallos, la partida terminará empatada, y los dos jugadores acumularán 5 puntos cada uno.
                                
Un jugador puede jugar varias partidas hasta que agote sus puntos.
<div id="header" align="center">
    <img src="https://github.com/Mvrtn-design/PASAPALABRA_java_interfaz/blob/main/Partida.jpg"/>
</div>
   <h2>Modo entrenamiento</h2>                             
También es posible jugar en modo “entrenamiento”, sin rival. Esta modalidad no cuesta ni proporciona puntos, con una excepción: en el caso de que el jugador no tenga ningún punto en su saldo, jugar un entrenamiento proporciona 5 puntos, independientemente del resultado. En modo “entrenamiento” también será gratis utilizar las ayudas.  
  <h2>Ayudas</h2>
Como novedad respecto al juego televisivo, los jugadores pueden adquirir ayudas. Estas ayudas tienen un coste en puntos y podrán ser de dos tipos: pistas o compra directa de una palabra. Las pistas pueden ser a su vez de dos clases: si la palabra a adivinar tiene asociadamás d e una definición, se mostrará otra definición distinta de la que ya se ha mostrado. En el caso que solo tenga una definición asociada, se mostrarán el 33% de las letras de la
palabra de forma aleatoria. Si el jugador selecciona la opción de comprar una palabra, ésta se dará directamente como acertada. Utilizar una pista costará 5 puntos, mientras que comprar una palabra costará 20 puntos. En cada partida sólo se podrá utilizar una ayuda para cada palabra.
 <h2 >Administrador</h2>
Para incluir los datos en el juego es necesario tener un acceso de administrador. El administrador podrá dar de alta, editar y eliminar tanto a los jugadores como a las palabras asociadas a cada una de las letras y a las definiciones asociadas a cada una de las palabras.
Además, el administrador podrá hacer todas las acciones que realizan los jugadores, pero contará con 1.000.000 puntos para jugar. Por otra parte, el administrador puede obtener información completa de las partidas. Para cada una de ellas, el administrador podrá consultar los jugadores, el marcador, y el detalle de cada uno de los roscos (letras, palabras y pistas utilizadas). Por último, el administrador podrá ver la clasificación de los distintos jugadores, en la que aparecerá su nombre, partidas jugadas, partidas ganadas, partidas empatadas, partidas perdidas y puntos conseguidos. Esta clasificación se podrá ordenar tanto por partidas ganadas como por puntos conseguidos, y será posible exportarla a un fichero de texto.
<h2>Otras implemetaciones</h2>
El jugador tendrá acceso a su historial, donde aparecerán sus estadísticas (nombre, partidas jugadas, partidas ganadas, partidas empatadas, partidas perdidas y puntos conseguidos) y la lista con sus partidas, a través de la cual tendrá acceso a la siguiente información: rival,
marcador, y el detalle de cada uno de los roscos (letras, palabras y pistas utilizadas). Sin embargo, no se guardará ninguna información relativa a los entrenamientos, no aparecerá ni en el historial de los jugadores ni será accesible para el administrador.
</div>
