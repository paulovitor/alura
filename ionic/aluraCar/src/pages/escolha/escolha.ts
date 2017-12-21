import { Component } from '@angular/core';
import { NavParams } from 'ionic-angular';

@Component({
  selector: 'page-escolha',
  templateUrl: 'escolha.html',
})
export class EscolhaPage {

  public carro;

  constructor(public navParams: NavParams) {
    this.carro = this.navParams.get('carroSelecionado');
  }

}
