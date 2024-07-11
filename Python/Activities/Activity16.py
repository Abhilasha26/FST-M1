class Car:

  def __init__(self, manufacturer,model,make,transmission,color):
    self.manufacturer=manufacturer
    self.model=model
    self.make=make
    self.transmission= transmission
    self.color=color

  def accelerate(self):
    print(self.manufacturer +" " + self.model + " is moving")

  def stop(self):
    print(self.manufacturer + " " + self.model + " has stoped")

c1=Car("Honda","vx", 2024,"XYZ","Blue")
c2=Car("Ford","mustang",2023,"ABC","Red")
c3=Car("Hundai","verna",2022,"JKL","Black")
c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()