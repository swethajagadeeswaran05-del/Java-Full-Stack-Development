import React from 'react'

export const StopWatch = () => {
  let n=0;
  function plus(){
    n++;
    document.getElementById("res").textContent=n;
  }
    function minus(){
    if (n > 0) {
    n--;
    document.getElementById("res").textContent=n;
       }
  }
  return (
    <div>
    <button onClick={plus} id="plus">+</button>
    <button onClick={minus} id="minus">-</button>
    <h1 id='res'>0</h1>
    </div>
  );
}