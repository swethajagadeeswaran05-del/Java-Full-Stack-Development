import React from 'react'
import download from './download.jpeg';
export const Compute = () => {
    const n=300
    const handleClick=()=>{
        const msg=document.getElementById("res");
        msg.textContent="good Dog";
        msg.style.color="red";
    }

    const handlepict=()=>{
        const imgs=document.getElementById("pic");
        imgs.src="https://tinyurl.com/mt7kexm3"
    }
  return (<div>
   <h1>Event Handling:{n}</h1> 
   <button onClick={handleClick}>Click </button>
   <h1 onClick={handleClick} id="res">GOOD CAT</h1>
   <img src={download} onClick={handlepict} id="pic" alt='logo'/> 

   <h1 id="sub"></h1>
   </div>
  )
}

