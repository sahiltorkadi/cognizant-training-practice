import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
num1:number;
num2:number;
res:number;

add(num1:HTMLInputElement,num2:HTMLInputElement,res:HTMLInputElement)
{
this.num1=parseInt(num1.value);
this.num2=parseInt(num2.value);
this.res=this.num1+this.num2;
}
sub(num1:HTMLInputElement,num2:HTMLInputElement,res:HTMLInputElement)
{
this.num1=parseInt(num1.value);
 this.num2=parseInt(num2.value);
 this.res=this.num1-this.num2;
}
mul(num1:HTMLInputElement,num2:HTMLInputElement,res:HTMLInputElement)
{
this.num1=parseInt(num1.value);
this.num2=parseInt(num2.value);
this.res=this.num1*this.num2;
}
div(num1:HTMLInputElement,num2:HTMLInputElement,res:HTMLInputElement)
{
  this.num1=parseInt(num1.value);
  this.num2=parseInt(num2.value);
  this.res=this.num1/this.num2;
}
clear(num1:HTMLInputElement,num2:HTMLInputElement,res:HTMLInputElement)
{
 num1.value=" ";
 num2.value=" ";
 res.value="";
}
  ngOnInit() {
  }

}
