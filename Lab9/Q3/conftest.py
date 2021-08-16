import pytest

@pytest.fixture
def employee_detail( ):
    Id = [3, 13, 23, 33]  
    name = ["Iqra", "Misha", "Firdous", "Mujtaba"]
    des = ["Accounts Head", "Manager", "Executive Assistant", "PA"]
    return Id + name + des
