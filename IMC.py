import math
peso=float(input('Introduzca su peso '))
estatura=float(input('Introduzca su estatura en metros '))

a=math.pow(estatura, 2)
imc=peso/a
imcRedondeado=round(imc,2)
print('Su IMC es de: '+str(imcRedondeado))




