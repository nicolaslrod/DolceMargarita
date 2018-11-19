import React from 'react';
import '../dist/LoginDm.css';
import { Link } from 'react-router-dom';
import API from '../service/api.js';

export default class HomeDM extends React.Component {
 
  constructor(){
    super();
    this.state = {
      formas: [],
    }
  }

  componentDidMount() {
    API.get('/formas')
      .then(response => this.setState({ formas: response }))
      .catch(console.log);
  }

  renderImg(link, description) {
    return(
      <div align="center">
        <img src={link}  alt={description}/>
      </div>
    );
  }

  renderItem(item) {
    return(
      <div align="center" className="padding">
          <Link to="/tamanio">
            <img src={item.img} alt="Huevos" width="300" height="300" />
          </Link>
          <h5>{item.nombre}</h5>
      </div>
    );
  }

  render() {
    return (
      <div>
        <div>
        {this.renderImg
            ('https://cdn.discordapp.com/attachments/499372006782009345/513852433496014853/dmLOGO.png',
            'Logo de DM')}
        </div>
        <div>
          <h3 className="subtitl">Nuestra seleccion</h3>
        </div>
        <div>
          <div className="flex">
            {this.state.formas.map( f => this.renderItem(f))}
          </div>
        </div>
      </div>
    );
  }
}
