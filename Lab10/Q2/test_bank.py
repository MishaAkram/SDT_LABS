# importing the modules
import pytest
from bank import Bank_Account,Current_Account, Saving_Account

class TestBankAccount:
    def test_deposit(self):
        b = Bank_Account(3000)
        print("testing deposit : bank_account")
        assert (3000, 13000) == (b.damount, b.deposit())
    
    def test_withdraw(self):
        b1 = Bank_Account(3000, 8000)
        print("testing withdraw : bank_account")
        assert (3000, 5000) == (b1.damount, b1.withdraw())

    def test_display(self):
        b2 = Bank_Account(5000, 2500)
        print("testing display : bank_account")
        assert (5000, 2500, 12500) == (b2.damount, b2.wamount, b2.display())        
        
class TestCurrentAccount:
    def test_wdlimit(self):
        c = Current_Account(5000, 10000)
        print("testing wdlimit : current_account")
        assert (5000, 10000, 90, 12600) == (c.damount, c.wamount, c.withdrawl_limit, c.wdlimit())

class TestSavingAccount:
    def test_min_bal(self):
        s = Saving_Account(10000, 1000)
        print("testing min_bal : saving_account")
        assert (10000, 1000, 10000) == (s.damount, s.wamount, s.min_bal())

    def test_interest(self):
        s = Saving_Account(10000, 1000)
        print("testing interest : saving_account")
        assert (10000, 1000, 4, 400) == (s.damount, s.wamount, s.intRate, s.interest())
