# Netip

Programa de terminal en Java para cálculos de direccionamiento IP y VLSM, ejecutable con Maven.

## Características

- **Modo Normal:**  
  Al ejecutar el programa con un parámetro en formato `IP/MASCARA` (por ejemplo, `192.168.1.0/24`) se muestran:
  - Clase de la IP (A, B, C, D o E)
  - Tipo de IP (Pública o Privada)
  - Dirección de red
  - Dirección de Broadcast
  - Rango de hosts disponibles (primer y último host)

- **Modo VLSM:**  
  Con el flag `-vlsm` se activa el modo VLSM. Se solicita:
  - La cantidad de subredes a crear.
  - Para cada subred, el número de hosts requeridos.
  
  El programa calcula la subred mínima necesaria para cada caso y muestra una tabla con:
  - Subred Nº, Nº Hosts requeridos, IP Red, Máscara (/XX), Primer Host, Último Host y Broadcast.

- **Modo Debug:**  
  Con el flag `-d` o `--debug` se muestra información detallada del proceso de cálculo.

- **Exportación a CSV (Extra):**  
  En modo VLSM, utilizando el flag `--csv <archivo.csv>`, se exporta la tabla de resultados a un archivo CSV.

## Requisitos

- Java 8 o superior
- Maven

## Compilación y Ejecución usando Maven

1. **Compilar el proyecto:**

   Navega a la raíz del proyecto (donde se encuentra el archivo `pom.xml`) y ejecuta:

  ```bash
   mvn compile
   ```

2. **Ejecutar el programa:**

    Utiliza el plugin exec de Maven para ejecutar la clase principal. Por ejemplo, para ejecutar en modo normal:

    ```bash
    mvn exec:java -Dexec.mainClass="es.alejandrosalazargonzalez.netip.Netip" -Dexec.args="192.168.1.0/24"
    ```

    Para ejecutar en modo VLSM:

    ```bash
    mvn exec:java -Dexec.mainClass="es.alejandrosalazargonzalez.netip.Netip" -Dexec.args="192.168.1.0/24 -vlsm"
    ```

    Para activar el modo debug o exportar a CSV, añade los argumentos correspondientes, por ejemplo:

    ```bash
    mvn exec:java -Dexec.mainClass="es.alejandrosalazargonzalez.netip.Netip" -Dexec.args="192.168.1.0/24 -vlsm -d --csv resultado.csv"
    ```

### **Extras**

La exportación a CSV permite procesar los datos en hojas de cálculo.

El proyecto está diseñado para ser extendido.
