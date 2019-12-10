import * as React from "react";
import Button from "react-bootstrap/Button";

class Tournament extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      tournamentName: "",
      startingDate: "",
      endingDate: "",
      game: "",
      organizer: "",
      city: "",
      prizePool: "",
      online: false
    };
  }
  render() {
    return (
      <form>
        <label>
          Nom du tournoi:
          <input type="text" value={this.state.tournamentName} />
        </label>
        <label>
          Date de début:
          <input type="date" value={this.state.startingDate} />
        </label>
        <label>
          Date de fin:
          <input type="date" value={this.state.endingDate} />
        </label>
        <label>
          Jeu:
          <input type="text" value={this.state.game} />
        </label>
        <label>
          Organisateur:
          <input type="text" value={this.state.organizer} />
        </label>
        <label>
          Ville:
          <input type="text" value={this.state.city} />
        </label>
        <label>
          Gain:
          <input type="text" value={this.state.prizepool} />
        </label>
        <label>
          En ligne:
          <input type="checkbox" value={this.state.online} />
        </label>
        <Button variant="primary" type="submit">
          Créer
        </Button>{" "}
      </form>
    );
  }
}
export default Tournament;
