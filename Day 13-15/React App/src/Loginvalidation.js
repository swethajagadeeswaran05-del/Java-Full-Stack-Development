import React from 'react';

export const Loginvalidation = () => {

    const username = "admin";
    const password = "12345";

    const handleClick = () => {
        const enteredUser = document.getElementById("userid").value;
        const enteredPass = document.getElementById("psid").value;

        if (enteredUser === username && enteredPass === password) {
            alert("Login Successful");
        } else {
            if (enteredUser !== username && enteredPass !== password) {
            alert("Login Failed Due to Incorrect Username and Password");
        }else if(enteredPass!== password){
                alert("Login Failed Due to Incorrect Password");   
            }
            else{
                alert("Login Failed Due to Incorrect Username");  
            }
        }
    };

    return (
        <div style={{textAlign:"center",marginTop:"50px"}}>
            <label>Enter Name: </label>
            <input type="text" id="userid" />

            <br /><br />

            <label>Enter Password: </label>
            <input type="password" id="psid" />

            <br /><br />

            <button id="bt" onClick={handleClick}>
                Login
            </button>
        </div>
    );
};