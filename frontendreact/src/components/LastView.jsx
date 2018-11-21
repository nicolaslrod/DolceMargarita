import React from 'react';
import Ionicon from 'react-ionicons';
import '../dist/LoginDm.css';
import CreditCardInput from 'react-credit-card-input';


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
      <h4 align="center" className="colorWhite titleFinsh">Datos de Tarjeta</h4>

        <CreditCardInput  fieldClassName="input"     />
        <form>
            
            
          </form>
        <div>
        <h4 align="center" className="colorWhite titleFinsh">Datos de cliente</h4>
          <form>
            <label>
              Nombre:
    <input type="text" name="Nombre y Apellido" />
            </label>
           
          </form>

         < form>
            <label>
              Apellido:
    <input type="text" name="Nombre y Apellido" />
            </label>
           
          </form>
          

          <form>
            <label>
              E-Mail :
    <input type="text" name="Nombre y Apellido" />
            </label>
           
          </form>

         



          <form>
            <label>
              D.N.I  :
    <input type="number" name="Nombre y Apellido" />
            </label>
            
          </form>
          <form>
            <label>
              Telefono:
    <input type="number" name="Nombre y Apellido" />
            </label>
            
          </form>
          
          <label>
          <h4 align="center" className="colorWhite titleFinsh">Cantidad de productos</h4>
              Cantidad:
    <input type="number" name="Nombre y Apellido" />
            </label>
          <h4 align="center" className="colorWhite titleFinsh">Finalizar compra</h4>
          
         
        </div>
       
          
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
