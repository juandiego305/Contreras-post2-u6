# Refactorización de Sistema de Pedidos: De Spaghetti Code a Strategy/Command

Este laboratorio para la **UFPS** demuestra la eliminación de código enredado (**Spaghetti Code**) mediante la aplicación de patrones de diseño de comportamiento.

## ⚠️ Antipatrón Identificado: Spaghetti Code
El `ProcesadorPedidos` original presentaba **6 niveles de anidamiento** de condicionales `if-else`, lo que violaba el Principio Abierto-Cerrado (OCP) y dificultaba la legibilidad y testabilidad .

## 🛠️ Solución con Patrones de Diseño
1.  **Patrón Strategy**: Se encapsuló la lógica de descuentos en estrategias independientes (`VIP`, `Premium`, `Estandar`), permitiendo agregar nuevos tipos de clientes sin modificar el código existente .
2.  **Patrón Command**: Se desacopló la solicitud del procesamiento mediante `ComandoProcesarPedido`, facilitando la ejecución de pedidos en lotes o flujos de datos (Streams) .
3.  **SelectorEstrategia**: Se eliminó la toma de decisiones basada en `if` mediante el uso de un `Map` para la selección dinámica de estrategias .

## 📊 Comparación de Complejidad
- **Antes**: Lógica principal con 6 niveles de anidamiento.
- **Después**: Lógica principal con **0 niveles de anidamiento** (flujo lineal).

<img width="1204" height="759" alt="image" src="https://github.com/user-attachments/assets/33248c95-fa80-44b8-a89a-e23f0bc88237" />

## 🚀 Ejecución
```bash
mvn clean compile && mvn exec:java



