from tkinter import *
import time
OPTIONS = ["Alarm1","Alarm2","Alarm3","Alarm4"]
#print ("before")
#time.sleep(3)
#print ("after")
window = Tk()
window.title("Event Based Pattern for Alarms - Pull Information")
label1 = Label(window, text="Select device for time event",width=200,font=("bold", 10))
label1.pack()
var = StringVar(window)
var.set(OPTIONS[0]) # default value
x = OptionMenu(window, var, *OPTIONS)
x.pack()



def go():
    label2 = Label(window, text="Device for time event selected",width=200,font=("bold", 10))
    label2.pack()
    def ok():
        label2 = Label(window, text="time event stopped",width=200,font=("bold", 10))
        label2.pack()
    def ok2():
        print("waiting")
    a = var.get()
    if  a == "Alarm1":
        button = Button(window, text="stop time event", command=ok)
        button.pack()
        
        for i in range(0,10):
            label = Label(window, text="information from Alarm1 retrieved ",width=200,font=("bold", 10))
            label.pack()
            label.after(1000, ok2)
            #time.sleep(10)
            i = i-1
        
    elif a == "Alarm2":
        button = Button(window, text="stop time event", command=ok)
        button.pack()
        
        for i in range(0,10):
            label = Label(window, text="information from Alarm2 retrieved ",width=200,font=("bold", 10))
            label.pack()
            label.after(1000, ok2)
            #time.sleep(10)
            i = i-1
    elif a == "Alarm3":
        button = Button(window, text="stop time event", command=ok)
        button.pack()
        
        for i in range(0,10):
            label = Label(window, text="information from Alarm3 retrieved ",width=200,font=("bold", 10))
            label.pack()
            label.after(1000, ok2)
            #time.sleep(10)
            i = i-1
    elif a == "Alarm4":
        button = Button(window, text="stop time event", command=ok)
        button.pack()
        
        for i in range(0,10):
            label = Label(window, text="information from Alarm4 retrieved ",width=200,font=("bold", 10))
            label.pack()
            label.after(1000, ok2)
            #time.sleep(10)
            i = i-1
button1 = Button(window, text="deviceOK", command=go)
button1.pack()

window.mainloop()
