# Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
# 55% del promedio de sus tres calificaciones parciales.
# 30% de la calificación del examen final.
# 15% de la calificación de un trabajo final.

nota_parcial1 = int(input('Ingrese el valor de su nota parcial 1 : '))
nota_parcial2 = int(input('Ingrese el valor de su nota parcial 2 : '))
nota_parcial3 = int(input('Ingrese el valor de su nota parcial 3 : '))
nota_examen_final = int(input('Ingrese el valor de su nota examen final : '))
nota_trabajo_final = int(input('Ingrese el valor de su nota trabajo final : '))

promedio_notas_parciales = (nota_parcial1 + nota_parcial2 + nota_parcial3) * 0.55
print(promedio_notas_parciales)
promedio_examen_final = nota_examen_final * .30
promedio_trabajo_final = nota_trabajo_final * .15

nota_final = (promedio_notas_parciales + promedio_examen_final + promedio_trabajo_final)

print('Su nota final es ' + str(nota_final))