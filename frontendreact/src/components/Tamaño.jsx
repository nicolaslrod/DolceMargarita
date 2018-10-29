import React from 'react';
import '../dist/LoginDm.css';
import { Link } from 'react-router-dom';

export default class Tamanio extends React.Component {
  render() {
    return (
      <div>
        <div>
          <h1 className="title">Tamaños disponibles</h1>
        </div>
        <div>
          <div className="form-inline">
            <div align="center">
              <Link to="/tipo">
                <img src="https://scontent.faep9-2.fna.fbcdn.net/v/t1.0-9/28467857_759126207624353_8686825860143559365_n.jpg?_nc_cat=103&_nc_ht=scontent.faep9-2.fna&oh=0bde72e61bf081bd95815204db1f98a0&oe=5C49B885" alt="Tamaño grande" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Grandote</h5>
            </div>
            <div align="center">
              <Link to="/tipo">
                <img src="https://scontent.faep9-2.fna.fbcdn.net/v/t1.0-9/28379553_759116550958652_1200601793738299095_n.jpg?_nc_cat=106&_nc_ht=scontent.faep9-2.fna&oh=d33d0d8f116bc20b5c72149bbfa892c3&oe=5C431C9E" alt="Tamaño regular" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Regular</h5>
            </div>
            <div align="center">
              <Link to="/tipo">
                <img src="https://scontent.faep9-2.fna.fbcdn.net/v/t1.0-9/28576320_759115570958750_534834531780085583_n.jpg?_nc_cat=106&_nc_ht=scontent.faep9-2.fna&oh=af9f028c08290d7672827a399b50b4a1&oe=5C4FCA00" alt="Tamaño chico" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Chiquito</h5>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
