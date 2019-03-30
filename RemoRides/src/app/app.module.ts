import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoanFormComponent } from './loan-form/loan-form.component';
import { KycComponent } from './kyc/kyc.component';
import { LoanRequestService } from './services/loan-request.service';


@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    LoanFormComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule
  ],
  providers: [LoanRequestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
