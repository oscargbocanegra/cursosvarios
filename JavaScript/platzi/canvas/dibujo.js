var d = document.getElementById("dibujito");
var texto = document.getElementById("texto_lineas");
var boton = document.getElementById("botoncito");
boton.addEventListener("click",dibujoPorClic);
var ancho = d.width;
var lienzo = d.getContext("2d");

function dibujarLinea (color, xinicial, yinicial, xfinal, yfinal)
{
  lienzo.beginPath();
  lienzo.strokeStyle = color;
  lienzo.moveTo(xinicial, yinicial);
  lienzo.lineTo(xfinal, yfinal);
  lienzo.stroke();
  lienzo.closePath();
}

function dibujoPorClic()
{
  var x = parseInt(texto.value);
  var lineas = x;
  var l = 0;
  var yi, xf;
  var colorborde = "blue";
  var espacio = ancho / lineas;

  while (l < lineas)
  {
    yi = espacio * l;
    xf = espacio * (l + 1);
    dibujarLinea(colorborde, 0, yi, xf, 300);
    //dibujarLinea("red", 300, yi, xf, 0);
    l++;
  }

  dibujarLinea (colorborde, 1, 1, 1, 299);
  dibujarLinea (colorborde, 1, 300, 299, 299);
}
