# 📚 Aprendiendo Java

Repositorio educativo con ejercicios de Programación Orientada a Objetos (POO) y Estructuras de Datos en Java.

## 📋 Contenido

### 🔷 Programación Orientada a Objetos (`poo/`)
- **abstraccion/** - Concepto de abstracción (Figuras, Rectángulos)
- **claseanimal/** - Herencia y Polimorfismo (Mascota, Perro, Gato)
- **repasojava/** - 7 Ejercicios de repaso general (1-7)
- **sanatorio/** - Sistema multicapa con especialidades (Pediatría, Clínica, Nutrición)
- **selvamisionera/** - Gestión de vehículos y destinos
- **sistemadealumnos/** - Registro y gestión de alumnos

### 📊 Estructuras de Datos (`estructuradatos/`)
- **trabajopractico1/** - 7 Ejercicios básicos (Arrays, búsqueda, ordenamiento)
- **trabajopractico2/** - Proyecto Cine (GUI con reserva de asientos)
- **trabajopractico3/** - Collections (ArrayList, HashMap, HashSet)
- **agendaelectronica/** - Aplicación de agenda
- **sistematurnos/** - Sistema de turnos médicos

## 🚀 Inicio Rápido

### Requisitos
- **Java:** OpenJDK 21.0.10 LTS (o superior)
- **Maven:** 3.9.15 (incluido en PATH)
- **VS Code:** Con Extension Pack for Java

### Instalación

1. **Clonar/Abrir el proyecto:**
   ```bash
   cd c:\Projects\Aprendiendo Java
   ```

2. **Compilar:**
   ```bash
   mvn clean compile
   ```

3. **Ejecutar (opción 1 - Desde VS Code):**
   - Abrir el archivo `src/main/java/poo/sanatorio/Main.java`
   - Botón Play arriba derecha → Seleccionar configuración
   - O presionar `F5` para debug

4. **Ejecutar (opción 2 - Desde Terminal):**
   ```bash
   mvn -Dexec.mainClass=poo.sanatorio.Main exec:java
   ```

## 📖 Uso de Tasks (VS Code)

Presionar `Ctrl+Shift+B` para ver tareas disponibles:

| Task | Comando |
|------|---------|
| **Maven: Clean Compile** | Compila el proyecto (por defecto) |
| **Maven: Package** | Crea JAR ejecutable |
| **Maven: Install** | Instala en repositorio local |
| **Maven: Run sanatorio.Main** | Ejecuta la clase de ejemplo |

## 🎯 Ejecutar Diferentes Clases

### Desde VS Code (Botón Play)
1. Abrir la clase deseada
2. Seleccionar la configuración en el panel "Run and Debug"
3. Pulsar Play o `F5`

### Desde Terminal
```bash
# Reemplazar "poo.sanatorio.Main" con la clase deseada
mvn -Dexec.mainClass=poo.sanatorio.Main exec:java
```

### Clases Principales Disponibles
- `poo.sanatorio.Main` - Sistema de sanatorio
- `poo.claseanimal.Main` - Mascotas (herencia)
- `poo.selvamisionera.Main` - Vehículos
- `poo.abstraccion.Main` - Calculadora de rectángulos
- `poo.sistemadealumnos.Principal` - Registro de alumnos
- `poo.repasojava.Ejercicio1-7` - Ejercicios variados
- `estructuradatos.trabajopractico2.CineApp` - Aplicación GUI

## 🔧 Configuración VS Code

### Extensiones Recomendadas
El proyecto incluye `extensions.json` con extensiones sugeridas:
- **Language Support for Java** (Red Hat)
- **Extension Pack for Java**
- **Maven for Java**
- **Debugger for Java**

**Instalar automáticamente:** VS Code sugiere instalar las recomendadas.

### Settings Personalizados
Archivo: `.vscode/settings.json`
- Formatting automático con Red Hat Java
- Organización de imports
- Hints de parámetros

## 🧪 Debugging

### Breakpoints
1. Hacer click en el número de línea
2. Ejecutar con `F5`
3. El código se pausará en el breakpoint

### Inspeccionar Variables
- **Hover:** Pasar mouse sobre variable
- **Watch:** Panel "Debug" → Variables/Watch

## 📦 Dependencias

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.38</version>
</dependency>
```

**Lombok** - Reduce boilerplate con anotaciones `@Getter`, `@Setter`, etc.

## 🏗️ Estructura de Compilación

```
src/main/java/          → Código fuente
target/classes/         → Clases compiladas
target/generated-sources/ → Código generado por anotaciones
.vscode/
  ├── launch.json       → Configuraciones de ejecución (21 entrypoints)
  ├── settings.json     → Configuración VS Code
  ├── tasks.json        → Tareas automatizadas
  └── extensions.json   → Extensiones recomendadas
pom.xml                 → Configuración Maven
AUDITORIA_VSCODE.md     → Informe de auditoría del entorno
```

## 🎓 Descripción de Proyectos

### POO - Sanatorio (`poo.sanatorio`)
Sistema de gestión hospitalaria con tres departamentos:
- **Administración:** Cobertura médica, descuentos
- **Nutrición:** Dietas según tipo de paciente
- **Clínica:** Receptas y análisis de sangre

Tipos de pacientes: Pediátrico, Adulto, Internado

### Estructuras de Datos - Cine (`trabajopractico2`)
Aplicación GUI de reserva de asientos en cine:
- Matriz 10x10 de asientos
- Reserva por cliente
- Cancelación de reservas
- Visualización de sala

## ⚡ Comandos Útiles

```bash
# Compilar
mvn clean compile

# Compilar + Tests
mvn clean test

# Crear JAR
mvn clean package

# Ejecutar clase específica
mvn -Dexec.mainClass=com.example.Main exec:java

# Ver dependencias
mvn dependency:tree

# Limpiar caché
mvn clean
```

## 🆘 Troubleshooting

### Error: "Class not found"
✅ Usar `mvn -Dexec.mainClass=poo.sanatorio.Main exec:java`
✅ O usar botón Play en VS Code (launch.json configurado)

### Error: Maven no encontrado
✅ Maven está en: `C:\ProgramData\chocolatey\lib\maven\apache-maven-3.9.15\bin`
✅ Ya está en PATH del sistema

### Error: Java 21 no disponible
✅ Verificar: `java -version`
✅ Requerido: OpenJDK 21.0.10 LTS

## 📝 Notas

- Este es un proyecto educativo con múltiples "subproyectos"
- Cada carpeta en `poo/` y `estructuradatos/` puede considerarse independiente
- Todos comparten la misma compilación y Maven
- Las configuraciones de VS Code permiten ejecutar cualquier main fácilmente

## 🔗 Links Útiles

- [Java Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Maven Official Site](https://maven.apache.org/)
- [VS Code Java Docs](https://code.visualstudio.com/docs/languages/java)

---

**Última actualización:** 6 de Mayo de 2026  
**Estado:** ✅ Funcional y Documentado
