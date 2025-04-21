# 📄Descripció - Enunciat de l'exercici

Nivel 1 y 2 completados de Patterns 2. 

Nivell 1
En tots els exercicis, crea un projecte Gradle amb una classe Main que demostri l'ús del patró (amb les invocacions que es necessitin).

Builder
Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder en Java. El sistema ha de permetre la creació de diferents tipus de pizzes amb configuracions de mida, massa i ingredients diferents.

Defineix una classe Pizza amb els següents atributs:
size (mida)
dough (tipus de massa)
toppings (ingredients)
Crea una interfície PizzaBuilder amb els mètodes necessaris per configurar la mida, la massa i els ingredients d'una pizza.
Implementa una o més classes que actuïn com a constructors concrets (PizzaBuilder) per a diferents tipus de pizzes. Per exemple, podries tenir un constructor per a la pizza hawaiana, un altre per a la pizza vegetariana, etc.
Desenvolupa una classe MestrePizzer que rebi un PizzaBuilder i que permeti construir pizzes de manera específica.
En el programa principal (Main), crea instàncies de PizzaBuilder i de MestrePizzer, i utilitza'ls per construir pizzes amb diferents configuracions.

Nivell 2
Observer
Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) canvis quan la Borsa puja o baixa.

És necessari que l'objecte Observable mantingui referències als Observers.

# 💻Tecnologies Utilitzades

- Java 17 o superior

- Gradle 7.x o superior

- IDE com IntelliJ IDEA o Eclipse (opcional, per facilitar el desenvolupament)

# 📋Requisits

- Instal·lació de **Java JDK 17** o superior
- Instal·lació de Gradle 7.x o superior (si no utilitzes un sistema de build automàtic)

# 🛠️Instal·lació

1. Clona el repositori o copia els fitxers `.java` en un directori local:

2. Descarrega les dependències i construeix el projecte mitjançant Gradle.

3. Per executar els exercicis, només cal córrer la classe Main de cada projecte.