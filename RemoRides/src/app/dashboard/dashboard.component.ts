import { Component, OnInit } from '@angular/core';
import { LoanRequestService } from '../services/loan-request.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor(private loanService: LoanRequestService) { }

  ngOnInit() {
  }

  formToggle(){
    this.loanService.toggleLoanForm();
    console.log(this.loanService.toggleLoan);
  }
}
