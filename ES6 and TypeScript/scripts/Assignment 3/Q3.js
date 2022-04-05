"use strict";
class Circle {
    constructor(radius) {
        this.radius = radius;
    }
    print() {
        return "The radius of Cicle is " + this.radius + "\nArea is " + (Math.PI * this.radius * this.radius);
    }
}
class Employee {
    constructor(ename, eid, edesignatio) {
        this.eid = eid;
        this.ename = ename;
        this.edesignatio = edesignatio;
    }
    print() {
        return "Employee Details:\n" + "Employee Id:" + this.eid + "\n" + "Employee Name: " + this.ename
            + "\n" + "Employee Designation: " + this.edesignatio;
    }
}
function printAll(obj1, obj2) {
    console.log(obj1.print());
    console.log(obj2.print());
}
let circleObj = new Circle(2);
let employeeObj = new Employee("john", 11, "jr analyst");
printAll(circleObj, employeeObj);
