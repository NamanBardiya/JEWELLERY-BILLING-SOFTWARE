class Customer:
    def __init__(self, name, address, contact):
        self.name = name
        self.address = address
        self.contact = contact

    def get_name(self):
        return self.name

    def get_address(self):
        return self.address

    def get_contact(self):
        return self.contact

    def set_name(self, x):
        self.name = x

    def set_address(self, y):
        self.address = y

    def set_contact(self, z):
        self.contact = z


