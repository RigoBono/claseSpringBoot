


function sendToServer(){

    var nombre=$("#nombre").val();
    var paterno=$("#paterno").val();
    var materno=$("#materno").val();

    try{
        $.post(
            "/persona/create.gen",
            {
                nombre:nombre,
                paterno:paterno,
                materno:materno
            },function(data){
                alert("se guardo "+data.nombre);
            }

            );
    }catch(ex){
        alert("algo fallo :( ");
    }



}