# base class
class Employee:
    Id = ""
    name = ""
    designation = ""
    def __init__(self):
        print("super class Employee")

    def getSalary():
        print("Salary")
        pass

# derived class 1
class Manager(Employee):
    sal = 60000
    overtime = 0
    def __init__(self, Id, name, designation, overtime):
        self.Id = Id
        self.name = name
        self.designation = designation
        self.overtime = overtime

    def printDetails(self):
        print("Id : " + str(self.Id))
        print("name : " + self.name)
        print("designation : " + self.designation)
        print("overtime : " + str(self.overtime) + " hours")
        print("salary : Rs." + str(self.sal))

    def getSalary(self):
        netsal = self.sal + self.overtime*500
        return netsal

# derived class 2
class Team_Lead(Employee):    
    sal = 50000
    overtime = 0
    def __init__(self, Id, name, designation, overtime):
        self.Id = Id
        self.name = name
        self.designation = designation
        self.overtime = overtime

    def printDetails(self):
        print("Id : " + str(self.Id))
        print("name : " + self.name)
        print("designation : " + self.designation)
        print("overtime : " + str(self.overtime) + " hours")
        print("salary : Rs." + str(self.sal))

    def getSalary(self):
        netsal = self.sal + self.overtime*500
        return netsal

# derived class 3
class Clerk(Employee):    
    sal = 30000
    overtime = 0
    def __init__(self, Id, name, designation, overtime):
        self.Id = Id
        self.name = name
        self.designation = designation
        self.overtime = overtime

    def printDetails(self):
        print("Id : " + str(self.Id))
        print("name : " + self.name)
        print("designation : " + self.designation)
        print("overtime : " + str(self.overtime) + " hours")
        print("salary : Rs." + str(self.sal))

    def getSalary(self):
        netsal = self.sal + self.overtime*500
        return netsal

def main():
    m = Manager(1, 'Iqra', 'Manager', 3)
    m.printDetails()
    print(m.name + " have NetSalary Rs." + str(m.getSalary()))

    e = Employee()
    t = Team_Lead(2, 'Misha', 'Team Lead', 5)
    t.printDetails()
    print(t.name + " have NetSalary Rs." + str(t.getSalary()))
    c = Clerk(5, 'Ahsan', 'Clerk', 6)
    c.printDetails()
    print(c.name + " have NetSalary Rs." + str(c.getSalary()))
    print("done till here")

if __name__ == '__main__':
    main()



