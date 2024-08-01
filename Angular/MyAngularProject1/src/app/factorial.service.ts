import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {

  getFactorial(num: number): number {
    if (num === 0 || num === 1) {
      return 1;
    } else {
      return num * this.getFactorial(num-1);
    }
      }
}
