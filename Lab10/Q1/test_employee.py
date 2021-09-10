import pytest
from employee import Manager, Team_Lead, Clerk

class TestManager:
# test case for printing details of Manager
    def test_details(self):
        m = Manager(1, 'Iqra', 'manager', 3)
        print("testing details : manager")
        assert (1, 'Iqra' , 'manager', 3, 60000) == (m.Id, m.name, m.designation, m.overtime, m.sal)
# test case for calculating Salary of manager
    def test_Salary(self):
        m = Manager(2,'Firdous', 'Manager', 14)
        print("testing salary : manager")
        netsal = m.getSalary()
        assert netsal == 67000

class TestTeam_Lead:
    def test_details(self):
        t = Team_Lead(2, 'Misha', 'team_lead', 5)
        print("testing details : team_lead")
        assert (2, 'Misha' , 'team_lead', 5, 50000) == (t.Id, t.name, t.designation, t.overtime, t.sal)
    def test_Salary(self):
        t = Team_Lead(5,'Mujtuba', 'team_lead', 0)
        print("testing salary : team_lead")
        netsal = t.getSalary()
        assert netsal == 50000

class TestClerk:
    def test_details(self):
        c = Clerk(6, 'Ahsan', 'clerk', 6)
        print("testing details : clerk")
        assert (6, 'Ahsan' , 'clerk', 6, 30000) == (c.Id, c.name, c.designation, c.overtime, c.sal)
    def test_Salary(self):
        c = Clerk(3,'Sajid', 'clerk', 16)
        print("testing salary : clerk")
        netsal = c.getSalary()
        assert netsal == 38000

