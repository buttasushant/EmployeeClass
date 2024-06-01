package org.buttas;

class Employee{

    private int eid;
    private String ename;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public Employee(String ename, int eid){
        this.ename = ename;
        this.eid = eid;
    }



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