class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cash_five = 0, cash_ten = 0;
        for(int i=0; i<bills.length; ++i) {
            switch(bills[i]) {
                case 5:
                    cash_five += 1;
                    break;
                case 10:
                    if(cash_five >= 1) {
                        cash_five -= 1;
                        cash_ten += 1;
                    }
                    else return false;
                    break;
                case 20:
                    if(cash_five >= 1 && cash_ten >= 1) {
                        cash_five -= 1;
                        cash_ten -= 1;
                    }
                    else if(cash_five >= 3) {
                        cash_five -= 3;
                    }
                    else return false;
                    break;
            }
        }
        return true;
    }
}