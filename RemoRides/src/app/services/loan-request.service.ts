import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoanRequestService {

  constructor() { }
  toggleLoan = false;


  toggleLoanForm(){
    this.toggleLoan = !this.toggleLoan;
  }
}
