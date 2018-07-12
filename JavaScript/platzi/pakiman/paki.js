var imagenes = [];
imagenes["Cauchin"] = "images/vaca.png";
imagenes["Pokacho"] = "images/pollo.png";
imagenes["Tocinauro"] = "images/cerdo.png";

var coleccion = [];
coleccion.push(new pakiman("Cauchin", 100, 30));
coleccion.push(new pakiman("Pokacho", 80, 50));
coleccion.push(new pakiman("Tocinauro", 120, 40));

console.log(coleccion);

for (var p of coleccion)
{
  p.mostrar();
}
