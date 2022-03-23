package com.ug7.ewallet;

public class ShopeePay extends eWallet{
    private int feeTopUp;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(User user){
        super(user);
    }

    public void topup(){
        User.topup();
    }

    public void transfer() {

    }

    public void withdraw() {
        User.withdraw();
    }

    public void getInfo(){
        this.getInfo();
    }
}
