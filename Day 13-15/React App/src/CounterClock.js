import React, { useState } from "react";

export const CounterClock = () => {
    const [count, setCount] = useState(0);

    function handleIncrease() {
        setCount(count + 1);
    }

 /*   function handleDecrease() {
        if (count > 0) {
            setCount(count - 1);
        }
    }
*/
    function handleReset() {
        setCount(0);
    }

    return (
        <div style={{ textAlign: "center", marginTop: "50px" }}>
            <h1> ⏱️ CounterClock</h1>

            <h2>{count}</h2>

            <button onClick={handleIncrease}>Increase</button>
            <button onClick={()=>setCount(count-1)}>Decrease</button>
            <button onClick={handleReset}>Reset</button>
        </div>
    );
};