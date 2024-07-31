import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-owncomponent',
  templateUrl: './owncomponent.component.html',
  styleUrl: './owncomponent.component.css'
})
export class OwncomponentComponent {
  sum : number;
  sub : number;


  constructor(private calc:CalculatorService)
  {
    this.sum = calc.getAddition(10,20);
    this.sub = calc.getSubtraction(20,10);
  }
}
