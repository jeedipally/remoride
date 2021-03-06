import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';


@Injectable()
export class LoanRequestService {

  constructor(private http: Http) { }
  toggleLoan = false;

  toggleLoanForm(){
    this.toggleLoan = !this.toggleLoan;
    return this.toggleLoan;
  }


  submitForm(data: any[]){
    return this.http.post("http://localhost:8060/saveCustomer", data);
  }

  getLoanStatus(){
    return this.http.get("http://localhost:8060/getAllLoans");
  }
}
