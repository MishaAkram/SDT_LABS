from tkinter import *

OPTIONS = ["Light1","Light2"]
OPTIONSS = ["Turn ON","Turn OFF"]
window = Tk()
window.title("Set Pattern for lights")
label1 = Label(window, text="One Device One Operation Method",width=200,font=("bold", 10))
label1.pack()
label1 = Label(window, text="Select Device",width=200,font=("bold", 10))
label1.pack()
var = StringVar(window)
var.set(OPTIONS[0]) # default value
x = OptionMenu(window, var, *OPTIONS)
x.pack()
def go():
    label2 = Label(window, text="Select Operation",width=200,font=("bold", 10))
    label2.pack()
    variable = StringVar(window)
    variable.set(OPTIONSS[0]) # default value

    w = OptionMenu(window, variable, *OPTIONSS)
    w.pack()
    a = var.get()
    
    def ok():
        if a == "Light1":
            value = variable.get()
            if value == "Turn ON":
                label2 = Label(window, text="Status of light1 is made Active",width=200,font=("bold", 10))
                label2.pack()
            elif value == "Turn OFF":
                label2 = Label(window, text="Status of light1 is made NOT Active",width=200,font=("bold", 10))
                label2.pack()
        elif a == "Light2":
            value = variable.get()
            if value == "Turn ON":
                label2 = Label(window, text="Status of light2 is made Active",width=200,font=("bold", 10))
                label2.pack()
            elif value == "Turn OFF":
                label2 = Label(window, text="Status of light2 is made NOT Active",width=200,font=("bold", 10))
                label2.pack()
    button = Button(window, text="OK", command=ok)
    button.pack()
button1 = Button(window, text="OK", command=go)
button1.pack()

window.mainloop()
