import React, { useState } from 'react';
export const Signin = () => {
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");
    const handleSignup = () => {
        const name = document.getElementById("name").value;
        const email = document.getElementById("email").value;
        const username = document.getElementById("username").value;
        const dob = document.getElementById("dob").value;
        if (
            !name ||
            !email ||
            !username ||
            !password ||
            !confirmPassword ||
            !dob
        ) {
            alert("Please fill all fields");
            return;
        }
        if (password !== confirmPassword) {
            alert("Password and Confirm Password do not match");
            return;
        }
        alert("Successfully Signed In");
    };
    return (
        <div style={{textAlign:'center',marginTop:"50px"}}>
            <input
                type="text"
                id="name"
                placeholder="Name"
                required
            />
            <br/><br/>
            <input
                type="number"
                id="mobile"
                placeholder="Mobile Number"
            />
            <br/><br/>
            <input
                type="email"
                id="email"
                placeholder="E-Mail Id"
                required
            /><br/><br/>
            <input
                type="text"
                id="username"
                placeholder="Username"
                required
            /><br/><br/>
            <input
                type="password"
                placeholder="Password"
                required
                minLength={8}
                maxLength={15}
                pattern="^(?=.*[0-9])(?=.*[~!@#$%^&*]).{8,15}$"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            /><br/><br/>
            <input
                type="password"
                placeholder="Confirm Password"
                required
                minLength={8}
                maxLength={15}
                value={confirmPassword}
                onChange={(e) => setConfirmPassword(e.target.value)}
            /><br/><br/>
            <input
                type="date"
                id="dob"
                required
            /><br/><br/>
            <button onClick={handleSignup}>
                Signup
            </button>
        </div>
    );
};