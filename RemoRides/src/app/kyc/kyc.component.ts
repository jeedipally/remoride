import { Component, OnInit } from '@angular/core';

import {FormBuilder,FormGroup,FormControl,Validators,NgForm} from '@angular/forms'  


@Component({
  selector: 'app-kyc',
  templateUrl: './kyc.component.html',
  styleUrls: ['./kyc.component.css']
})
export class KycComponent implements OnInit {
 

  signupForm: FormGroup;

  constructor() { }

  ngOnInit() {
    this.signupForm = new FormGroup({
      id : new FormControl(''),
      loanId : new FormControl(''),
      name : new FormControl(''),
      incomeType: new FormControl(''),
      incomeAmount: new FormControl(''),
      houseType : new FormControl(''),
      salAmount : new FormControl('')
    })
  }

}
