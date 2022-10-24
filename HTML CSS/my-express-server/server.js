

const express = require("express");

const app = express();

app.get("/", function(req, res) {
    // console.log(request); 
    response.send("<h1>Hello World</h1>");
});

app.get("/contact", function(req, res){
    res.send("Contact Me Baby");
});

app.get("/about", function(req, res){
 res.send("My Name is Errol Okay ");   
})

app.listen(3000, function () {
    console.log('Server running at http://localhost:3000');
});