import React from 'react'
export const Greeting = (props)=>{
    return (
        <div>
            <h1> Hello ,{props.name}!</h1>
            <p>You are {props.age} Years Old.</p>
        </div>
    );
};

export const Props = () => {
  return (
    <div> 
        <Greeting name = "Swetha" age={19}/>
        <Greeting name = "Keerthi" age={25}/>
    </div>
  );
};
