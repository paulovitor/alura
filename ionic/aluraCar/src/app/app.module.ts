import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { EscolhaPage } from '../pages/escolha/escolha';
import { CadastroPage } from '../pages/cadastro/cadastro';
import { AgendamentosPage } from '../pages/agendamentos/agendamentos';
import { LoginPage } from '../pages/login/login';
import { PerfilPage } from '../pages/perfil/perfil';

import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

import { AgendamentoService } from '../domain/agendamento/agendamento-service';
import { AgendamentoDao } from '../domain/agendamento/agendamento-dao';
import { UsuarioService } from '../domain/usuario/usuario-service';

import { IonicStorageModule } from "@ionic/storage";

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    EscolhaPage,
    CadastroPage,
    AgendamentosPage,
    LoginPage,
    PerfilPage
  ],
  imports: [
    IonicModule.forRoot(MyApp),
    BrowserModule,
    HttpModule,
    IonicStorageModule.forRoot({
      name: 'aluracar',
      driverOrder: ['indexeddb']
    })
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    EscolhaPage,
    CadastroPage,
    AgendamentosPage,
    LoginPage,
    PerfilPage
  ],
  providers: [
    { provide: ErrorHandler, useClass: IonicErrorHandler },
    AgendamentoService,
    AgendamentoDao,
    UsuarioService
  ]
})
export class AppModule { }
