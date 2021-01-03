package com.sparks.design.entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends BaseEntity<String>{
    private List<Table> tables = new ArrayList<Table>();

    public Restaurant(String name, String id, List<Table> tables){
        super(id, name);
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString(){
        return new StringBuilder("{ id: ").append(id).append(", name: ").append(name).append(", tables:")
                .append(tables).append("}").toString();
    }
}
