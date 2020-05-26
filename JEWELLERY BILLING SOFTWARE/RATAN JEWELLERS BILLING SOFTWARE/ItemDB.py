import Item
from Item import gitem
from Item import sitem
#import try1


class ItemmDB:
    itmlist = []

    def __init__(self):
        # itm=Item.Itemm()

        self.itmlist.append(gitem(1, "GOLD BANGLES", 60, 125,0))
        self.itmlist.append(gitem(2, "GOLD EAR RING", 5.5, 130,0))
        self.itmlist.append(gitem(3, "GOLD NOSE PIN", 2.5, 115,0))
        self.itmlist.append(gitem(4, "GOLD BELLY CHAIN", 215, 125,0))
        self.itmlist.append(gitem(5, "GOLD MANGALSUTRA", 10, 130,0))
        self.itmlist.append(gitem(6, "GOLD PAYAL", 16, 140,0))
        self.itmlist.append(gitem(7, "GOLD HAIR JWLRY", 20, 130,0))
        self.itmlist.append(gitem(8, "GOLD NECKLACE", 180, 170,0))
        self.itmlist.append(gitem(9, "GOLD RING", 7, 120,0))

        self.itmlist.append(sitem(10, "SILVER BANGALS", 60, 60,0))
        self.itmlist.append(sitem(11, "SILVER EAR RINGS", 5.5, 75,0))
        self.itmlist.append(sitem(12, "SILVER NECKLACE SET", 250, 130,0))
        self.itmlist.append(sitem(13, "SILVER CHAIN", 20, 100,0))
        self.itmlist.append(sitem(14, "SILVER SCRIPTURES", 100, 170,0))
        self.itmlist.append(sitem(15, "SILVER PAYAL", 16, 120,0))
        self.itmlist.append(sitem(16, "SILVER BRACELET", 15, 100,0))
        self.itmlist.append(sitem(17, "SILVER TOE RING", 5, 30,0))
        self.itmlist.append(sitem(18, "SILVER RING", 7, 100,0))













