import React from 'react';
import Ionicon from 'react-ionicons';
import '../dist/LoginDm.css';
import CreditCardInput from 'react-credit-card-input';


export default class LastView extends React.Component {

  constructor(proops){
    super(proops);
    this.state = 
    {
    datosCliente:{
      nombre: '',
      apellido: '',
      email: '',
      DNI: '',
      tel: '',
      cantidad: '',
      },
      url:{ 
        url:'',
      }  
    }
  }

  finishSell() {
    return (
      <div>
        <h2>Su pedido se encuentra siendo procesado.
                Muchas Gracias por elegirnos
        </h2>
      </div>
    );
  }

  handleChange(event) {
    this.setState({ datosCliente: event.target.value });
  }

  handleSubmit() {
    this.props.history.push(this.state.url.url);
  }


  render() {
    return (
      <div align="center">
        <div>
        <h4 align="center" className="colorWhite titleFinsh">bdalchmal halkcmhalshcrmflasfhclskafhmcasklhfcmlkashfmcklahmfca[klshmclkashmclskahmclkashmfclskafhmcsklahcml</h4>
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
