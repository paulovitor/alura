import { Component } from '@angular/core';
import { NavController, NavParams, AlertController, Alert } from 'ionic-angular';

import { Carro } from '../../domain/carro/carro';
import { Agendamento } from '../../domain/agendamento/agendamento';
import { AgendamentoService } from '../../domain/agendamento/agendamento-service';

import { HomePage } from '../home/home';

import { Vibration } from '@ionic-native/vibration';
import { DatePicker } from '@ionic-native/date-picker';

@Component({
  templateUrl: 'cadastro.html',
})
export class CadastroPage {

  public carro: Carro;
  public precoTotal: number;
  public agendamento: Agendamento;
  private _alerta: Alert;

  constructor(public navCtrl: NavController,
    public navParams: NavParams,
    private _service: AgendamentoService,
    private _alertCtrl: AlertController,
    public vibration: Vibration,
    public datePicker: DatePicker) {

    this.carro = this.navParams.get('carro');
    this.precoTotal = this.navParams.get('precoTotal');
    this.agendamento = new Agendamento(this.carro, this.precoTotal);
    this._alerta = this._alertCtrl.create({
      title: 'Aviso',
      buttons: [{ text: 'OK', handler: () => { this.navCtrl.setRoot(HomePage) } }]
    });
  }

  agenda() {
    if (!this.agendamento.nome || !this.agendamento.email || !this.agendamento.endereco) {

      this.vibration.vibrate(500);

      this._alertCtrl.create({
        title: 'Preenchimento obrigatório',
        subTitle: 'Você deve preencher todas as informações',
        buttons: [{ text: 'OK' }]
      }).present();
      return;
    }

    this._service
      .agenda(this.agendamento)
      .then(confirmado => {
        confirmado ?
          this._alerta.setSubTitle('Agendamento realizado com sucesso.') :
          this._alerta.setSubTitle('Não foi possível realizar o agendamento!');
        this._alerta.present();
      })
      .catch(err => {
        console.log(err);
        this._alerta.setSubTitle(err.message);
        this._alerta.present();
      });
  }

  selecionaData() {
    this.datePicker
      .show({
        date: new Date(), 
        mode: 'date'
      })
      .then(data => this.agendamento.data = data.toISOString());
  }

}
