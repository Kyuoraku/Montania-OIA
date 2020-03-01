class Punto:

	x = 0
	y = 0

	def __init__(self, x=0, y=0):
		self.x = x
		self.y = y

	def cambiarPunto(self, x, y):
		self.x = x
		self.y = y
	def __str__(self):
		return "["+str(self.x)+";"+str(self.y)+"]"
##################################################
class Carrito:

	posicionInicial = Punto()
	posicionFinal = Punto()

	def __init__(self, posicionInicial = Punto()):
		self.posicionInicial = posicionInicial

	def sumarRecorrido(self, cantidad=Punto()):
		self.posicionFinal.x += cantidad.x
		self.posicionFinal.y += cantidad.y

	def __str__(self):
		return self.posicionFinal
##############################################
class Montana:
	carro = Carrito()
	ruta = ""
	puntos = []
	cantidad_puntos = 0

	def __init__ (self,ruta=""):
		self.ruta = ruta
		self.leerDatos()
		#for punto in self.puntos:
		#	print(punto)

	def leerDatos(self):
		archivo = open(self.ruta)
		self.cantidad_puntos = int(archivo.readline())
		print("Cantidad de puntos: "+str(self.cantidad_puntos))
		flag = False
		ingreso = []
		for punto in range(self.cantidad_puntos):
			ingreso.append(archivo.readline().replace("\n",""))
		#print(ingreso) #muestra los datos de entrada
		archivo.close()
		#termina el ingreso de datos desde el archivo
		#se crean los puntos llamados valle y cima.
		for x in range(self.cantidad_puntos):
			if (x==0):
				aux = Punto(0,++int(ingreso[x]))
				self.puntos.append(aux)
			else:
				anterior = int(ingreso[x-1])
				xAnterior = int(self.puntos[x-1].x)
				diferenciaEY = abs(int(anterior - int(ingreso[x])))
				#aux = Punto(abs(int(ingreso[x])-anterior),int(ingreso[x]))
				aux = Punto(xAnterior + diferenciaEY, int(ingreso[x]))	
				self.puntos.append(aux)
########################################


Prueba0 = Montana("montaña.in")