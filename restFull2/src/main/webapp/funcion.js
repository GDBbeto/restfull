$(document).ready(function() {
    $.ajax({
        url: "services/hola/nombre"
    }).then(function(nombre) {        
       $('#nombreU').val(nombre);          
    });
});