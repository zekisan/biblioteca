/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ezequiel
 */
public class EditoraDAO {
    
    private static Map<String, Editora> editoraMap;
    
    static { carregaEditoraMap(); };
    
    public Editora find(String id){
        return editoraMap.get(id);
    }
    
    public ArrayList<Editora> list() {
        return new ArrayList<Editora>(editoraMap.values());
    }

    public Map<String, Editora> map() {
        return editoraMap;
    }
    
    private static void carregaEditoraMap() {
        // This is just a fake database. We're using LinkedHashMap as it maintains the ordering.
        editoraMap = new LinkedHashMap<String, Editora>();
        editoraMap.put("1", new Editora("1", "Apress"));
        editoraMap.put("2", new Editora("2" ,"Hello World"));
    }
}
