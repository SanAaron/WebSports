import { Component } from '@angular/core';
import {ProductosService} from "../../services/productos.service";

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html'
})
export class PrincipalComponent {

    constructor(public _ps:ProductosService){
      
    }
}
