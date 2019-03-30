import { Component, OnInit, ElementRef } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { LoanRequestService } from '../services/loan-request.service';

@Component({
  selector: 'app-loan-form',
  templateUrl: './loan-form.component.html',
  styleUrls: ['./loan-form.component.css']
})
export class LoanFormComponent implements OnInit {

  constructor(private loanService: LoanRequestService) { }

  loanForm: FormGroup;

  taken = true;
 

  ngOnInit() {
    this.loanForm = new FormGroup({
      name: new FormControl('', [Validators.required]),
      income : new FormGroup({
        incomeType : new FormControl('s', [Validators.required])
      }),
      incomeAmount: new FormControl(),
      extLoans: new FormGroup({
        extLoan: new FormControl('y', [Validators.required])
      }),
      loanAmount: new FormControl()
    });
  }

  onSubmit(){
    
    this.loanForm.reset();
    this.loanForm.patchValue({extLoans :{extLoan :  'y'}, income: {incomeType : 's'}})
  }

  extLoanStatus(type){
    if(type === 'n'){
      this.taken = false;
    }else{
      this.taken = true;
    }
  }
  

}
