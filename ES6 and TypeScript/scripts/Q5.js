"use strict";
//a)With Default Values
const add = (a = 5, b = 10) => {
    console.log(a, b);
};
console.log(add());
/*b)Write a function userFriends()
that takes 2 arguments username & array of user friends.
The function should print username & his list of friends.
(Use rest parameters)*/
const userFriends = (username, ...Hello) => {
    console.log(Hello);
    console.log(username);
    for (let i in Hello) {
        console.log("List of friends Varun has:" + Hello[i]);
    }
};
let username = "userName is:varun";
userFriends(username, "ayush", "rajat", "lakshay", "rahul", "yukta");
/*c.Write a function printCapitalNames()
that takes five names as argument & prints them in capital letters.
 Use spread operator in order to call printCapitalNames() function.*/
const printCapitalNames = () => {
    for (let i in Names) {
        console.log("Small list is:" + Names[i]);
        let a = Names[i].toLocaleUpperCase();
        console.log("Capital Listis:" + a);
    }
};
let Names = ['ayush', 'rajat', 'lakshay', 'rahul', 'Yukta'];
printCapitalNames(...Names);
