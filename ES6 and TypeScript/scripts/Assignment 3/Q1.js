"use strict";
var promise1 = new Promise(function (resolve, reject) {
    let x = 2;
    if (x != 0) {
        resolve(x);
    }
    else {
        reject("x value is 0");
    }
});
var promise2 = new Promise(function (resolve, reject) {
    let y = 5;
    if (y != 0) {
        resolve(y);
    }
    else {
        reject("y value is 0");
    }
});
