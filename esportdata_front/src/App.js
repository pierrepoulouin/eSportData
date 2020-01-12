import React from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Header from "./js/components/header";
import Tournament from "./js/pages/tournament.jsx";

function App() {
  return (
    <div className="App">
      <Header />
      <Tournament />
    </div>
  );
}

export default App;
