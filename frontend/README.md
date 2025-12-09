# Frontend - Saludador de Nombres

## Descripción
Frontend simple con HTML, CSS y JavaScript que permite al usuario:
1. Ingresar su nombre en un campo de texto
2. Enviar el nombre al backend
3. El backend procesa el nombre (valida que sea minúsculas y una sola palabra)
4. El backend retorna el nombre con la primera letra mayúscula

## Características
- Interfaz moderna y responsiva
- Validación en el cliente
- Comunicación con el backend via API REST
- Manejo de errores
- Soporte para Enter para enviar

## Archivos
- `index.html` - Estructura HTML
- `style.css` - Estilos CSS con diseño moderno
- `script.js` - Lógica de JavaScript y comunicación con el backend

## Cómo usar

### 1. Abrir la página
Abre el archivo `index.html` en un navegador (puedes hacer doble clic en el archivo o arrastrarlo a un navegador)

### 2. Requisitos
- El backend debe estar corriendo en `http://localhost:8080`
- El endpoint esperado es `POST /api/nombre`

### 3. Uso
- Escribe tu nombre en el campo de texto
- Haz clic en "Enviar" o presiona Enter
- Verás el nombre procesado con la primera letra en mayúscula

## Validaciones en el Backend
El backend valida:
- Que el nombre no esté vacío
- Que sea una sola palabra (sin espacios)
- Que contenga solo letras
- Convierte a minúsculas y capitaliza la primera letra

## Mensajes de Error
El frontend muestra errores si:
- El nombre está vacío
- El nombre tiene menos de 2 caracteres
- El nombre contiene espacios
- No hay conexión con el backend
