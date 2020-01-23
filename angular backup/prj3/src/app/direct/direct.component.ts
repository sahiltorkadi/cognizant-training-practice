import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'direct',
  templateUrl: './direct.component.html',
  styleUrls: ['./direct.component.css']
})
export class DirectComponent implements OnInit {
name:string;
age:number;
email:string;
  constructor()
   {
this.name="abc";
this.age=23;
this.email="abc@gmail.com";

   }

changeval(){
this.name="xyz";
this.age=25;
this.email="xyz@gmail.com";

}
    
  ngOnInit() {
  }

}
