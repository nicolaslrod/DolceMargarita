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
                <img src="https://www.tiendasmayoristas.com/37405-thickbox_default/aroma-chocolate-con-leche.jpg" alt="Chocolate con leche" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Chocolate con leche</h5>
            </div>
            <div align="center">
              <Link to="/confirm">
                <img src="https://www.niter.com.uy/wp-content/uploads/2017/09/chocolate-blanco.png" alt="Chocolate blanco" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Chocolate blanco</h5>
            </div>
            <div align="center">
              <Link to="/confirm">
                <img src="https://srecetas.es/system/images/621/big_thumb.61251.jpg" alt="Chocolate semiamargo" className="rounded-circle" width="300" height="300" />
              </Link>
              <h5 className="colorWhite">Chocolate semiamargo</h5>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
