class gitem:
    igst = 0.03
    #Gprice=0
    def __init__(self, ino, iname, iwgt, imcharge,Gprice):
        self.ino = ino
        self.iname = iname
        self.iwgt = iwgt
        self.imcharge = imcharge
        self.Gprice=Gprice
        price = (iwgt * self.Gprice) + (iwgt * imcharge)
        self.iprice = price + (price * self.igst)

    def get_ino(self):
        return self.ino

    def get_Gprice(self):
        return self.Gprice

    def get_iname(self):
        return self.iname

    def get_iwgt(self):
        return self.iwgt

    def get_imcharge(self):
        return self.imcharge

    def get_iprice(self):
        return self.iprice

    def set_ino(self, x):
        self.ino = x

    def set_iname(self, y):
        self.iname = y

    def set_iwgt(self, z):
        self.iwgt = z

    def set_imcharge(self, w):
        self.imcharge = w

    def set_iprice(self, v):
        self.iprice = v

    def set_Gprice(self,k):
        self.Gprice=k

    def __str__(self):
        return "item number: {}\nitem name: {}\nitem weight (grams): {}\nmaking charges per gram: {}\ngold price per gram: {}\nitem price: {}\n".format(
            self.ino, self.iname, self.iwgt, self.imcharge, self.Gprice, self.iprice)



class sitem:
    igst = 0.03
    def __init__(self, ino, iname, iwgt, imcharge,Sprice):
        self.ino = ino
        self.iname = iname
        self.iwgt = iwgt
        self.imcharge = imcharge
        self.Sprice= Sprice
        price = (iwgt * self.Sprice) + (iwgt * imcharge)
        self.iprice = price + (price * self.igst)

    def get_ino(self):
        return self.ino

    def get_iname(self):
        return self.iname

    def get_iwgt(self):
        return self.iwgt

    def get_imcharge(self):
        return self.imcharge

    def get_iprice(self):
        return self.iprice

    def get_Sprice(self):
        return self.Sprice

    def set_ino(self, x):
        self.ino = x

    def set_iname(self, y):
        self.iname = y

    def set_iwgt(self, z):
        self.iwgt = z

    def set_imcharge(self, w):
        self.imcharge = w

    def set_iprice(self, v):
        self.iprice = v

    def set_Sprice(self,f):
        self.Sprice=f

    def __str__(self):
        return "item number: {}\nitem name: {}\nitem weight (grams): {}\nmaking charges per grams: {}\nsilver price per gram: {}\nitem price: {}\n".format(
            self.ino, self.iname, self.iwgt, self.imcharge, self.Sprice, self.iprice)






