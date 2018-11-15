import React from 'react';
import '../dist/LoginDm.css';


class LoginDM extends React.Component {
  startHome() {
    this.props.history.push('/home');
  }

  render() {
    return (
      <div>
        <div className="form-headin">
          <h1 align="Center">Dolce Margarita</h1>
        </div>
        <div className="login-form">
          <div className="main-div">
            <div>
              <h5 className="form-headin2">Dolce Margarita nace al 10 de julio de 2012 en la ciudad de Berazatefui, por iniciativa de Eli la mama de Belen.
                  Fuimos inicialmente concebidos como un hobby, pero en el año 2013 decidimos emprender en la venta de chocolates, logrando de esta manera conformar una variada gama de productos para satisfacer la necesidad de ingerir azucar de nuestros clientes.
                  Gradualmente nos fuimos expandiendo por todo el territorio de nuestro país, trayendo la mejor experiencia posible.
                  Dolce Margarita no es solo chocolate, es una experiencia.
              </h5>
            </div>
          </div>
          <button
            className="btn btn-primary form-headin2"
            type="button"
            onClick={() => this.startHome()}
          >
              Empezar
          </button>
        </div>
      </div>
    );
  }
}

export default LoginDM;
