from tkinter import *

OPTIONS = ["Camera1","Camera2","Light1","Light2"]
GETPattern = ["details of a device","state of a device"]
window = Tk()
window.title("Get Pattern for lights and Cameras")
label1 = Label(window, text="Select GET pattern",width=200,font=("bold", 10))
label1.pack()
var = StringVar(window)
var.set(GETPattern[0]) # default value
x = OptionMenu(window, var, *GETPattern)
x.pack()



def go():
    label2 = Label(window, text="Select Device",width=200,font=("bold", 10))
    label2.pack()
    variable = StringVar(window)
    variable.set(OPTIONS[0]) # default value

    w = OptionMenu(window, variable, *OPTIONS)
    w.pack()
    a = var.get()
    if  a == "details of a device":
        def ok():
            print ("value is:" + variable.get())
            label = Label(window, text="Information Of Device Selected",width=200,font=("bold", 10))
            label.pack()
            value = variable.get()
            if value == "Camera1":
                i = " ID: 1, name: Samsung, description: 1000pixels, and model: 92"
                label_1 = Label(window, text=i,width=200,font=("bold", 10))
                label_1.pack() #lace(x=90,y=90)
            elif value == "Camera2":
                i = " ID: 2, name: Soni, description: 1000pixels, and model: 82"
                label_2 = Label(window, text=i,width=200,font=("bold", 10))
                label_2.pack() #lace(x=90,y=130)
            elif value == "Light1":
                i = " ID: 3, name: Thorax , description: 250V, and model: 23"
                label_3 = Label(window, text=i,width=200,font=("bold", 10))
                label_3.pack()  #lace(x=90,y=180)
            elif value == "Light2":
                i = " ID: 4, name: milestone, description: 250V yellow, and model: 72"
                label_4 = Label(window, text=i,width=200,font=("bold", 10))
                label_4.pack()#lace(x=90,y=230)
    elif a == "state of a device":
        def ok():
            #print ("value is:" + variable.get())
            label = Label(window, text="State Of Device Selected",width=200,font=("bold", 10))
            label.pack()#lace(x=90,y=53)
            value = variable.get()
            if value == "Camera1":
                i = " Active"
                label_1 = Label(window, text=i,width=200,font=("bold", 10))
                label_1.pack()#lace(x=90,y=90)
            elif value == "Camera2":
                i = " NOT Active"
                label_2 = Label(window, text=i,width=200,font=("bold", 10))
                label_2.pack()#lace(x=90,y=130)
            elif value == "Light1":
                i = " Active"
                label_3 = Label(window, text=i,width=200,font=("bold", 10))
                label_3.pack()#lace(x=90,y=180)
            elif value == "Light2":
                i = " NOT Active"
                label_4 = Label(window, text=i,width=200,font=("bold", 10))
                label_4.pack#lace(x=90,y=230)
    button = Button(window, text="OK", command=ok)
    button.pack()
button1 = Button(window, text="stateOK", command=go)
button1.pack()

window.mainloop()
