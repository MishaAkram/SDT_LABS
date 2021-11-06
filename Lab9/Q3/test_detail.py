import pytest

def test_employment_history(employee_detail):
    a = employee_detail
    assert 23 in a[0]

def test_employee_wage(employee_detail):
    a = employee_detail
    b = a[2]
    assert 50000 == b["Manager"]
    assert 45000 == b["Accounts Head"]

def test_employee_incometax(employee_detail):
    a = employee_detail
    b = a[1]
    assert 1000 == b["Mujtaba"]
    assert 1200 == b["Firdous"]

