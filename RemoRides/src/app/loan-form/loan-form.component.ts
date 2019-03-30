import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
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
      name: new FormControl(''),
      income : new FormGroup({
        incomeType : new FormControl('')
      }),
      incomeAmount: new FormControl(),
      extLoans: new FormGroup({
        extLoan: new FormControl('')
      }),
      loanAmount: new FormControl()
    });

  }

  onSubmit(){
    console.log(this.loanForm);
    console.log(this.taken);
  }

}
