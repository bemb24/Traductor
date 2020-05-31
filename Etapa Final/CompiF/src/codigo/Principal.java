/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author bonni
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/Lexer.flex";
        String ruta2 = "C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/Lexercup.flex";
        String[] rutas = {"-parser", "Sintax", "C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/Sintax.cup"};
        generarLexer(ruta1, ruta2, rutas);
    }
    
    public static void generarLexer(String ruta1, String ruta2, String[] rutas) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main (rutas);
        
        Path rutaSym = Paths.get("C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/sym.java");
        if (Files.exists(rutaSym))
        {
            Files.delete(rutaSym);
        }
        Files.move( Paths.get("C:/Users/bonni/Documents/NetBeansProjects/CompiF/sym.java"), 
        Paths.get("C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/sym.java"));
        
        Path rutaSin = Paths.get("C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/Sintax.java");
        if (Files.exists(rutaSin))
        {
            Files.delete(rutaSin);
        }
        Files.move( Paths.get("C:/Users/bonni/Documents/NetBeansProjects/CompiF/Sintax.java"), 
        Paths.get("C:/Users/bonni/Documents/NetBeansProjects/CompiF/src/codigo/Sintax.java"));
        
    }
    
}
