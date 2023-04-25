# Laboratorios_PMoviles
1. ¿En qué consiste el patrón de diseño Repository?
R// controla la logica de datos y la logica empresarial. Ayuda con la estraccion de datos. Con un repositorio, puedes intercambiar los detalles de la implementación, como la migración a una biblioteca de persistencia diferente, sin afectar el código de llamada, como los modelos de vista. 

2. ¿Qué es el ViewModel?
R// expone el estado de la UI 
encapsula la lógica empresarial relacionada
almacena en caché el estado y lo conserva
durante los cambios de configuración, esto significa que la IU no tiene que recuperar datos cuando navegas entre
actividades o si sigues cambios de configuración, como cuando rotas la pantalla
