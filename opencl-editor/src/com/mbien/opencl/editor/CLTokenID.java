/*
 * Created on Monday, August 22 2011 01:44
 */
package com.mbien.opencl.editor;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author mbien
 */
public class CLTokenID implements TokenId {

    private static final Language<CLTokenID> language = new CLLanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public CLTokenID(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }

    @Override
    public int ordinal() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    public static Language<CLTokenID> getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"["+id+", "+name+", "+primaryCategory+"]";
    }


}
