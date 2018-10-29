import React from 'react';
import Ionicon from 'react-ionicons';
import '../dist/LoginDm.css';

export default class LastView extends React.Component {
  finishSell() {
    return (
      <div>
        <h2>Su pedido se encuentra siendo procesado.
                Muchas Gracias por elegirnos
        </h2>
      </div>
    );
  }

  render() {
    return (
      <div align="center">
        <div>
          <h3 align="center" className="colorWhite titleFinsh">Finalizar compra</h3>
        </div>
        <span className="colorWhite">Aca deberia haber un selector para confirmar la cantiadad</span>
        <div>
          <button
            className="colorBotton"
            type="button"
            onClick={() => this.finishSell()}
          >
            <Ionicon icon="ios-cart" fontSize="35px" />
              Aceptar
          </button>
        </div>
      </div>
    );
  }
}
