$(document).ready(function(){
	
	$('#register').on('submit',function(event){
		 event.preventDefault();
		 
		 let form = new FormData(this);
		 
		 $.ajax({
			
			url:'registerUser',
			type:'POST',
			data:form,
			success : function(data, textStatus,jqXHR){
				if(data.trim()==='Please accepts terms and conditions !!!'){
					swal("Alert !!",data,"info");
				}
				else{
					swal("Success !!",data,"success").then((value)=>{
						window.location="login.jsp";
					});
				}
				
			},
			error:function(jqXHR,textStatus,errorThrown){
				swal("Error !!",jqXHR,"error");
			},
			processData:false,
			contentType:false
		});
		 
	});
	
	
});