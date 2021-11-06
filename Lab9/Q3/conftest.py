import pytest

@pytest.fixture
def employee_detail( ):
    Id = [3, 13, 23, 33]  
    name = {"Iqra":1400, "Misha":1100, "Firdous":1200, "Mujtaba":1000}
    des = {"Manager":50000, "Accounts Head":45000, "Executive Assistant":40000}
    return Id, name, des



