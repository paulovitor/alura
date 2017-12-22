import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import { Agendamento } from '../../domain/agendamento/agendamento';

@Injectable()
export class AgendamentoService {

    constructor(private _http: Http) { }

    agenda(agendamento: Agendamento) {
        let api: string = `https://aluracar.herokuapp.com/salvarpedido?carro=${agendamento.carro.nome}&nome=${agendamento.nome}&preco=${agendamento.valor}&endereco=${agendamento.endereco}&email=${agendamento.email}&dataAgendamento=${agendamento.data}`;
        return this._http
            .get(api)
            .toPromise();
    }

}