# importing the modules
import pytest
from product import Snack, Staples, Beverage
from datetime import date

class TestSnack:
# test case for printing details of Snack
    def test_details(self):
        s = Snack('chips' , 50)
        print("testing details : snack")
        assert ('chips' , 50, 6) == (s.name, s.price, s.shelfLife)
# test case for calculating expiry date of Snack
    def test_expDate(self):
        s = Snack('wafers', 40)
        print("testing expiry date : snack")
        expdate = s.getExpDate(date(2019, 10, 3))
        assert expdate == date(2020, 4, 3)

class TestStaple:
# test case for printing details of Staples
    def test_details(self):
        st = Staples('rice' , 300)
        print("testing details : staples")
        assert ('rice' , 300, 1) == (st.name, st.price, st.shelfLife)
# test case for calculating expiry date of Staples
    def test_expDate(self):
        st = Staples('wheat flour', 400)
        print("testing expiry date : staples")
        expdate = st.getExpDate(date(2020, 1, 23))
        assert expdate == date(2021, 1, 23)

class TestBeverage:
# test case for printing details of Beverage
    def test_details(self):
        b = Beverage('coffee' , 250)
        print("testing details : beverage")
        assert ('coffee' , 250, 2) == (b.name, b.price, b.shelfLife)
# test case for calculating expiry date of Beverage
    def test_expDate(self):
        b = Beverage('green tea', 400)
        print("testing expiry date : beverage")
        expdate = b.getExpDate(date(2018, 12, 17))
        assert expdate == date(2020, 12, 17)
