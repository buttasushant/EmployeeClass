package org.buttas;

class Employee{

    public Employee(String ename, int eid){
        this.ename = ename;
        this.eid = eid;
    }

    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }




}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Sushant",1);
        //e.setEid(1);
       // e.setEname("Sushant");

        System.out.println(e.getEid());
        System.out.println(e.getEname());
    }
}