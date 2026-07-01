import logo from './logo.svg';
import './App.css';
import App1 from './App1'; 
import {Compute} from './Compute'
export const App=()=> {
  return (
    <div
      style={{
        backgroundColor: 'pink',
        minHeight: '100vh'
      }}
    >
      <h1>This is my First React App</h1>
      <h1>Hello How are You??</h1>
      <img
        src="https://tinyurl.com/mt7kexm3"
        alt="Logo"
        width="250" height="250"
      />
      <h2>
      Helloo
      </h2>
      <App1 />
      <Compute/>
    </div>
  );
}
                                