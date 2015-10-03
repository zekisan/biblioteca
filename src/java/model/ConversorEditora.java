/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ezequiel
 */
@FacesConverter("editoraConverter")
public class ConversorEditora implements Converter {
    
    private static EditoraDAO editoraDAO = new EditoraDAO();

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return editoraDAO.find(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return ((Editora) value).getId();
    }
    
}
