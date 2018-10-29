import React from 'react';
import '../dist/LoginDm.css';
import { Link } from 'react-router-dom';

export default class HomeDM extends React.Component {
  redirectT() {
    this.props.history.push('/tamanio');
  }

  render() {
    return (
      <div>
        <div>
          <h1 className="title" align="center">Dolce Margarita</h1>
        </div>
        <div>
          <h3 className="subtitle colorWhite">Nuestra seleccion</h3>
        </div>
        <div>
          <div className="form-inline">
            <div align="center">
              <Link to="/tamanio">
                <img src="https://www.apertura.com/__export/1522099025954/sites/revistaap/img/2018/03/26/shutterstock_794054212.jpg_1913337537.jpg" alt="Huevos" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Huevos de chocolate</h5>
            </div>
            <div align="center">
              <Link to="/tipo">
                <img src="http://europabarbacoa.es/wp-content/uploads/2014/09/Figuras-de-Lego-de-chocolate-comestibles-1-1024x682.jpg" alt="Figuras" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Figuras de chocolate</h5>
            </div>
            <div align="center">
              <Link to="/tipo">
                <img src="https://t1.uc.ltmcdn.com/images/5/3/9/img_como_hacer_bombones_de_chocolate_con_licor_37935_600.jpg" alt="Bombones" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Bombones de chocolate</h5>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
