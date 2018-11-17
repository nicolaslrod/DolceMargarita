import React from 'react';
import '../dist/LoginDm.css';
import { Link } from 'react-router-dom';

export default class Tipo extends React.Component {
  render() {
    return (
      <div>
        <div>
          <h1 className="title">Tipos de chocolate</h1>
        </div>
        <div>
          <div className="form-inline">
            <div align="center">
              <Link to="/confirm">
                <img src="https://scontent.faep5-1.fna.fbcdn.net/v/t1.0-9/42387509_890398297830476_1299436836371824640_n.jpg?_nc_cat=100&_nc_ht=scontent.faep5-1.fna&oh=f88f693afc1d462533105be9034d4954&oe=5CB0C507" alt="Chocolate con leche" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Zapato - Cartera en chocolate Blanco</h5>
            </div>
            <div align="center">
              <Link to="/confirm">
                <img src="https://scontent.faep5-1.fna.fbcdn.net/v/t1.0-9/42465014_890398401163799_8370310975462572032_n.jpg?_nc_cat=109&_nc_ht=scontent.faep5-1.fna&oh=afe38b3b2121d474629b96ef6f361fc9&oe=5C83D0D1" alt="Chocolate blanco" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Iphone de Chocolate</h5>
            </div>
            <div align="center">
              <Link to="/confirm">
                <img src="https://scontent.faep5-1.fna.fbcdn.net/v/t1.0-9/42363042_890398131163826_3402577601330413568_n.jpg?_nc_cat=109&_nc_ht=scontent.faep5-1.fna&oh=1a6d0fe8e2daf2463c606702bec59b82&oe=5C6419B9" alt="Chocolate semiamargo" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Zapato - Cartera en chocolate Blanco</h5>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
