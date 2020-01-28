import { Component, OnInit } from '@angular/core';
import { ConvertService } from '../services/convert.service';

@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css']
})
export class Component1Component implements OnInit {
  upperName : string;
  constructor(public convertService : ConvertService) { }

  fun(txt : HTMLInputElement){
     this.upperName = this.convertService.convertToUpper(txt.value)
  }

  ngOnInit() {
  }

}
