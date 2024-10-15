# Usar una imagen base con Java 17 preinstalado
FROM eclipse-temurin:17-jdk-jammy

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos de Gradle y configuración de la aplicación
COPY build.gradle settings.gradle /app/
COPY gradle /app/gradle

# Copiar el código fuente
COPY src /app/src

# Descargar las dependencias y compilar el proyecto
RUN ./gradlew build --no-daemon

# Exponer el puerto de la aplicación (8080 es el puerto por defecto en Spring Boot)
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["./gradlew", "bootRun"]
