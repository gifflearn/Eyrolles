package exo.chap05_heritage;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
 
public class tete {
    private Path path = null        ;
    private String filter = "*"     ;
    private long result = 0         ;
    public tete()  {
    }
    public tete(Path p, String f)  {
        path = p        ;
        filter = f      ;
    }
    /**
     *
     * @return
     * @throws ScanException
     */
    public long sequentialScan() throws ScanException   {
        if(path == null || path.equals(""))
            throw new ScanException("Chemin � scanner non valide " +
                    "(vide ou nul) !")          ;
        System.out.println("Scan du dossier : " + path + " � la " +
                "recherche des fichiers portant l'extension " +
                this.filter)                    ;
        try(DirectoryStream<Path> listing =
            Files.newDirectoryStream(path)) {
            for(Path nom : listing) {
                if(Files.isDirectory(nom.toAbsolutePath())) {
                    tete f = new
                    tete(nom.toAbsolutePath(),
                            this.filter)        ;
                    result += f.sequentialScan()        ;
                }
            }
        }   catch(IOException e)    {e.printStackTrace();   }
        try(DirectoryStream<Path> listing =
            Files.newDirectoryStream(path, this.filter))    {
            for(Path nom : listing) {
                result++                ;
            }
        }   catch(IOException e)    {e.printStackTrace();   }
        return result; 
    }
}

