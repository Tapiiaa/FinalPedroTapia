Examen 4. Técnicas de Programación
Realizado por: Pedro Alonso Tapia Lobo

Link a mi repositorio: https://github.com/Tapiiaa/FinalPedroTapia.git

PASOS PARA ABRIR EL PROYECTO EN EL ZIP: src --> ElProblemaDeParada --> haltchecker --> Main(contiene la interfaz gráfica del proyecto). Programas(Codigo de CountUp y CountDown, además de un main particular para comprobar funcionamiento). Carpetas haltchecker, Reverser.
Carpeta UML: Contiene foto del UML, así como el código PLANTUML

PARA EL ANALIZADOR DE CÓDIGO: src --> 


El problema de parada- Alan Turing.
# Proyecto de Simulación del Problema de Parada de Alan Turing

## 1. Problema de Parada de Alan Turing
El problema de parada fue planteado por Alan Turing en 1936 y se refiere a la imposibilidad de crear un algoritmo que pueda determinar si cualquier programa arbitrario se detendrá o entrará en un bucle infinito, dado un conjunto específico de entradas.
Turing demostró que es indecidible, lo que significa que no hay un procedimiento general que resuelva el problema para todos los programas posibles.

## 2. Qué Hemos Hecho
En este proyecto, hemos desarrollado una aplicación que simula un sistema para analizar programas y verificar si un código se detendrá o entrará en un bucle infinito.
Utilizando el patrón de diseño **Chain of Responsibility**, se implementaron múltiples manejadores (handlers) que verifican patrones como bucles `while(true)` y bucles `for` sin condiciones de salida claras.

## 3. Presentación de las Clases
El proyecto incluye las siguientes clases principales:

- **CountUpHandler**: Verifica si un bloque de código contiene un bucle infinito al contar hacia arriba.
- **CountDownHandler**: Verifica si un bloque de código cuenta hacia abajo hasta detenerse.
- **ForLoopHandler**: Detecta bucles `for` potencialmente infinitos.
- **InfiniteLoopHandler**: Detecta bucles `while(true)` que resultan en bucles infinitos.
- **HaltChecker**: Gestiona una cadena de handlers para determinar si un bloque de código se detiene o no.
- **ReverserController, ReverserModel, ReverserView**: Implementan el patrón MVC para el análisis del código y la interacción con la interfaz gráfica.
- **ReverserLogic**: Contiene la lógica para el análisis del comportamiento del programa Reverser.
- **CountUp**: Programa que cuenta indefinidamente hasta arriba
- **CountDown**: Programa que cuenta hacia abajo y se detiene
  
## 4. Patrones de Diseño Utilizados y Por Qué
- **Chain of Responsibility**: Permite que cada handler analice una solicitud y decida si manejarla o pasarla al siguiente en la cadena.
- Esto permite agregar nuevas reglas de análisis sin modificar la estructura existente.
- **Modelo-Vista-Controlador (MVC)**: Separa la presentación, lógica de control, y datos del modelo, haciendo que la aplicación sea modular y fácil de mantener.
- **Observer (Implícito en MVC)**
  Uso: Utilizado comúnmente con MVC, donde la vista se suscribe a cambios en el modelo y actualiza su presentación cuando el modelo cambia.
  Por Qué: Asegura que la interfaz de usuario se actualice automáticamente en respuesta a cambios en el estado del modelo o resultados de análisis, manteniendo la sincronización entre la UI y el estado actual del programa.

## 5. Técnicas Utilizadas
- **Swing**: Usado para la creación de una interfaz gráfica responsiva que permite la interacción del usuario con el análisis de código y proporciona resultados claros.
- **PlantUML**: Herramienta para generar diagramas UML a partir de un texto descriptivo.
  IMPORTANTE: Si en el proyecto no se puede ver la imagen generada con PlantUML, la adjunto aqui:
  https://www.plantuml.com/plantuml/png/fLHRozem6BxFhtZfLRTHORT1Yk0O3XI6Oxj_ryGQbYObIHLt-EzBcyQrDkC3Fs_Kv3cyXwVTM8V6TOqaGZbkJbXnsA5YaXluHS1_tfs7ltcb6QVmnHcXwZSKlcijEIhoXv1AehMmrProNzjNa3_egtgE_b6RlTPFUdzI9w64uyyhx52wxPbNF-xC8Z2DfR0Nrgr7tJB88cFZGJxYQ1owbxzemGAkwZLVT3_oYpVYVWArg6Bbg53UVYvA3p-Mt8E7oSXbwF3_q6-2N-z8OLk9joEtdNIv6RuYCtQo4DXgvOoMyj-mcjwTpei9DnTlHcVMuLpslT9vw-FCWde-jP_cqtikKpSzF73LVJQwDjYWZOqEJybKCmPb_NkrUeZ-uYvu96z3S9FCL2u9cKOjUv_1smAo1jKjWyYbq5bkeIGaCV2YQuloOUiK-eL3cSGRKPzTfCJjUulMSxnBciHykv4JjxEiAsYj-v9IsQ0ml96mSWDflfPxNN6h5FeL3T0qShBi2NR35UiQ-HS0
- **JavaDoc**: Documentación del código generado automáticamente para cada clase y método.

## 6. Generación de Documentación
Se generó la siguiente documentación:
- **JavaDoc**: Contiene la descripción detallada de todas las clases, métodos y atributos.
  IMPORTANTE: Está generada en la carpeta "DocumentacionProyectosJavaDoc"
- **Tests Unitarios**: Aseguran la funcionalidad correcta de los componentes del programa.
- **Diagrama UML**: Un diagrama UML que muestra la estructura general del proyecto.

## 7. Cómo Entendimos y Desarrollamos la Práctica
La práctica se entendió como un ejercicio para simular el problema de parada y aplicar patrones de diseño que permitan analizar código de manera eficiente. 
El desarrollo se realizó en fases: primero identificamos los diferentes tipos de bucles infinitos. 
Luego diseñamos los handlers para cada tipo, y finalmente, implementamos la cadena de responsabilidad que gestiona el análisis.

## 8. Reflexión sobre los Límites de la Computación
Este ejercicio demuestra los límites de la computación tal como lo descubrió Turing, ya que ningún algoritmo puede determinar infaliblemente si un programa arbitrario se detendrá o no. 
Nos enseña la importancia de los patrones de diseño para abordar problemas complejos y cómo crear simulaciones con técnicas modernas.


