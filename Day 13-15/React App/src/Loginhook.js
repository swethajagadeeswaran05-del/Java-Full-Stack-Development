import React,{useState}from 'react'

export const Loginhook = () => {
    const[user,setUser]=useState("");
    const[pswd,setPswd]=useState("");  
    const[resultUser,setResultUser]=useState("");
    const[resultPswd,setResultPswd]=useState("");

    const myuser = "swe";
    const myps ="hello";

    const handleClick =()=>{
        setResultUser(user);
        setResultPswd(pswd);

        if(user === myuser && pswd === myps){
            alert("Login successful");
        }else{
            alert("Login Failed");
        }
    };
  return (
    <div style={{textAlign:"center",marginTop:"50px"}}>
        <input type="text" placeholder='Username' value={user} onChange={(e)=> setUser(e.target.value)}></input>
        <br/>
        <input type="password" placeholder='Password' value={pswd} onChange={(e)=> setPswd(e.target.value)}></input>
        <br/><br/>
        <button onClick={handleClick}>Login?</button>
        <h1>{resultUser}</h1>
        <h1>{resultPswd}</h1>
    </div>
  )
}
