class Bike:
    def init(self, name, mil, price):
        self.name = name
        self.mileage = mil
        self.price = price
    def getBike(self):
        return {
            "name": self.name,
            "mileage": self.mileage,
            "price": self.price
        }

class Manager:
    def init(self):
        self.bikes = []
    def add_bike(self, name, mil, price):
        bike = Bike(name, mil, price)
        self.bikes.append(bike)
    def show_bike(self, name):
        for bike in self.bikes:
            if bike.name == name:
                print(bike.getBike())
                return
        return None
    def buy_bike(self, bike_name):
    #remove bike from array after puchasing it
        for bike in self.bikes:
            if bike.name == bike_name:
                self.bikes.remove(bike)
                return
    def print_array(self):
        for bike in self.bikes:
            print(bike.getBike())


manager = Manager()
manager.add_bike("classic", 33, "2 lakhs")
manager.add_bike("thunderbird", 35, "3 lakhs")
manager.add_bike("meteor", 30, "3.6 lakhs")
manager.print_array()
manager.show_bike("classic")