import React from 'react';
import '../dist/LoginDm.css';
import Carousel from 'nuka-carousel';
import Ionicon from 'react-ionicons';





class LoginDM extends React.Component {

  startHome() {
    this.props.history.push('/home');
  }


  renderImg(link, description) {
    return(
      <div align="center">
        <img src={link}  alt={description}/>
      </div>
    );
  }

  renderTitle(title) {
    return(
      <h1>
        {title}    
      </h1>
    );
  }

  renderTextForLogdinDM() {
    return(
      <h4 className="form-headin2">
        Dolce Margarita nace al 10 de julio de 2012 en la ciudad de Berazatefui, por iniciativa de Eli la mama de Belen.
        Fuimos inicialmente concebidos como un hobby, pero en el año 2013 decidimos emprender en la venta de chocolates, logrando de esta manera conformar una variada gama de productos para satisfacer la necesidad de ingerir azucar de nuestros clientes.
        Gradualmente nos fuimos expandiendo por todo el territorio de nuestro país, trayendo la mejor experiencia posible.
        Dolce Margarita no es solo chocolate, es una experiencia.
      </h4>
    );
  }

  renderButtonWithFunction(text) {
    return(
      <button
      className="btn-dm"
      type="button"
      onClick={() => this.startHome()}
    >
        {text}
    </button>
    );
  }

  renderCarousel() {
    return(
      <Carousel width="600px" wrapAround="true" transitionMode="fade" framePadding="10px">
          <img src='https://www.explorecornwallapp.com/media.ashx/counter-w_870_489.jpg' className="img-sizes" alt="Fabrica de chocolate" />
          <img src='https://schrammsflowers.com/wp-content/uploads/2017/12/chocolate.jpg' className="img-sizes" alt="Fabrica de chocolate" />
          <img src='https://i1.wp.com/www.noticiasbrown.com/wp-content/uploads/2018/03/chocolate-amargo.jpg?fit=645%2C429' className="img-sizes" alt="Fabrica de chocolate" />
      </Carousel> 
    );
    
  }

  renderContent() {
    return(
      <div className="loging-dm contenedor3">
        <div className="main-div">
          <div className="contenido3">
            {this.renderTitle('Dolce margarita')}
            {this.renderTextForLogdinDM()}
          </div>
          {this.renderButtonWithFunction('Empezar')}
        </div>
        {this.renderCarousel()}
      </div>
    );
  }

  renderFoot() {
    return(
      <div>
        <Ionicon icon="logo-facebook" />  
        <a href="https://www.facebook.com/dolce.margarita/" className="a">
          @dolce.margarita
        </a>
      </div>
    );
  }

  render() {
    return (
        <div>
          {this.renderImg
            ('https://cdn.discordapp.com/attachments/499372006782009345/513852433496014853/dmLOGO.png',
            'Logo de DM')}
          {this.renderContent()}
          {this.renderFoot()}
        </div>
    );
  }
}

export default LoginDM;
