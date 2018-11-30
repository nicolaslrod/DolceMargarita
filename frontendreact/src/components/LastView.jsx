import React from 'react';
import Ionicon from 'react-ionicons';
import '../dist/LoginDm.css';
import CreditCardInput from 'react-credit-card-input';

export default class LastView extends React.Component {

<<<<<<< HEAD
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
=======
  constructor(props) {
    super(props)

    this.state = {
      nombreCliente: "",
      apellidoCliente: "",
      emailCliente: "",
      dniCliente: null,
      telefonoCliente: null,
    };
>>>>>>> 4f7dc061c8aa2aa5e408e8265673615eaf70bc4f
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

<<<<<<< HEAD
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
          
=======
  setNombre = (nombre) => {
    this.setState({nombreCliente: nombre})
  }

  setNombre(apellido) {
    this.setState({apellidoCliente: apellido})
  }

  setEmail(email) {
    this.setState({emailCliente: email})
  }

  setDni(dni) {
    this.setState({dniCliente: dni})
  }

  setTelefono(telefono) {
    this.setState({telefonoCliente: telefono})
  }

  render() {
    return (
      <div>
        <h4 align="center" className="colorWhite titleFinsh">Datos de cliente</h4>
        <form>
          <label>
            Nombre:
          </label>
          <input type="text" name="nombre" value={this.state.nombreCliente} onChange={this.setNombre}/>  
        </form>

        < form>
          <label>
            Apellido:
          </label>
          <input type="text" name="apellido" value={this.state.apellidoCliente} onChange={this.setApellido}/>
        </form>
        
        <form>
          <label>
            E-Mail :
          </label>
          <input type="text" name="email" value={this.state.emailCliente} onChange={this.setEmail} />
        </form>

        <form>
>>>>>>> 4f7dc061c8aa2aa5e408e8265673615eaf70bc4f
          <label>
            D.N.I  :
          </label>
          <input type="number" name="dni" value={this.state.dniCliente} onChange={this.setDni} />  
        </form>

        <form>
          <label>
            Telefono:
          </label>
          <input type="number" name="telefono" value={this.state.telefonoCliente} onChange={this.setTelefono} />
        </form>
        
        <h4 align="center" className="colorWhite titleFinsh">Cantidad de productos</h4>
        <form>
          <label>
            Cantidad:
          </label>
          <input type="number" name="Nombre y Apellido" />
        </form>
            
        <h4 align="center" className="colorWhite titleFinsh">Finalizar compra</h4>
        
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
