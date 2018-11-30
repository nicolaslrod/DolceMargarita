import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../dist/buyProduct.css';
import API from '../service/api.js';
import Header from './Header.jsx';
import Ionicon from 'react-ionicons';


export default class BuyProduct extends React.Component {

    constructor(proops) {
        super(proops);
        this.state = {
            product: '',
            forma: '',
            quantity: 0,
            quantityInQuaters: 250,
            quantityInQuatersDecimal: 0.250,
        };
    }

    componentDidMount() {
        API.get(`/product/${this.props.match.params.type}`)
            .then(response => this.setState({ product: response }))
            .catch(console.log('Error ggg'));
    }

    renderContent() {
        const type = this.props.match.params.type.toString().toLowerCase();
        switch(type) {
            
            case 'bombones':
                return this.renderContentBombones();

            case 'figuras':
                return this.renderContentFiguras();

            default:
                return this.renderContentHuevos();
        }
    }

    renderTitile() {
        return(
            <h1>{
                this.firstUppserCase(this.props.match.params.type)
                +this.props.match.params.type.substr(1, this.props.match.params.type.lenght)
            }</h1>
        );
    }

    firstUppserCase(string) {
        return this.props.match.params.type.charAt(0).toUpperCase();
    }

    renderContentBombones() {
        return(
            <div>
                {this.renderTitile()}
                <div className="displayFlex">
                    {this.renderBombonesInfoAndImg()}
                </div>
            </div>
        );
    }

    renderContentFiguras() {
        return(
            <div>
                {this.renderTitile()}
                <div className="displayFlex">
                    {this.renderFigurasInfoAndImg()}
                </div>
            </div>
        );
    }

    renderContentHuevos() {
        return(
            <div>
                {this.renderTitile()}
                <div className="displayFlex container">
                    {this.renderHuevosInfoAndImg()}
                </div>
            </div>
        );
    }

    renderUnits() {
        return this.props.match.params.type.toLowerCase() === 'bombones' ? this.renderQuartersOrKg() : 'Uds'
    }

    renderQuantity() {
        return this.props.match.params.type.toLowerCase() === 'bombones' ? this.renderQuartersOrKgWithComa() : this.state.quantity
    }

    renderQuartersOrKg() {
        return this.state.quantityInQuaters >= 1000? 'Kgr': 'Gr'
    }

    renderQuartersOrKgWithComa() {
        return this.state.quantityInQuaters >= 1000?  this.state.quantityInQuatersDecimal : this.state.quantityInQuaters
    }


    renderStateOfQuantity() {
        return (
            <div>
                <span className="spanC">{this.renderQuantity()} {this.renderUnits()}</span>
            </div>
        );
    }

    addQuantity() {
        if(this.props.match.params.type.toLowerCase() === 'bombones') {
            this.setState({ quantityInQuatersDecimal: this.state.quantityInQuatersDecimal + 0.250})
            this.setState({ quantityInQuaters: this.state.quantityInQuaters + 250})
        }
        else {
            this.setState({ quantity: this.state.quantity + 1})
        }
    }

    removeQuantity() {
        if(this.props.match.params.type.toLowerCase() === 'bombones') {
            if(this.state.quantityInQuaters > 250) {
                this.setState({ quantityInQuaters: this.state.quantityInQuaters - 250})
                this.setState({ quantityInQuatersDecimal: this.state.quantityInQuatersDecimal - 0.250})
            }
        }
        else {
           if(this.state.quantity > 0) this.setState({ quantity: this.state.quantity - 1})
        }
    }

    renderCounter() {
        return(
            <div className="displayFlex">
                <button type="button" className="btn btn-outline-warning" onClick={()=> (this.addQuantity())}>
                    <Ionicon icon="ios-add-circle" color="goldenrod" fontSize="35px" />
                </button>
                {this.renderStateOfQuantity()}
                <button type="button" className="btn btn-outline-warning" onClick={()=> (this.removeQuantity())}>
                    <Ionicon icon="ios-remove-circle" color="goldenrod" fontSize="35px" />
                </button>
            </div>
        );
    }

    renderBombonesInfoAndImg() {
        return (
            <div className="row"> 
                {this.renderImg()}
                {this.renderInfoBombon()}
            </div>
        );
    }

    renderInfoBombon() {
        return (
            <div className="col">
                <h5><span>
                    Bombones finos surtidos de chocolates blanco,
                    chocolate con leche y semi-amargo
                    </span></h5>
                <div>
                    {this.renderCounter()}
                    {this.renderButtonToConfirm()}
                </div>
            </div>
        );
    }

    renderButtonToConfirm() {
        return(
            <div>
                <button type="button" className="btn btn-block bt-color" onClick={()=> (this.redirect())}>
                    <span>AñADIR A CARRITO</span>
                </button>
            </div>
        );
    }

    renderImg() {
        return (
            <div className="col">
                <img src={"https://t1.uc.ltmcdn.com/images/5/3/9/img_como_hacer_bombones_de_chocolate_con_licor_37935_600.jpg"} height="300px" alt="producto selescionado" />
            </div>
        );
    }

    render() {
        return (
            <main >
                <Header />
                {this.renderContent()}
            </main>
        );
    }


}