import java.io.File;

public class RenombrarDirectorios {
    public void renombrarDir(String path) {
        // validar que path sea directorio
        File directorio = new File(path);
        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("La ruta path no es un directorio valido");
            return;
        }
        renombrarDirectoriosInternos(directorio);
    }

    public void renombrarDirectoriosInternos(File directorio) {
        // Listar todos los archivos o carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if (directoriosArchivosInternos == null) {
            return;
        }
        for (File directorioArchivo : directoriosArchivosInternos) {
            if (directorioArchivo.isDirectory()) {// si es carpeta camno el nombre
                String nombreOriginal = directorioArchivo.getName();
                String nuevoNombre = "Nueva_Carpeta" + nombreOriginal;
                File nuevoDirectorio=new File (directorioArchivo.getParent(),nuevoNombre);
                if(directorioArchivo.renameTo(nuevoDirectorio)){
                    renombrarDirectoriosInternos(nuevoDirectorio);
                }
            }
        }
    }
}
