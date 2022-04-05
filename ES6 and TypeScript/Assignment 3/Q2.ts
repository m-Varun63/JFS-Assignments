class Account1{
    id:number;
    name:string;
    balance:number;
   constructor(id:number,name:string,balance:number){
       this.id=id;
       this.name= name;
       this.balance = balance;
   }
}

class SavingAccount1 extends Account1{
   interest:number;
   totalBalance:number;
  constructor(id:number,name:string,balance:number,interest:number){
         super(id,name,balance)
         this.interest  = interest;
  }
  getBalance(){
      this.totalBalance=0;
      this.totalBalance = this.balance + (this.balance*this.interest);
      return this.totalBalance;
  }
}

class CurrentAccount1 extends Account1{
   cash_credit:number;
   totalBalance:number;
  constructor(id:number,name:string,balance:number,cash_credit:number){
         super(id,name,balance);
         this.cash_credit  = cash_credit;
  }
  getBalance(){
      this.totalBalance=0;
      this.totalBalance = this.balance -this.cash_credit;
      return this.totalBalance;
  }
}

let SavingAccountObj = new SavingAccount1(11,"john",1500,10);
console.log(SavingAccountObj.getBalance())

let CurrentAccountObj = new CurrentAccount1(11,"jack",15000,500);
console.log(CurrentAccountObj.getBalance())