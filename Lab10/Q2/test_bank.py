# importing the modules
import pytest
from bank import Bank_Account,Current_Account, Saving_Account

class TestBankAccount:
    def test_deposit(self):
        b = Bank_Account(3000)
        print("testing deposit : bank_account")
        assert (3000, 13000) == (b.damount, b.deposit())
    
    def test_withdraw(self):
        b1 = Bank_Account(0, 8000)
        print("testing withdraw : bank_account")
        assert (8000, 2000) == (b1.wamount, b1.withdraw())

    def test_display(self):
        b2 = Bank_Account()
        print("testing display : bank_account")
        assert (10000) == (b2.display())        
        
class TestCurrentAccount:
    def test_wdlimit(self):
        c = Current_Account()
        print("testing wdlimit : current_account")
        assert (90, 9000.0) == (c.withdrawl_limit, c.wdlimit())

class TestSavingAccount:
    def test_min_bal(self):
        s = Saving_Account(10000, 1000)
        print("testing min_bal : saving_account")
        assert (10000, 1000, 10000) == (s.damount, s.wamount, s.min_bal())

    def test_interest(self):
        s = Saving_Account(10000, 1000)
        print("testing interest : saving_account")
        assert (10000, 1000, 4, 400) == (s.damount, s.wamount, s.intRate, s.interest())
