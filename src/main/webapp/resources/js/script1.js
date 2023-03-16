function valideForm(){
	
	var name=document.getElementById("form:usuario").value;
	alert("goa");
	
	if (name == null || name == "") {
    alert("Please write de name");
    return false;
  }	
  
  return true;
	
	
}