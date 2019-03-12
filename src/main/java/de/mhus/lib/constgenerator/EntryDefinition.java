package de.mhus.lib.constgenerator;

import de.mhus.lib.basics.consts.Identifier.TYPE;

public class EntryDefinition {

    public TYPE type;
    public String name;

    public EntryDefinition(TYPE type, String name) {
        this.type = type;
        this.name = name;
    }

}
