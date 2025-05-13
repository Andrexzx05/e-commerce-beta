function evaluarFormulario() {
  const respuestas = [
    document.getElementById("p1").value.toLowerCase(),
    document.getElementById("p2").value.toLowerCase(),
    document.getElementById("p3").value.toLowerCase(),
    document.getElementById("p4").value.toLowerCase(),
    document.getElementById("p5").value.toLowerCase()
  ];
  
  let puntaje = 0;
  if (respuestas[0].includes("150")) puntaje++;
  if (respuestas[1].includes("gran canal")) puntaje++;
  if (respuestas[2].includes("góndola") || respuestas[2].includes("barco")) puntaje++;
  if (respuestas[3].includes("3.8")) puntaje++;
  if (respuestas[4].includes("sur")) puntaje++;

  document.getElementById("resultado").innerText = "Tu nota es: " + (puntaje * 2) + "/10";
  return false; // evita que se recargue la página
}