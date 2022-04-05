"use strict";
class Account1 {
    constructor(id, name, balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}
class SavingAccount1 extends Account1 {
    constructor(id, name, balance, interest) {
        super(id, name, balance);
        this.interest = interest;
    }
    getBalance() {
        this.totalBalance = 0;
        this.totalBalance = this.balance + (this.balance * this.interest);
        return this.totalBalance;
    }
}
class CurrentAccount1 extends Account1 {
    constructor(id, name, balance, cash_credit) {
        super(id, name, balance);
        this.cash_credit = cash_credit;
    }
    getBalance() {
        this.totalBalance = 0;
        this.totalBalance = this.balance - this.cash_credit;
        return this.totalBalance;
    }
}
let SavingAccountObj = new SavingAccount1(11, "john", 1500, 10);
console.log(SavingAccountObj.getBalance());
let CurrentAccountObj = new CurrentAccount1(11, "jack", 15000, 500);
console.log(CurrentAccountObj.getBalance());
