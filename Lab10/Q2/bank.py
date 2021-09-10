# Python program to create Bankaccount class
# with both a deposit() and a withdraw() function
class Bank_Account:
    def __init__(self, damount=0, wamount=0):
        self.balance=[10000]
        self.damount=damount
        self.wamount=wamount
        
    def deposit(self):
        self.bal = self.balance[-1] + self.damount
        self.balance.append(self.bal)        
        print("Amount Deposited:",self.damount)
        return (self.bal)

    def withdraw(self):
        if self.balance[-1]>=self.wamount:
            self.bal = self.balance[-1] - self.wamount
            self.balance.append(self.bal)        
            print("You Withdrew:", self.wamount, self.balance, self.bal)
            return (self.bal)
        else:
            print("Insufficient balance ")

    def display(self):
        self.cbal = self.balance[-1]
        print("Current Balance=", self.cbal)
        return (self.cbal)

class Current_Account(Bank_Account):
    withdrawl_limit=90
    def wdlimit(self):
        self.limit=(self.balance[-1]*self.withdrawl_limit)/100
        print("wdlimit : " + str(self.limit))
        return (self.limit)

class Saving_Account(Bank_Account):
    intRate = 4
    def min_bal(self):
        return min(self.balance)

    def interest(self):
        return (min(self.balance)*4)/100
               
def main():
    q=Bank_Account(3000)
    q.deposit()
    s = Bank_Account(3000,8000)
    s.deposit()
    s.withdraw()
    s.display()

    print("\nCurrent Account")
    c = Current_Account(5000,1000)
    c.deposit()
    c.withdraw()
    c.display()
    c.wdlimit()
    
    print("\nSaving Account")
    s = Saving_Account(10000,1000)
    s.deposit()
    s.withdraw()
    s.display()
    print("Minimum Balance " + str(s.min_bal()))
    print("Interest Amount " + str(s.interest()))

if __name__ == '__main__':
    main()





