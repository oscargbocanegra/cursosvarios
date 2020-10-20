lista1 = [1,2,3,4,5]
print(lista1)

print('lista con mas')
lista1 + [5,6,7]
print(lista1)

print("lista con igual mas ")
lista1 = lista1 + [5,6,7]
print(lista1)

print("lista por N ")
lista1 * 3
print(lista1)

print("lista con append ")
lista1.append(8)
print(lista1)

print("lista con string ")
lista1.append('oscar')
print(lista1)

print("lista lista interna")
lista1.append([9,8,7])
print(lista1)

print("lista extend")
lista1.extend ([10,11])
print(lista1)

print("lista removiendo campo")
lista1.remove (5)
print(lista1)

print("Imprimir lista campo a campo")
lista1 = list ("oscar")
print(lista1)

print("Cadena de texto con split")
lista1 = "oscar giovanni bocanegra"
lista1.split()
print(lista1)

print("Metodo spit con delimitador coma")
comida_favorita = "lasagna, spagueti, pizza"
print(comida_favorita)
comida_favorita.split(",")
print(comida_favorita)

print("Metodo Join ")
comida_favorita2 = ['lasagna', 'spagueti', 'pizza']
print(comida_favorita2)
r = "-".join(comida_favorita2)
print(r)



