"use strict";
/*a)Suppose there is a javascript array with 4 elements.
 Print the value of 3rd element using array matching.*/
let arr = ["varun", "ayush", "rajat", "lakshay"];
let [va, ay, ra, la] = arr;
console.log("value of 3rd element is " + ra);
/*b.Create an organization object having
attributes name, address.
 Write a program to retrieve pin code of an address
 using object deep matching.*/
let pinCode = 110047;
let organization = {
    name: "varun",
    address: "Aya Nagar",
    pinCode
};
console.log("Pincode is " + pinCode);
