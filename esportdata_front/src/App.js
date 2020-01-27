import React from 'react'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css'
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'
import Header from './js/components/header'
import Tournament from './js/pages/tournament.jsx'
import Organizer from './js/pages/organizer.jsx'

class App extends React.Component {
  componentDidMount() {}

  render() {
    return (
      <Router>
        <Header />
        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <main className="main-wrapper">
          <Switch>
            <Route path="/organizer">
              <Organizer />
            </Route>
            <Route path="/">
              <Tournament />
            </Route>
          </Switch>
        </main>
      </Router>
    )
  }
}

// L'export par défault de notre fichier app.tsx est la class App qui a été extends par React
// Mon app peut être désormais importé dans d'autres fichiers de mon projet
export default App
