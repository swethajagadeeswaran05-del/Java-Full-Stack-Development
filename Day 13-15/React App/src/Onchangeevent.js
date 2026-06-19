import React from 'react'

export const Onchangeevent = () => {

  const handleClick = (e) => {
    const text = e.target.value;
    const r = document.getElementById("res");

    let output = "";
    
    for (let i = 1; i <= text.length; i++) {
      output += text.slice(0, i) + "<br>";
    }

    r.innerHTML = output;
  }

  return (
    <div>
      <input type="text" onChange={handleClick} />
      <h1 id="res"></h1>
    </div>
  )
}