/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author anhng
 */
public class Role {

    private int id;
    private String rolename;
    private int allowance;
    private String AllowanceTime;

    public Role(int id, String rolename, int allowance, String AllowanceTime) {
        this.id = id;
        this.rolename = rolename;
        this.allowance = allowance;
        this.AllowanceTime = AllowanceTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public String getAllowanceTime() {
        return AllowanceTime;
    }

    public void setAllowanceTime(String AllowanceTime) {
        this.AllowanceTime = AllowanceTime;
    }

    @Override
    public String toString() {
        return rolename;
    }
}
