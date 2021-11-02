/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Admin
 */
public class Academiclevel {

    public Academiclevel(int id, String Academic_name) {
        this.id = id;
        this.Academic_name = Academic_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcademic_name() {
        return Academic_name;
    }

    public void setAcademic_name(String Academic_name) {
        this.Academic_name = Academic_name;
    }
    @Override
    public String toString() {
        return Academic_name ;
    }
    private int id;
    private String Academic_name;
    
}
