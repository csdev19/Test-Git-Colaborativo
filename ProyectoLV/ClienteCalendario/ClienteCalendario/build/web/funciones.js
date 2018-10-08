//@author FreddyHIQ

/* dice si cadena es texto no vacio o no                                     */
function vacio(cadena)
  {                                    // DECLARACION DE CONSTANTES
    var blanco = " \n\t" + String.fromCharCode(13); // blancos
                                       // DECLARACION DE VARIABLES
    var i;                             // indice en cadena
    var es_vacio;                      // cadena es vacio o no
    for(i = 0, es_vacio = true; (i < cadena.length) && es_vacio; i++) // INICIO
      es_vacio = blanco.indexOf(cadena.charAt(i)) != - 1;
    return(es_vacio);
  }

  function password(cadena1,cadena2){
   if((vacio(cadena1) && vacio(cadena2))){
	return(false);
   }
   else
	  { if(cadena1==cadena2)
	   return(true);
    else
		return(false); }
  }

  function min_len(cadena1,cadena2){
	  
   if(cadena1.length<"5"){
	   //alert("false");
	return(false);
   }
 
   	else{
		  //alert("true");
		return(true); }
  }



/* dice si cadena es url (http://... ) o no                                     */
function url(cadena)
  {                                    // DECLARACION DE CONSTANTES
    var http = "http://";              // protocolo HTTP
                                       // DECLARACION DE VARIABLES
    var es_url;                        // cadena es url o no
    if(cadena.length <= 7)             // INICIO
      es_url = false;                  // no cabe "http://*"
    else
      es_url = http.indexOf(cadena.substring(0, 7)) != - 1; // lee "http://*"
    return(es_url);
  }


/* salta caracteres alfanumericos y otros a partir de  cadena[i]  y  da  si- */
/* guiente posicion                                                          */
function salta_alfanumerico(cadena, i, otros)
  {                                    // DECLARACION DE VARIABLES
    var j;                             // indice en cadena
    var car;                           // caracter de cadena
    var alfanum;                       // cadena[j] es alfanumerico u otros
    for(j = i, alfanum = true; (j < cadena.length) && alfanum; j++) // INICIO
      {
        car = cadena.charAt(j);
        alfanum = alfanumerico(car) || (otros.indexOf(car) != -1);
      }
    if(!alfanum)                       // lee "alfanumX"
      j--;
    return(j);
  }
  
/* dice si car es alfanumerico                                               */
function alfanumerico(car)
  {
    return(alfabetico(car) || numerico(car));
  }


/* dice si car es alfabetico                                                 */
function alfabetico(car)               // DECLARACION DE CONSTANTES
  {                                    // caracteres alfabeticos
    var alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    return(alfa.indexOf(car) != - 1);  // INICIO
  }


/* dice si car es numerico                                                   */
function numerico(car)
  {                                    // DECLARACION DE CONSTANTES
    var num = "0123456789";            // caracteres numericos
    return(num.indexOf(car) != - 1);   // INICIO
  }