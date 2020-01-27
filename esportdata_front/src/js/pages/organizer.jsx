import * as React from 'react'
import Button from 'react-bootstrap/Button'

class Organizer extends React.Component {
  constructor(props) {
    super(props)

    this.state = {
      firstname: '',
      lastname: '',
      birthdate: '',
      email: '',
      pseudo: '',
    }
  }
  render() {
    return (
      <form>
        <label>
          Prénom:
          <input type="text" value={this.state.firstname} />
        </label>
        <label>
          Nom:
          <input type="date" value={this.state.lastname} />
        </label>
        <label>
          Date de naissance:
          <input type="date" value={this.state.birthdate} />
        </label>
        <label>
          email:
          <input type="text" value={this.state.email} />
        </label>
        <label>
          Pseudo:
          <input type="text" value={this.state.pseudo} />
        </label>
        <Button variant="primary" type="submit">
          Créer
        </Button>{' '}
      </form>
    )
  }
}
export default Organizer
