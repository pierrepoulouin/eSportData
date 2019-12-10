import React from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Tournament from "./js/pages/tournament.jsx";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Tournament />
      </header>
    </div>
  );
}

export default App;
