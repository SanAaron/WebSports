import { Injectable } from '@angular/core';
import { Http } from "@angular/http";

@Injectable()
export class InformacionService {

  info: any = {};
  cargada: boolean = false;
  cargada_conocenos:boolean= false;
  equipo:any[]=[];

  constructor(public http: Http) {
    
    this.carga_info();
    this.conocenos();

  }

  public carga_info() {

    this.http.get("assets/data/info.pagina.json")
      .subscribe(data => {
        //console.log(data.json());
        this.cargada = true;
        this.info = data.json();
      })

  }
  public conocenos() {
    this.http.get("https://paginaweb-62bd6.firebaseio.com/equipo.json")
    .subscribe(data => {
     // console.log(data.json());
      this.cargada_conocenos = true;
      this.equipo = data.json();
    })

  }
}
