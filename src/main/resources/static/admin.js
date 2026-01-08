const deleteButtons = document.getElementsByClassName("delete")
const elements = [...deleteButtons]
elements.forEach((deleteButton) => {   
    deleteButton.addEventListener("click",async () =>{
        const blogId = deleteButton.parentElement.id
        await fetch(`http://localhost:8080/admin/${blogId}`,{
            method:"DELETE"
            
        })
        window.location.reload();
        
    })
} )

const editButtons = document.getElementsByClassName("edit");
const editElements = [...editButtons];

editElements.forEach((editButton)=>{
    editButton.addEventListener("click",()=>{
        const blogId = editButton.parentElement.id
        document.location = "http://localhost:8080/edit/${blogId}"

    })

})


